package edu.cmu.cs.mse.client;

import edu.cmu.cs.mse.apidesigna3.model.comment.CommentOuterClass.Comment;
import edu.cmu.cs.mse.apidesigna3.model.comment.CommentServiceGrpc;
import edu.cmu.cs.mse.apidesigna3.model.post.PostServiceGrpc;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ClientApplication {

	public static void main(String[] args) throws InterruptedException {

		String target = "localhost:9090";
		// Allow passing in the user and target strings as command line arguments
		if (args.length > 0) {
			if ("--help".equals(args[0])) {
				System.err.println("Usage: [target]");
				System.err.println();
				System.err.println("  target  The server to connect to. Defaults to " + target);
				System.exit(1);
			}
			target = args[0];
		}

		ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
			.build();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(
				"Which post would you like to view? Suggested: post123");
			String pid = in.next();
			ClientService service = new ClientService(PostServiceGrpc.newBlockingStub(channel),
				CommentServiceGrpc.newBlockingStub(channel));
			Comment comment = service.highLevelFunction(pid);
			if (comment == null) {
				System.err.println("The given postId does not satisfy the function criteria.");
				System.exit(1);
			}
			System.out.println(
				"------------------------------------------------------------------");
			System.out.println(
				"The most upvoted reply under the most upvoted comment for " + pid
					+ " (arbitrary) is: \n"
					+ "'" + comment + "'");
			System.out.println(
				"------------------------------------------------------------------");
		} catch (StatusRuntimeException e) {
			System.err.println("The given postId is incorrect.");
			System.exit(1);
		} finally {
			channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
		}
	}
}