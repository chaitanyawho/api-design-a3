package edu.cmu.cs.mse.client;

import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CommentWithRepliesInfo;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.Post;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

	private final RedditClient redditClient;

	public ClientService(RedditClient redditClient) {

		this.redditClient = redditClient;
	}

	public Comment highLevelFunction(String pid) {
		// Retrieve a post
		GetPostResponse postResponse = redditClient.getPost(pid);
		Post post = postResponse.getPost();

		// Retrieve most upvoted comments under the post
		GetMostUpvotedCommentsResponse getMostUpvotedCommentsResponse =
			redditClient.getMostUpvotedComments(post);
		List<CommentWithRepliesInfo> topComments = getMostUpvotedCommentsResponse.getTopCommentsInfoList();
		if (topComments.isEmpty()) {
			return null;
		}
		// Expand the most upvoted comment
		ExpandCommentBranchResponse expandCommentBranchResponse = redditClient.getExpandCommentBranchResponse(
			topComments);

		// Return the most upvoted reply under the most upvoted comment, or None if there are no comments or
		// no replies under the most upvoted one.
		if (expandCommentBranchResponse.getRepliesCount() == 0) {
			return null;
		}
		return expandCommentBranchResponse.getReplies(0).getComment();
	}


}
