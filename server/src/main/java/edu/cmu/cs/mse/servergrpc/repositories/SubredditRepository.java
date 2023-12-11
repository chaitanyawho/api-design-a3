package edu.cmu.cs.mse.servergrpc.repositories;

import edu.cmu.cs.mse.apidesigna3.grpc.subreddit.SubredditOuterClass.Subreddit;
import java.util.List;

public class SubredditRepository {

	List<Subreddit> subreddits = List.of(
		Subreddit.newBuilder()
			.setName("programming")
			.setState(Subreddit.SubredditState.PUBLIC)
			.addTags("coding")
			.addTags("java")
			.addTags("python")
			.build(),
		Subreddit.newBuilder()
			.setName("gaming")
			.setState(Subreddit.SubredditState.PRIVATE)
			.addTags("videogames")
			.addTags("consoles")
			.build(),
		Subreddit.newBuilder()
			.setName("science")
			.setState(Subreddit.SubredditState.HIDDEN)
			.addTags("physics")
			.addTags("biology")
			.build()
	);

}
