package edu.cmu.cs.mse.client;

import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CommentWithRepliesInfo;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentServiceGrpc;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentServiceGrpc.CommentServiceBlockingStub;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.Post;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostServiceGrpc;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostServiceGrpc.PostServiceBlockingStub;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

	private final PostServiceGrpc.PostServiceBlockingStub postServiceBlockingStub;

	private final CommentServiceGrpc.CommentServiceBlockingStub commentServiceBlockingStub;

	public ClientService(PostServiceBlockingStub postServiceBlockingStub,
		CommentServiceBlockingStub commentServiceBlockingStub) {
		this.postServiceBlockingStub = postServiceBlockingStub;

		this.commentServiceBlockingStub = commentServiceBlockingStub;
	}

	public Comment highLevelFunction(String pid) {
		// Retrieve a post
		GetPostResponse postResponse = postServiceBlockingStub.getPost(GetPostRequest.newBuilder()
			.setPostId(pid)
			.build());
		Post post = postResponse.getPost();

		// Retrieve most upvoted comments under the post
		GetMostUpvotedCommentsResponse getMostUpvotedCommentsResponse =
			commentServiceBlockingStub.getMostUpvotedComments(
				GetMostUpvotedCommentsRequest.newBuilder()
					.setPostId(post.getId())
					.setNumComments(3)
					.build());
		List<CommentWithRepliesInfo> topComments = getMostUpvotedCommentsResponse.getTopCommentsInfoList();
		if (topComments.isEmpty()) {
			return null;
		}
		// Expand the most upvoted comment
		ExpandCommentBranchResponse expandCommentBranchResponse = commentServiceBlockingStub
			.expandCommentBranch(ExpandCommentBranchRequest
				.newBuilder()
				.setCommentId(topComments.get(0).getComment().getId())
				.setNumTopComments(3)
				.build());

		// Return the most upvoted reply under the most upvoted comment, or None if there are no comments or
		// no replies under the most upvoted one.
		if (expandCommentBranchResponse.getRepliesCount() == 0) {
			return null;
		}
		return expandCommentBranchResponse.getReplies(0).getComment();
	}
}
