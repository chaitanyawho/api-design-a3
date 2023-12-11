package edu.cmu.cs.mse.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment.CommentState;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CommentWithRepliesInfo;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.RootLevelExpandedComments;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentServiceGrpc.CommentServiceBlockingStub;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.Post;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostServiceGrpc.PostServiceBlockingStub;
import java.time.Instant;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ClientServiceTest {

	@InjectMocks
	ClientService clientService;

	@Mock
	PostServiceBlockingStub postServiceBlockingStub;

	@Mock
	CommentServiceBlockingStub commentServiceBlockingStub;

	/**
	 * This test verifies if the API calls to the server are made
	 */
	@Test
	void highLevelFunction() {
		when(this.postServiceBlockingStub.getPost(any(GetPostRequest.class))).thenReturn(
			GetPostResponse.newBuilder()
				.setPost(Post.newBuilder()
					.setId("post123")
					.buildPartial())
				.buildPartial()
		);
		when(this.commentServiceBlockingStub.getMostUpvotedComments(any(
			GetMostUpvotedCommentsRequest.class))).thenReturn(
			GetMostUpvotedCommentsResponse.newBuilder()
				.addAllTopCommentsInfo(
					List.of(CommentWithRepliesInfo.newBuilder()
						.setComment(Comment.newBuilder().setId("comment003121"))
						.buildPartial()))
				.buildPartial()
		);
		when(this.commentServiceBlockingStub.expandCommentBranch(
			any(ExpandCommentBranchRequest.class)))
			.thenReturn(ExpandCommentBranchResponse.newBuilder()
				.setComment(Comment.newBuilder().setId("comment003121")
					.buildPartial())
				.addAllReplies(List.of(RootLevelExpandedComments.newBuilder().
					setComment(Comment.newBuilder()
						.setId("comment003122")
						.setText("I am always wrong")
						.setPublicationDate(Instant.EPOCH.getEpochSecond())
						.setState(CommentState.NORMAL)
						.setAuthorId("userD")
						.setScore(-2)
						.setParentId("comment003121")
						.build()).buildPartial()))
				.buildPartial());

		assertEquals(Comment.newBuilder()
				.setId("comment003122")
				.setText("I am always wrong")
				.setPublicationDate(Instant.EPOCH.getEpochSecond())
				.setState(CommentState.NORMAL)
				.setAuthorId("userD")
				.setScore(-2)
				.setParentId("comment003121")
				.build(),
			this.clientService.highLevelFunction("pid"));
	}
}