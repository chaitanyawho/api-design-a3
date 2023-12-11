package edu.cmu.cs.mse.servergrpc.repositories;

import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.Comment.CommentState;
import edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CommentWithRepliesInfo;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {

	private final List<Comment> comments = new ArrayList<>(List.of(
		Comment.newBuilder()
			.setId(String.valueOf(UUID.randomUUID()))
			.setText("This is an insightful comment.")
			.setAuthorId("user123")
			.setScore(50)
			.setParentId("post789")
			.setState(CommentState.NORMAL)
			.setPublicationDate(Instant.now().toEpochMilli())
			.build(),

		Comment.newBuilder()
			.setId("c001")
			.setText("Interesting perspective? Thanks for sharing!")
			.setAuthorId("user456")
			.setScore(35)
			.setParentId("post123")
			.setState(CommentState.NORMAL)
			.setPublicationDate(Instant.now().toEpochMilli())
			.build(),

		Comment.newBuilder()
			.setId("c002")
			.setText("I strongly disagree with this.")
			.setAuthorId("user789")
			.setScore(20)
			.setParentId("post123")
			.setState(CommentState.NORMAL)
			.setPublicationDate(Instant.now().toEpochMilli())
			.build(),
		Comment.newBuilder()
			.setId(String.valueOf(UUID.randomUUID()))
			.setText("This is not an insightful comment.")
			.setAuthorId("user123")
			.setScore(10)
			.setParentId("post789")
			.setState(CommentState.NORMAL)
			.setPublicationDate(Instant.now().toEpochMilli())
			.build(),

		Comment.newBuilder()
			.setId(String.valueOf(UUID.randomUUID()))
			.setText("Interesting perspective. Thanks for sharing!")
			.setAuthorId("user456")
			.setScore(100)
			.setParentId("c002")
			.setState(CommentState.NORMAL)
			.setPublicationDate(Instant.now().toEpochMilli())
			.build(),

		Comment.newBuilder()
			.setId(String.valueOf(UUID.randomUUID()))

			.setText("I strongly disagree with this!")
			.setAuthorId("user789")
			.setScore(20)
			.setParentId("c001")
			.setState(CommentState.NORMAL)
			.setPublicationDate(Instant.now().toEpochMilli())
			.build(),
		Comment.newBuilder()
			.setId(String.valueOf(UUID.randomUUID()))
			.setText("This is wrong")
			.setAuthorId("user123")
			.setScore(50)
			.setParentId("c001")
			.setState(CommentState.NORMAL)
			.setPublicationDate(Instant.now().toEpochMilli())
			.build(),

		Comment.newBuilder()
			.setId("c0011")
			.setText("Interesting perspective. Thanks for sharing!")
			.setAuthorId("user456")
			.setScore(30)
			.setParentId("post123")
			.setState(CommentState.NORMAL)
			.setPublicationDate(Instant.now().toEpochMilli())
			.build(),

		Comment.newBuilder()
			.setId("c0021")
			.setText("I am always right")
			.setAuthorId("user789")
			.setScore(20)
			.setParentId("c002")
			.setState(CommentState.NORMAL)
			.setPublicationDate(Instant.now().toEpochMilli())
			.build()

	));

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public Optional<Comment> findById(String id) {
		return this.comments.stream().filter(p -> p.getId().equals(id)).findFirst();
	}

	public Comment updateScore(String commentId, int score) {
		Comment comment = this.comments.stream().filter(p -> p.getId().equals(commentId))
			.findFirst()
			.orElseThrow();
		comments.remove(comment);
		comments.add(comment.toBuilder().setScore(score).build());
		return this.comments.stream().filter(p -> p.getId().equals(commentId)).findFirst()
			.orElseThrow();
	}


	public List<CommentWithRepliesInfo> findTopNByParentWithRepliesInfo(String parentId, int n) {
		return findTopNByParent(parentId, n).stream()
			.map(comment ->
				CommentWithRepliesInfo
					.newBuilder()
					.setComment(comment)
					.setHasReplies(this.comments.stream()
						.anyMatch(c -> c.getParentId().equals(comment.getId())))
					.build())
			.limit(n)
			.toList();
	}

	public List<Comment> findTopNByParent(String parentId, int n) {
		return comments.stream()
			.filter(comment -> comment.getParentId().equals(parentId))
			.sorted(Comparator.comparing(Comment::getScore).reversed())
			.limit(n)
			.toList();
	}
}
