package edu.cmu.cs.mse.servergrpc.repositories;

import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.Post;
import edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.Post.PostState;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {

	Random random = new Random();
	List<Post> posts =
		IntStream.range(0, 10).mapToObj(i -> Post.newBuilder()
			.setId("post12" + i)
			.setTitle("Title " + i)
			.setText("Text " + i)
			.setContentUrl("http://example.com/post/" + i)
			.setAuthorId(UUID.randomUUID().toString())
			.setScore(random.nextInt(100))
			.setState(PostState.forNumber(new Random().nextInt(3)))
			.setPublicationDate(Instant.now().getEpochSecond())
			.setSubredditName(i % 2 == 0 ? "programming" : "science")
			.build()).collect(Collectors.toList());

	public boolean addPost(Post post) {
		return posts.add(post);
	}

	public Optional<Post> findById(String id) {
		return this.posts.stream().filter(p -> p.getId().equals(id)).findFirst();
	}

	public Post updateScore(String id, int score) {
		Post post = this.posts.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
		posts.remove(post);
		posts.add(post.toBuilder().setScore(score).build());
		return this.posts.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();

	}
}
