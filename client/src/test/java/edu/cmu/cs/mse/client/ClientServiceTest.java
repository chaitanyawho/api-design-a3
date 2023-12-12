package edu.cmu.cs.mse.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment.CommentState;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CommentWithRepliesInfo;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.RootLevelExpandedComments;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.Post;
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

	//API client that implements functionality to make requests to the gRPC server
	@Mock
	RedditClient redditClient;

	/**
	 * This test verifies if the API calls to the server are made
	 */
	@Test
	void highLevelFunction() {
		when(this.redditClient.getPost(any(String.class))).thenReturn(
			GetPostResponse.newBuilder()
				.setPost(Post.newBuilder()
					.setId("post123")
					.buildPartial())
				.buildPartial()
		);
		when(this.redditClient.getMostUpvotedComments(any(
			Post.class))).thenReturn(
			GetMostUpvotedCommentsResponse.newBuilder()
				.addAllTopCommentsInfo(
					List.of(CommentWithRepliesInfo.newBuilder()
						.setComment(Comment.newBuilder().setId("comment003121"))
						.buildPartial()))
				.buildPartial()
		);
		when(this.redditClient.getExpandCommentBranchResponse(
			anyList()))
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