package edu.cmu.cs.mse.apidesigna3.grpc.post;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 */
@javax.annotation.Generated(
	value = "by gRPC proto compiler (version 1.60.0)",
	comments = "Source: post.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PostServiceGrpc {

	public static final java.lang.String SERVICE_NAME = "edu.cmu.cs.mse.apidesigna3.model.post.PostService";
	private static final int METHODID_CREATE_POST = 0;
	private static final int METHODID_VOTE_POST = 1;
	private static final int METHODID_GET_POST = 2;
	// Static method descriptors that strictly reflect the proto.
	private static volatile io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse> getCreatePostMethod;
	private static volatile io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse> getVotePostMethod;
	private static volatile io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse> getGetPostMethod;
	private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

	private PostServiceGrpc() {
	}

	@io.grpc.stub.annotations.RpcMethod(
		fullMethodName = SERVICE_NAME + '/' + "CreatePost",
		requestType = edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest.class,
		responseType = edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse.class,
		methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
	public static io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse> getCreatePostMethod() {
		io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest, edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse> getCreatePostMethod;
		if ((getCreatePostMethod = PostServiceGrpc.getCreatePostMethod) == null) {
			synchronized (PostServiceGrpc.class) {
				if ((getCreatePostMethod = PostServiceGrpc.getCreatePostMethod) == null) {
					PostServiceGrpc.getCreatePostMethod = getCreatePostMethod =
						io.grpc.MethodDescriptor.<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest, edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse>newBuilder()
							.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
							.setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
							.setSampledToLocalTracing(true)
							.setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest.getDefaultInstance()))
							.setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse.getDefaultInstance()))
							.setSchemaDescriptor(
								new PostServiceMethodDescriptorSupplier("CreatePost"))
							.build();
				}
			}
		}
		return getCreatePostMethod;
	}

	@io.grpc.stub.annotations.RpcMethod(
		fullMethodName = SERVICE_NAME + '/' + "VotePost",
		requestType = edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest.class,
		responseType = edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse.class,
		methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
	public static io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse> getVotePostMethod() {
		io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest, edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse> getVotePostMethod;
		if ((getVotePostMethod = PostServiceGrpc.getVotePostMethod) == null) {
			synchronized (PostServiceGrpc.class) {
				if ((getVotePostMethod = PostServiceGrpc.getVotePostMethod) == null) {
					PostServiceGrpc.getVotePostMethod = getVotePostMethod =
						io.grpc.MethodDescriptor.<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest, edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse>newBuilder()
							.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
							.setFullMethodName(generateFullMethodName(SERVICE_NAME, "VotePost"))
							.setSampledToLocalTracing(true)
							.setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest.getDefaultInstance()))
							.setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse.getDefaultInstance()))
							.setSchemaDescriptor(
								new PostServiceMethodDescriptorSupplier("VotePost"))
							.build();
				}
			}
		}
		return getVotePostMethod;
	}

	@io.grpc.stub.annotations.RpcMethod(
		fullMethodName = SERVICE_NAME + '/' + "GetPost",
		requestType = edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest.class,
		responseType = edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse.class,
		methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
	public static io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest,
		edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse> getGetPostMethod() {
		io.grpc.MethodDescriptor<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest, edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse> getGetPostMethod;
		if ((getGetPostMethod = PostServiceGrpc.getGetPostMethod) == null) {
			synchronized (PostServiceGrpc.class) {
				if ((getGetPostMethod = PostServiceGrpc.getGetPostMethod) == null) {
					PostServiceGrpc.getGetPostMethod = getGetPostMethod =
						io.grpc.MethodDescriptor.<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest, edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse>newBuilder()
							.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
							.setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPost"))
							.setSampledToLocalTracing(true)
							.setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest.getDefaultInstance()))
							.setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
								edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse.getDefaultInstance()))
							.setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetPost"))
							.build();
				}
			}
		}
		return getGetPostMethod;
	}

	/**
	 * Creates a new async stub that supports all call types for the service
	 */
	public static PostServiceStub newStub(io.grpc.Channel channel) {
		io.grpc.stub.AbstractStub.StubFactory<PostServiceStub> factory =
			new io.grpc.stub.AbstractStub.StubFactory<PostServiceStub>() {
				@java.lang.Override
				public PostServiceStub newStub(io.grpc.Channel channel,
					io.grpc.CallOptions callOptions) {
					return new PostServiceStub(channel, callOptions);
				}
			};
		return PostServiceStub.newStub(factory, channel);
	}

	/**
	 * Creates a new blocking-style stub that supports unary and streaming output calls on the
	 * service
	 */
	public static PostServiceBlockingStub newBlockingStub(
		io.grpc.Channel channel) {
		io.grpc.stub.AbstractStub.StubFactory<PostServiceBlockingStub> factory =
			new io.grpc.stub.AbstractStub.StubFactory<PostServiceBlockingStub>() {
				@java.lang.Override
				public PostServiceBlockingStub newStub(io.grpc.Channel channel,
					io.grpc.CallOptions callOptions) {
					return new PostServiceBlockingStub(channel, callOptions);
				}
			};
		return PostServiceBlockingStub.newStub(factory, channel);
	}

	/**
	 * Creates a new ListenableFuture-style stub that supports unary calls on the service
	 */
	public static PostServiceFutureStub newFutureStub(
		io.grpc.Channel channel) {
		io.grpc.stub.AbstractStub.StubFactory<PostServiceFutureStub> factory =
			new io.grpc.stub.AbstractStub.StubFactory<PostServiceFutureStub>() {
				@java.lang.Override
				public PostServiceFutureStub newStub(io.grpc.Channel channel,
					io.grpc.CallOptions callOptions) {
					return new PostServiceFutureStub(channel, callOptions);
				}
			};
		return PostServiceFutureStub.newStub(factory, channel);
	}

	public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
		return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
			.addMethod(
				getCreatePostMethod(),
				io.grpc.stub.ServerCalls.asyncUnaryCall(
					new MethodHandlers<
						edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest,
						edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse>(
						service, METHODID_CREATE_POST)))
			.addMethod(
				getVotePostMethod(),
				io.grpc.stub.ServerCalls.asyncUnaryCall(
					new MethodHandlers<
						edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest,
						edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse>(
						service, METHODID_VOTE_POST)))
			.addMethod(
				getGetPostMethod(),
				io.grpc.stub.ServerCalls.asyncUnaryCall(
					new MethodHandlers<
						edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest,
						edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse>(
						service, METHODID_GET_POST)))
			.build();
	}

	public static io.grpc.ServiceDescriptor getServiceDescriptor() {
		io.grpc.ServiceDescriptor result = serviceDescriptor;
		if (result == null) {
			synchronized (PostServiceGrpc.class) {
				result = serviceDescriptor;
				if (result == null) {
					serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
						.setSchemaDescriptor(new PostServiceFileDescriptorSupplier())
						.addMethod(getCreatePostMethod())
						.addMethod(getVotePostMethod())
						.addMethod(getGetPostMethod())
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
		default void createPost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse> responseObserver) {
			io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(),
				responseObserver);
		}

		/**
		 *
		 */
		default void votePost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse> responseObserver) {
			io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVotePostMethod(),
				responseObserver);
		}

		/**
		 *
		 */
		default void getPost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse> responseObserver) {
			io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostMethod(),
				responseObserver);
		}
	}

	/**
	 * Base class for the server implementation of the service PostService.
	 */
	public static abstract class PostServiceImplBase
		implements io.grpc.BindableService, AsyncService {

		@java.lang.Override
		public final io.grpc.ServerServiceDefinition bindService() {
			return PostServiceGrpc.bindService(this);
		}
	}

	/**
	 * A stub to allow clients to do asynchronous rpc calls to service PostService.
	 */
	public static final class PostServiceStub
		extends io.grpc.stub.AbstractAsyncStub<PostServiceStub> {

		private PostServiceStub(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@java.lang.Override
		protected PostServiceStub build(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			return new PostServiceStub(channel, callOptions);
		}

		/**
		 *
		 */
		public void createPost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse> responseObserver) {
			io.grpc.stub.ClientCalls.asyncUnaryCall(
				getChannel().newCall(getCreatePostMethod(), getCallOptions()), request,
				responseObserver);
		}

		/**
		 *
		 */
		public void votePost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse> responseObserver) {
			io.grpc.stub.ClientCalls.asyncUnaryCall(
				getChannel().newCall(getVotePostMethod(), getCallOptions()), request,
				responseObserver);
		}

		/**
		 *
		 */
		public void getPost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest request,
			io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse> responseObserver) {
			io.grpc.stub.ClientCalls.asyncUnaryCall(
				getChannel().newCall(getGetPostMethod(), getCallOptions()), request,
				responseObserver);
		}
	}

	/**
	 * A stub to allow clients to do synchronous rpc calls to service PostService.
	 */
	public static final class PostServiceBlockingStub
		extends io.grpc.stub.AbstractBlockingStub<PostServiceBlockingStub> {

		private PostServiceBlockingStub(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@java.lang.Override
		protected PostServiceBlockingStub build(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			return new PostServiceBlockingStub(channel, callOptions);
		}

		/**
		 *
		 */
		public edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse createPost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest request) {
			return io.grpc.stub.ClientCalls.blockingUnaryCall(
				getChannel(), getCreatePostMethod(), getCallOptions(), request);
		}

		/**
		 *
		 */
		public edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse votePost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest request) {
			return io.grpc.stub.ClientCalls.blockingUnaryCall(
				getChannel(), getVotePostMethod(), getCallOptions(), request);
		}

		/**
		 *
		 */
		public edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse getPost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest request) {
			return io.grpc.stub.ClientCalls.blockingUnaryCall(
				getChannel(), getGetPostMethod(), getCallOptions(), request);
		}
	}

	/**
	 * A stub to allow clients to do ListenableFuture-style rpc calls to service PostService.
	 */
	public static final class PostServiceFutureStub
		extends io.grpc.stub.AbstractFutureStub<PostServiceFutureStub> {

		private PostServiceFutureStub(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@java.lang.Override
		protected PostServiceFutureStub build(
			io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			return new PostServiceFutureStub(channel, callOptions);
		}

		/**
		 *
		 */
		public com.google.common.util.concurrent.ListenableFuture<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse> createPost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest request) {
			return io.grpc.stub.ClientCalls.futureUnaryCall(
				getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
		}

		/**
		 *
		 */
		public com.google.common.util.concurrent.ListenableFuture<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse> votePost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest request) {
			return io.grpc.stub.ClientCalls.futureUnaryCall(
				getChannel().newCall(getVotePostMethod(), getCallOptions()), request);
		}

		/**
		 *
		 */
		public com.google.common.util.concurrent.ListenableFuture<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse> getPost(
			edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest request) {
			return io.grpc.stub.ClientCalls.futureUnaryCall(
				getChannel().newCall(getGetPostMethod(), getCallOptions()), request);
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
				case METHODID_CREATE_POST:
					serviceImpl.createPost(
						(edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostRequest) request,
						(io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.CreatePostResponse>) responseObserver);
					break;
				case METHODID_VOTE_POST:
					serviceImpl.votePost(
						(edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostRequest) request,
						(io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.VotePostResponse>) responseObserver);
					break;
				case METHODID_GET_POST:
					serviceImpl.getPost(
						(edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostRequest) request,
						(io.grpc.stub.StreamObserver<edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.GetPostResponse>) responseObserver);
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

	private static abstract class PostServiceBaseDescriptorSupplier
		implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
		io.grpc.protobuf.ProtoServiceDescriptorSupplier {

		PostServiceBaseDescriptorSupplier() {
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
			return edu.cmu.cs.mse.apidesigna3.grpc.post.PostOuterClass.getDescriptor();
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
			return getFileDescriptor().findServiceByName("PostService");
		}
	}

	private static final class PostServiceFileDescriptorSupplier
		extends PostServiceBaseDescriptorSupplier {

		PostServiceFileDescriptorSupplier() {
		}
	}

	private static final class PostServiceMethodDescriptorSupplier
		extends PostServiceBaseDescriptorSupplier
		implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

		private final java.lang.String methodName;

		PostServiceMethodDescriptorSupplier(java.lang.String methodName) {
			this.methodName = methodName;
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
			return getServiceDescriptor().findMethodByName(methodName);
		}
	}
}
