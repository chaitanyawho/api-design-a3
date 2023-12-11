package edu.cmu.cs.mse.servergrpc.services;

import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.Post;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostServiceGrpc;
import edu.cmu.cs.mse.servergrpc.repositories.PostRepository;
import io.grpc.stub.StreamObserver;
import java.time.Instant;
import java.util.Optional;
import java.util.Random;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PostService extends PostServiceGrpc.PostServiceImplBase {


	private final PostRepository postRepository;

	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@Override
	public void createPost(CreatePostRequest createPostRequest,
		StreamObserver<CreatePostResponse> responseStreamObserver) {
		responseStreamObserver.onNext(this.createPost(createPostRequest));
		responseStreamObserver.onCompleted();
	}

	@Override
	public void votePost(VotePostRequest votePostRequest,
		StreamObserver<VotePostResponse> responseStreamObserver) {
		responseStreamObserver.onNext(this.votePost(votePostRequest));
		responseStreamObserver.onCompleted();
	}

	@Override
	public void getPost(GetPostRequest getPostRequest,
		StreamObserver<GetPostResponse> responseStreamObserver) {
		responseStreamObserver.onNext(this.getPost(getPostRequest));
		responseStreamObserver.onCompleted();
	}

	private CreatePostResponse createPost(CreatePostRequest createPostRequest) {
		Post newPost = Post.newBuilder()
			.setText(createPostRequest.getText())
			.setTitle(createPostRequest.getTitle())
			.setId("post12" + new Random().nextInt(100))
			.setAuthorId(createPostRequest.getAuthorId())
			.setContentUrl(createPostRequest.getContentUrl())
			.setPublicationDate(Instant.now().getEpochSecond())
			.setScore(0)
			.setSubredditName(createPostRequest.getSubredditName())
			.setState(Post.PostState.valueOf(createPostRequest.getState().name()))
			.build();
		boolean success = this.postRepository.addPost(
			newPost
		);
		return CreatePostResponse.newBuilder().setPost(newPost).setSuccess(success).build();
	}

	private VotePostResponse votePost(VotePostRequest votePostRequest) {
		Optional<Post> post = this.postRepository.findById(votePostRequest.getPostId());
		return post.map(value -> VotePostResponse.newBuilder()
				.setSuccess(true)
				.setPost(this.postRepository.updateScore(votePostRequest.getPostId(),
					value.getScore() + (votePostRequest.getUpvote() ? 1 : -1)))
				.build())
			.orElseGet(() -> VotePostResponse.newBuilder().setSuccess(false).build());
	}

	private GetPostResponse getPost(GetPostRequest getPostRequest) {
		return GetPostResponse.newBuilder()
			.setPost(this.postRepository.findById(getPostRequest.getPostId()).orElseThrow())
			.build();
	}


}
