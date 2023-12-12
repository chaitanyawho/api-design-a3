package edu.cmu.cs.mse.client;

import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CommentWithRepliesInfo;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentServiceGrpc;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.Post;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostServiceGrpc;
import io.grpc.ManagedChannel;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RedditClient {

	private final PostServiceGrpc.PostServiceBlockingStub postServiceBlockingStub;

	private final CommentServiceGrpc.CommentServiceBlockingStub commentServiceBlockingStub;

	public RedditClient(ManagedChannel channel) {
		this.postServiceBlockingStub = PostServiceGrpc.newBlockingStub(channel);
		this.commentServiceBlockingStub = CommentServiceGrpc.newBlockingStub(channel);
	}

	public ExpandCommentBranchResponse getExpandCommentBranchResponse(
		List<CommentWithRepliesInfo> topComments) {
		return commentServiceBlockingStub
			.expandCommentBranch(ExpandCommentBranchRequest
				.newBuilder()
				.setCommentId(topComments.get(0).getComment().getId())
				.setNumTopComments(3)
				.build());
	}

	public GetMostUpvotedCommentsResponse getMostUpvotedComments(Post post) {
		return commentServiceBlockingStub.getMostUpvotedComments(
			GetMostUpvotedCommentsRequest.newBuilder()
				.setPostId(post.getId())
				.setNumComments(3)
				.build());
	}

	public GetPostResponse getPost(String pid) {
		return postServiceBlockingStub.getPost(GetPostRequest.newBuilder()
			.setPostId(pid)
			.build());
	}

	public VoteCommentResponse voteCommentResponse(String commentId, boolean upvote) {
		return this.commentServiceBlockingStub.voteComment(VoteCommentRequest.newBuilder()
			.setCommentId(commentId)
			.setUpvote(upvote)
			.build());
	}

	public VotePostResponse votePostResponse(String postId, boolean upvote) {
		return this.postServiceBlockingStub.votePost(VotePostRequest.newBuilder()
			.setPostId(postId)
			.setUpvote(upvote)
			.build());
	}


}
