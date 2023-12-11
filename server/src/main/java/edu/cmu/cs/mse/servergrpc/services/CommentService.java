package edu.cmu.cs.mse.servergrpc.services;

import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment.CommentState;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CommentWithRepliesInfo;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.RootLevelExpandedComments;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentServiceGrpc;
import edu.cmu.cs.mse.servergrpc.repositories.CommentRepository;
import io.grpc.stub.StreamObserver;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CommentService extends CommentServiceGrpc.CommentServiceImplBase {

	private final CommentRepository commentRepository;

	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	@Override
	public void createComment(CreateCommentRequest request,
		StreamObserver<CreateCommentResponse> responseStreamObserver) {
		responseStreamObserver.onNext(this.createComment(request));
		responseStreamObserver.onCompleted();
	}

	@Override
	public void voteComment(VoteCommentRequest voteCommentRequest,
		StreamObserver<VoteCommentResponse> responseStreamObserver) {
		responseStreamObserver.onNext(this.voteComment(voteCommentRequest));
		responseStreamObserver.onCompleted();
	}

	@Override
	public void getMostUpvotedComments(GetMostUpvotedCommentsRequest request,
		StreamObserver<GetMostUpvotedCommentsResponse> responseStreamObserver) {
		responseStreamObserver.onNext(this.getMostUpvotedComments(request));
		responseStreamObserver.onCompleted();
	}

	@Override
	public void expandCommentBranch(ExpandCommentBranchRequest expandCommentBranchRequest,
		StreamObserver<ExpandCommentBranchResponse> responseStreamObserver) {
		responseStreamObserver.onNext(this.expandCommentBranch(expandCommentBranchRequest));
		responseStreamObserver.onCompleted();
	}

	private CreateCommentResponse createComment(CreateCommentRequest request) {
		Comment comment = Comment.newBuilder()
			.setId("c0099" + new Random().nextInt(100))
			.setText(request.getText())
			.setAuthorId(request.getAuthorId())
			.setScore(0)
			.setPublicationDate(Instant.now().getEpochSecond())
			.setParentId(request.getParentId())
			.setState(CommentState.NORMAL)
			.build();
		commentRepository.addComment(comment);
		return CreateCommentResponse.newBuilder().setComment(comment).setSuccess(true).build();
	}

	private VoteCommentResponse voteComment(VoteCommentRequest voteCommentRequest) {
		Optional<Comment> post = this.commentRepository.findById(voteCommentRequest.getCommentId());

		return post.map(value -> VoteCommentResponse.newBuilder()
				.setSuccess(true)
				.setComment(this.commentRepository.updateScore(voteCommentRequest.getCommentId(),
					value.getScore() + (voteCommentRequest.getUpvote() ? 1 : -1)))
				.build())
			.orElseGet(() -> VoteCommentResponse.newBuilder().setSuccess(false).build());
	}

	private GetMostUpvotedCommentsResponse getMostUpvotedComments(
		GetMostUpvotedCommentsRequest request) {
		String postId = request.getPostId();

		int numberOfComments = request.getNumComments();

		List<CommentWithRepliesInfo> topCommentsInfo = commentRepository.findTopNByParentWithRepliesInfo(
			postId, numberOfComments);

		return GetMostUpvotedCommentsResponse.newBuilder().addAllTopCommentsInfo(topCommentsInfo)
			.build();
	}

	private ExpandCommentBranchResponse expandCommentBranch(ExpandCommentBranchRequest request) {
		String commentId = request.getCommentId();
		int numberOfTopComments = request.getNumTopComments();

		List<RootLevelExpandedComments> rootComments = commentRepository.findTopNByParent(
				commentId, numberOfTopComments)
			.stream()
			.map(comment ->
				RootLevelExpandedComments.newBuilder()
					.setComment(comment)
					.addAllReplies(
						commentRepository.findTopNByParentWithRepliesInfo(comment.getId(),
							numberOfTopComments))
					.build())
			.toList();

		return ExpandCommentBranchResponse.newBuilder()
			.setComment(commentRepository.findById(commentId).orElseThrow())
			.addAllReplies(rootComments).build();
	}

}
