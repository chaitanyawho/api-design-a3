package edu.cmu.cs.mse.apidesigna3.grpc.comment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 */
@javax.annotation.Generated(
	value = "by gRPC proto compiler (version 1.60.0)",
	comments = "Source: comment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommentServiceGrpc {

	public static final java.lang.String SERVICE_NAME = "edu.cmu.cs.mse.apidesigna3.model.comment.CommentService";
	private static final int METHODID_CREATE_COMMENT = 0;
	private static final int METHODID_VOTE_COMMENT = 1;
	private static final int METHODID_GET_MOST_UPVOTED_COMMENTS = 2;
	private static final int METHODID_EXPAND_COMMENT_BRANCH = 3;
	// Static method descriptors that strictly reflect the proto.
	private static volatile io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse> getCreateCommentMethod;
	private static volatile io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse> getVoteCommentMethod;
	private static volatile io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse> getGetMostUpvotedCommentsMethod;
	private static volatile io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse> getExpandCommentBranchMethod;
	private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

	private CommentServiceGrpc() {
	}

	@io.grpc.stub.annotations.RpcMethod(
		fullMethodName = SERVICE_NAME + '/' + "CreateComment",
		requestType = edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest.class,
		responseType = edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse.class,
		methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
	public static io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse> getCreateCommentMethod() {
		io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest, edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse> getCreateCommentMethod;
		if ((getCreateCommentMethod = CommentServiceGrpc.getCreateCommentMethod) == null) {
			synchronized (CommentServiceGrpc.class) {
				if ((getCreateCommentMethod = CommentServiceGrpc.getCreateCommentMethod) == null) {
					CommentServiceGrpc.getCreateCommentMethod = getCreateCommentMethod =
						io.grpc.MethodDescriptor.<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest, edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse>newBuilder()
							.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
							.setFullMethodName(
								generateFullMethodName(SERVICE_NAME, "CreateComment"))
							.setSampledToLocalTracing(true)
							.setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest.getDefaultInstance()))
							.setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse.getDefaultInstance()))
							.setSchemaDescriptor(
								new CommentServiceMethodDescriptorSupplier("CreateComment"))
							.build();
				}
			}
		}
		return getCreateCommentMethod;
	}

	@io.grpc.stub.annotations.RpcMethod(
		fullMethodName = SERVICE_NAME + '/' + "VoteComment",
		requestType = edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest.class,
		responseType = edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse.class,
		methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
	public static io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse> getVoteCommentMethod() {
		io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest, edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse> getVoteCommentMethod;
		if ((getVoteCommentMethod = CommentServiceGrpc.getVoteCommentMethod) == null) {
			synchronized (CommentServiceGrpc.class) {
				if ((getVoteCommentMethod = CommentServiceGrpc.getVoteCommentMethod) == null) {
					CommentServiceGrpc.getVoteCommentMethod = getVoteCommentMethod =
						io.grpc.MethodDescriptor.<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest, edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse>newBuilder()
							.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
							.setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteComment"))
							.setSampledToLocalTracing(true)
							.setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest.getDefaultInstance()))
							.setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse.getDefaultInstance()))
							.setSchemaDescriptor(
								new CommentServiceMethodDescriptorSupplier("VoteComment"))
							.build();
				}
			}
		}
		return getVoteCommentMethod;
	}

	@io.grpc.stub.annotations.RpcMethod(
		fullMethodName = SERVICE_NAME + '/' + "GetMostUpvotedComments",
		requestType = edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest.class,
		responseType = edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse.class,
		methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
	public static io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse> getGetMostUpvotedCommentsMethod() {
		io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest, edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse> getGetMostUpvotedCommentsMethod;
		if ((getGetMostUpvotedCommentsMethod = CommentServiceGrpc.getGetMostUpvotedCommentsMethod)
			== null) {
			synchronized (CommentServiceGrpc.class) {
				if ((getGetMostUpvotedCommentsMethod = CommentServiceGrpc.getGetMostUpvotedCommentsMethod)
					== null) {
					CommentServiceGrpc.getGetMostUpvotedCommentsMethod = getGetMostUpvotedCommentsMethod =
						io.grpc.MethodDescriptor.<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest, edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse>newBuilder()
							.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
							.setFullMethodName(
								generateFullMethodName(SERVICE_NAME, "GetMostUpvotedComments"))
							.setSampledToLocalTracing(true)
							.setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest.getDefaultInstance()))
							.setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse.getDefaultInstance()))
							.setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier(
								"GetMostUpvotedComments"))
							.build();
				}
			}
		}
		return getGetMostUpvotedCommentsMethod;
	}

	@io.grpc.stub.annotations.RpcMethod(
		fullMethodName = SERVICE_NAME + '/' + "ExpandCommentBranch",
		requestType = edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest.class,
		responseType = edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse.class,
		methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
	public static io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse> getExpandCommentBranchMethod() {
		io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest, edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse> getExpandCommentBranchMethod;
		if ((getExpandCommentBranchMethod = CommentServiceGrpc.getExpandCommentBranchMethod)
			== null) {
			synchronized (CommentServiceGrpc.class) {
				if ((getExpandCommentBranchMethod = CommentServiceGrpc.getExpandCommentBranchMethod)
					== null) {
					CommentServiceGrpc.getExpandCommentBranchMethod = getExpandCommentBranchMethod =
						io.grpc.MethodDescriptor.<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest, edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse>newBuilder()
							.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
							.setFullMethodName(
								generateFullMethodName(SERVICE_NAME, "ExpandCommentBranch"))
							.setSampledToLocalTracing(true)
							.setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest.getDefaultInstance()))
							.setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse.getDefaultInstance()))
							.setSchemaDescriptor(
								new CommentServiceMethodDescriptorSupplier("ExpandCommentBranch"))
							.build();
				}
			}
		}
		return getExpandCommentBranchMethod;
	}

	/**
	 * Creates a new async stub that supports all call types for the service
	 */
	public static CommentServiceStub newStub(io.grpc.Channel channel) {
		io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub> factory =
			new io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub>() {
				@java.lang.Override
				public CommentServiceStub newStub(io.grpc.Channel channel,
					io.grpc.CallOptions callOptions) {
					return new CommentServiceStub(channel, callOptions);
				}
			};
		return CommentServiceStub.newStub(factory, channel);
	}

	/**
	 * Creates a new blocking-style stub that supports unary and streaming output calls on the
	 * service
	 */
	public static CommentServiceBlockingStub newBlockingStub(
		io.grpc.Channel channel) {
		io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub> factory =
			new io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub>() {
				@java.lang.Override
				public CommentServiceBlockingStub newStub(io.grpc.Channel channel,
					io.grpc.CallOptions callOptions) {
					return new CommentServiceBlockingStub(channel, callOptions);
				}
			};
		return CommentServiceBlockingStub.newStub(factory, channel);
	}

	/**
	 * Creates a new ListenableFuture-style stub that supports unary calls on the service
	 */
	public static CommentServiceFutureStub newFutureStub(
		io.grpc.Channel channel) {
		io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub> factory =
			new io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub>() {
				@java.lang.Override
				public CommentServiceFutureStub newStub(io.grpc.Channel channel,
					io.grpc.CallOptions callOptions) {
					return new CommentServiceFutureStub(channel, callOptions);
				}
			};
		return CommentServiceFutureStub.newStub(factory, channel);
	}

	public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
		return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
			.addMethod(
				getCreateCommentMethod(),
				io.grpc.stub.ServerCalls.asyncUnaryCall(
					new MethodHandlers<
						edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest,
						edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse>(
						service, METHODID_CREATE_COMMENT)))
			.addMethod(
				getVoteCommentMethod(),
				io.grpc.stub.ServerCalls.asyncUnaryCall(
					new MethodHandlers<
						edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest,
						edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse>(
						service, METHODID_VOTE_COMMENT)))
			.addMethod(
				getGetMostUpvotedCommentsMethod(),
				io.grpc.stub.ServerCalls.asyncUnaryCall(
					new MethodHandlers<
						edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest,
						edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse>(
						service, METHODID_GET_MOST_UPVOTED_COMMENTS)))
			.addMethod(
				getExpandCommentBranchMethod(),
				io.grpc.stub.ServerCalls.asyncUnaryCall(
					new MethodHandlers<
						edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest,
						edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse>(
						service, METHODID_EXPAND_COMMENT_BRANCH)))
			.build();
	}

	public static io.grpc.ServiceDescriptor getServiceDescriptor() {
		io.grpc.ServiceDescriptor result = serviceDescriptor;
		if (result == null) {
			synchronized (CommentServiceGrpc.class) {
				result = serviceDescriptor;
				if (result == null) {
					serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
						.setSchemaDescriptor(new CommentServiceFileDescriptorSupplier())
						.addMethod(getCreateCommentMethod())
						.addMethod(getVoteCommentMethod())
						.addMethod(getGetMostUpvotedCommentsMethod())
						.addMethod(getExpandCommentBranchMethod())
						.build();
				}
			}
		}
		return result;
	}
	/**
	 *
	 */
	public interface AsyncService {

		/**
		 *
		 */
		default void createComment(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse> responseObserver) {
			io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommentMethod(),
				responseObserver);
		}

		/**
		 *
		 */
		default void voteComment(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse> responseObserver) {
			io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteCommentMethod(),
				responseObserver);
		}

		/**
		 *
		 */
		default void getMostUpvotedComments(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse> responseObserver) {
			io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMostUpvotedCommentsMethod(),
				responseObserver);
		}

		/**
		 *
		 */
		default void expandCommentBranch(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse> responseObserver) {
			io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExpandCommentBranchMethod(),
				responseObserver);
		}
	}

	/**
	 * Base class for the server implementation of the service CommentService.
	 */
	public static abstract class CommentServiceImplBase
		implements io.grpc.BindableService, AsyncService {

		@java.lang.Override
		public final io.grpc.ServerServiceDefinition bindService() {
			return CommentServiceGrpc.bindService(this);
		}
	}

	/**
	 * A stub to allow clients to do asynchronous rpc calls to service CommentService.
	 */
	public static final class CommentServiceStub
		extends io.grpc.stub.AbstractAsyncStub<CommentServiceStub> {

		private CommentServiceStub(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@java.lang.Override
		protected CommentServiceStub build(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			return new CommentServiceStub(channel, callOptions);
		}

		/**
		 *
		 */
		public void createComment(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse> responseObserver) {
			io.grpc.stub.ClientCalls.asyncUnaryCall(
				getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request,
				responseObserver);
		}

		/**
		 *
		 */
		public void voteComment(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse> responseObserver) {
			io.grpc.stub.ClientCalls.asyncUnaryCall(
				getChannel().newCall(getVoteCommentMethod(), getCallOptions()), request,
				responseObserver);
		}

		/**
		 *
		 */
		public void getMostUpvotedComments(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse> responseObserver) {
			io.grpc.stub.ClientCalls.asyncUnaryCall(
				getChannel().newCall(getGetMostUpvotedCommentsMethod(), getCallOptions()), request,
				responseObserver);
		}

		/**
		 *
		 */
		public void expandCommentBranch(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse> responseObserver) {
			io.grpc.stub.ClientCalls.asyncUnaryCall(
				getChannel().newCall(getExpandCommentBranchMethod(), getCallOptions()), request,
				responseObserver);
		}
	}

	/**
	 * A stub to allow clients to do synchronous rpc calls to service CommentService.
	 */
	public static final class CommentServiceBlockingStub
		extends io.grpc.stub.AbstractBlockingStub<CommentServiceBlockingStub> {

		private CommentServiceBlockingStub(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@java.lang.Override
		protected CommentServiceBlockingStub build(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			return new CommentServiceBlockingStub(channel, callOptions);
		}

		/**
		 *
		 */
		public edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse createComment(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest request) {
			return io.grpc.stub.ClientCalls.blockingUnaryCall(
				getChannel(), getCreateCommentMethod(), getCallOptions(), request);
		}

		/**
		 *
		 */
		public edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse voteComment(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest request) {
			return io.grpc.stub.ClientCalls.blockingUnaryCall(
				getChannel(), getVoteCommentMethod(), getCallOptions(), request);
		}

		/**
		 *
		 */
		public edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse getMostUpvotedComments(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest request) {
			return io.grpc.stub.ClientCalls.blockingUnaryCall(
				getChannel(), getGetMostUpvotedCommentsMethod(), getCallOptions(), request);
		}

		/**
		 *
		 */
		public edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse expandCommentBranch(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest request) {
			return io.grpc.stub.ClientCalls.blockingUnaryCall(
				getChannel(), getExpandCommentBranchMethod(), getCallOptions(), request);
		}
	}

	/**
	 * A stub to allow clients to do ListenableFuture-style rpc calls to service CommentService.
	 */
	public static final class CommentServiceFutureStub
		extends io.grpc.stub.AbstractFutureStub<CommentServiceFutureStub> {

		private CommentServiceFutureStub(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@java.lang.Override
		protected CommentServiceFutureStub build(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			return new CommentServiceFutureStub(channel, callOptions);
		}

		/**
		 *
		 */
		public com.google.common.util.concurrent.ListenableFuture<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse> createComment(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest request) {
			return io.grpc.stub.ClientCalls.futureUnaryCall(
				getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request);
		}

		/**
		 *
		 */
		public com.google.common.util.concurrent.ListenableFuture<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse> voteComment(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest request) {
			return io.grpc.stub.ClientCalls.futureUnaryCall(
				getChannel().newCall(getVoteCommentMethod(), getCallOptions()), request);
		}

		/**
		 *
		 */
		public com.google.common.util.concurrent.ListenableFuture<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse> getMostUpvotedComments(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest request) {
			return io.grpc.stub.ClientCalls.futureUnaryCall(
				getChannel().newCall(getGetMostUpvotedCommentsMethod(), getCallOptions()), request);
		}

		/**
		 *
		 */
		public com.google.common.util.concurrent.ListenableFuture<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse> expandCommentBranch(
			edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest request) {
			return io.grpc.stub.ClientCalls.futureUnaryCall(
				getChannel().newCall(getExpandCommentBranchMethod(), getCallOptions()), request);
		}
	}

	private static final class MethodHandlers<Req, Resp> implements
		io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
		io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
		io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
		io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

		private final AsyncService serviceImpl;
		private final int methodId;

		MethodHandlers(AsyncService serviceImpl, int methodId) {
			this.serviceImpl = serviceImpl;
			this.methodId = methodId;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("unchecked")
		public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
			switch (methodId) {
				case METHODID_CREATE_COMMENT:
					serviceImpl.createComment(
						(edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentRequest) request,
						(io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.CreateCommentResponse>) responseObserver);
					break;
				case METHODID_VOTE_COMMENT:
					serviceImpl.voteComment(
						(edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentRequest) request,
						(io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.VoteCommentResponse>) responseObserver);
					break;
				case METHODID_GET_MOST_UPVOTED_COMMENTS:
					serviceImpl.getMostUpvotedComments(
						(edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsRequest) request,
						(io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.GetMostUpvotedCommentsResponse>) responseObserver);
					break;
				case METHODID_EXPAND_COMMENT_BRANCH:
					serviceImpl.expandCommentBranch(
						(edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchRequest) request,
						(io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.ExpandCommentBranchResponse>) responseObserver);
					break;
				default:
					throw new AssertionError();
			}
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("unchecked")
		public io.grpc.stub.StreamObserver<Req> invoke(
			io.grpc.stub.StreamObserver<Resp> responseObserver) {
			switch (methodId) {
				default:
					throw new AssertionError();
			}
		}
	}

	private static abstract class CommentServiceBaseDescriptorSupplier
		implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
		io.grpc.protobuf.ProtoServiceDescriptorSupplier {

		CommentServiceBaseDescriptorSupplier() {
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
			return edu.cmu.cs.mse.apidesigna3.grpc.comment.CommentOuterClass.getDescriptor();
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
			return getFileDescriptor().findServiceByName("CommentService");
		}
	}

	private static final class CommentServiceFileDescriptorSupplier
		extends CommentServiceBaseDescriptorSupplier {

		CommentServiceFileDescriptorSupplier() {
		}
	}

	private static final class CommentServiceMethodDescriptorSupplier
		extends CommentServiceBaseDescriptorSupplier
		implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

		private final java.lang.String methodName;

		CommentServiceMethodDescriptorSupplier(java.lang.String methodName) {
			this.methodName = methodName;
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
			return getServiceDescriptor().findMethodByName(methodName);
		}
	}
}
