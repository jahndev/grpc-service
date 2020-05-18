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
public class AgentServiceGrpc {

  // Static method descriptors that strictly reflect the proto.
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.CreateAgentRequest,
      com.gbusiness.agentslot.api.AgentServiceResponse> METHOD_CREATE_AGENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentService", "CreateAgent",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.CreateAgentRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.AgentServiceResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.RemoveAgentRequest,
      com.gbusiness.agentslot.api.AgentServiceResponse> METHOD_REMOVE_AGENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentService", "RemoveAgent",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.RemoveAgentRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.AgentServiceResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.UpdateAgentRequest,
      com.gbusiness.agentslot.api.AgentServiceResponse> METHOD_UPDATE_AGENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentService", "UpdateAgent",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.UpdateAgentRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.AgentServiceResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.CreateAgentProfileRequest,
      com.gbusiness.agentslot.api.AgentServiceResponse> METHOD_CREATE_AGENT_PROFILE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentService", "CreateAgentProfile",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.CreateAgentProfileRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.AgentServiceResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.RemoveAgentProfileRequest,
      com.gbusiness.agentslot.api.AgentServiceResponse> METHOD_REMOVE_AGENT_PROFILE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentService", "RemoveAgentProfile",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.RemoveAgentProfileRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.AgentServiceResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.UpdateAgentProfileRequest,
      com.gbusiness.agentslot.api.AgentServiceResponse> METHOD_UPDATE_AGENT_PROFILE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentService", "UpdateAgentProfile",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.UpdateAgentProfileRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.AgentServiceResponse.parser()));

  public static AgentServiceStub newStub(io.grpc.Channel channel) {
    return new AgentServiceStub(channel);
  }

