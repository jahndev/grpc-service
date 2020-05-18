package com.gbusiness.agentslot.api;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class ProductServiceGrpc {

  // Static method descriptors that strictly reflect the proto.
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.GetProductsDisplayRequest,
      com.gbusiness.agentslot.api.GetProductsDisplayResponse> METHOD_GET_PRODUCTS_DISPLAY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.product.api.ProductService", "GetProductsDisplay",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.GetProductsDisplayRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.GetProductsDisplayResponse.parser()));

  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  public static interface ProductService {

    public void getProductsDisplay(com.gbusiness.agentslot.api.GetProductsDisplayRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetProductsDisplayResponse> responseObserver);
  }

  public static interface ProductServiceBlockingClient {

    public com.gbusiness.agentslot.api.GetProductsDisplayResponse getProductsDisplay(com.gbusiness.agentslot.api.GetProductsDisplayRequest request);
  }

  public static interface ProductServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.GetProductsDisplayResponse> getProductsDisplay(
        com.gbusiness.agentslot.api.GetProductsDisplayRequest request);
  }

  public static class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub>
      implements ProductService {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getProductsDisplay(com.gbusiness.agentslot.api.GetProductsDisplayRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetProductsDisplayResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_GET_PRODUCTS_DISPLAY, callOptions), request, responseObserver);
    }
  }

  public static class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub>
      implements ProductServiceBlockingClient {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.GetProductsDisplayResponse getProductsDisplay(com.gbusiness.agentslot.api.GetProductsDisplayRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_GET_PRODUCTS_DISPLAY, callOptions), request);
    }
  }

  public static class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub>
      implements ProductServiceFutureClient {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.GetProductsDisplayResponse> getProductsDisplay(
        com.gbusiness.agentslot.api.GetProductsDisplayRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_GET_PRODUCTS_DISPLAY, callOptions), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final ProductService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("com.gbusiness.product.api.ProductService")
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_GET_PRODUCTS_DISPLAY,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.GetProductsDisplayRequest,
                com.gbusiness.agentslot.api.GetProductsDisplayResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.GetProductsDisplayRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetProductsDisplayResponse> responseObserver) {
                serviceImpl.getProductsDisplay(request, responseObserver);
              }
            }))).build();
  }
}