  public static AgentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AgentServiceBlockingStub(channel);
  }

  public static AgentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AgentServiceFutureStub(channel);
  }

  public static interface AgentService {

    public void createAgent(com.gbusiness.agentslot.api.CreateAgentRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver);

    public void removeAgent(com.gbusiness.agentslot.api.RemoveAgentRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver);

    public void updateAgent(com.gbusiness.agentslot.api.UpdateAgentRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver);

    public void createAgentProfile(com.gbusiness.agentslot.api.CreateAgentProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver);

    public void removeAgentProfile(com.gbusiness.agentslot.api.RemoveAgentProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver);

    public void updateAgentProfile(com.gbusiness.agentslot.api.UpdateAgentProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver);
  }

  public static interface AgentServiceBlockingClient {

    public com.gbusiness.agentslot.api.AgentServiceResponse createAgent(com.gbusiness.agentslot.api.CreateAgentRequest request);

    public com.gbusiness.agentslot.api.AgentServiceResponse removeAgent(com.gbusiness.agentslot.api.RemoveAgentRequest request);

    public com.gbusiness.agentslot.api.AgentServiceResponse updateAgent(com.gbusiness.agentslot.api.UpdateAgentRequest request);

    public com.gbusiness.agentslot.api.AgentServiceResponse createAgentProfile(com.gbusiness.agentslot.api.CreateAgentProfileRequest request);

    public com.gbusiness.agentslot.api.AgentServiceResponse removeAgentProfile(com.gbusiness.agentslot.api.RemoveAgentProfileRequest request);

    public com.gbusiness.agentslot.api.AgentServiceResponse updateAgentProfile(com.gbusiness.agentslot.api.UpdateAgentProfileRequest request);
  }

  public static interface AgentServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> createAgent(
        com.gbusiness.agentslot.api.CreateAgentRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> removeAgent(
        com.gbusiness.agentslot.api.RemoveAgentRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> updateAgent(
        com.gbusiness.agentslot.api.UpdateAgentRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> createAgentProfile(
        com.gbusiness.agentslot.api.CreateAgentProfileRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> removeAgentProfile(
        com.gbusiness.agentslot.api.RemoveAgentProfileRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> updateAgentProfile(
        com.gbusiness.agentslot.api.UpdateAgentProfileRequest request);
  }

  public static class AgentServiceStub extends io.grpc.stub.AbstractStub<AgentServiceStub>
      implements AgentService {
    private AgentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void createAgent(com.gbusiness.agentslot.api.CreateAgentRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_CREATE_AGENT, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void removeAgent(com.gbusiness.agentslot.api.RemoveAgentRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_REMOVE_AGENT, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void updateAgent(com.gbusiness.agentslot.api.UpdateAgentRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_UPDATE_AGENT, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void createAgentProfile(com.gbusiness.agentslot.api.CreateAgentProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_CREATE_AGENT_PROFILE, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void removeAgentProfile(com.gbusiness.agentslot.api.RemoveAgentProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_REMOVE_AGENT_PROFILE, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void updateAgentProfile(com.gbusiness.agentslot.api.UpdateAgentProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_UPDATE_AGENT_PROFILE, callOptions), request, responseObserver);
    }
  }

  public static class AgentServiceBlockingStub extends io.grpc.stub.AbstractStub<AgentServiceBlockingStub>
      implements AgentServiceBlockingClient {
    private AgentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.AgentServiceResponse createAgent(com.gbusiness.agentslot.api.CreateAgentRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_CREATE_AGENT, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.AgentServiceResponse removeAgent(com.gbusiness.agentslot.api.RemoveAgentRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_REMOVE_AGENT, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.AgentServiceResponse updateAgent(com.gbusiness.agentslot.api.UpdateAgentRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_UPDATE_AGENT, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.AgentServiceResponse createAgentProfile(com.gbusiness.agentslot.api.CreateAgentProfileRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_CREATE_AGENT_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.AgentServiceResponse removeAgentProfile(com.gbusiness.agentslot.api.RemoveAgentProfileRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_REMOVE_AGENT_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.AgentServiceResponse updateAgentProfile(com.gbusiness.agentslot.api.UpdateAgentProfileRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_UPDATE_AGENT_PROFILE, callOptions), request);
    }
  }

  public static class AgentServiceFutureStub extends io.grpc.stub.AbstractStub<AgentServiceFutureStub>
      implements AgentServiceFutureClient {
    private AgentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> createAgent(
        com.gbusiness.agentslot.api.CreateAgentRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_CREATE_AGENT, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> removeAgent(
        com.gbusiness.agentslot.api.RemoveAgentRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_REMOVE_AGENT, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> updateAgent(
        com.gbusiness.agentslot.api.UpdateAgentRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_UPDATE_AGENT, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> createAgentProfile(
        com.gbusiness.agentslot.api.CreateAgentProfileRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_CREATE_AGENT_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> removeAgentProfile(
        com.gbusiness.agentslot.api.RemoveAgentProfileRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_REMOVE_AGENT_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AgentServiceResponse> updateAgentProfile(
        com.gbusiness.agentslot.api.UpdateAgentProfileRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_UPDATE_AGENT_PROFILE, callOptions), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final AgentService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("com.gbusiness.agentslot.api.AgentService")
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_CREATE_AGENT,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.CreateAgentRequest,
                com.gbusiness.agentslot.api.AgentServiceResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.CreateAgentRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
                serviceImpl.createAgent(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_REMOVE_AGENT,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.RemoveAgentRequest,
                com.gbusiness.agentslot.api.AgentServiceResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.RemoveAgentRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
                serviceImpl.removeAgent(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_UPDATE_AGENT,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.UpdateAgentRequest,
                com.gbusiness.agentslot.api.AgentServiceResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.UpdateAgentRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
                serviceImpl.updateAgent(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_CREATE_AGENT_PROFILE,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.CreateAgentProfileRequest,
                com.gbusiness.agentslot.api.AgentServiceResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.CreateAgentProfileRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
                serviceImpl.createAgentProfile(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_REMOVE_AGENT_PROFILE,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.RemoveAgentProfileRequest,
                com.gbusiness.agentslot.api.AgentServiceResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.RemoveAgentProfileRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
                serviceImpl.removeAgentProfile(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_UPDATE_AGENT_PROFILE,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.UpdateAgentProfileRequest,
                com.gbusiness.agentslot.api.AgentServiceResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.UpdateAgentProfileRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AgentServiceResponse> responseObserver) {
                serviceImpl.updateAgentProfile(request, responseObserver);
              }
            }))).build();
  }
}
