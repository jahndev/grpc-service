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
public class AgentSlotServiceGrpc {

  // Static method descriptors that strictly reflect the proto.
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.CreateMeetingProfileRequest,
      com.gbusiness.agentslot.api.CreateMeetingProfileResponse> METHOD_CREATE_MEETING_PROFILE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "CreateMeetingProfile",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.CreateMeetingProfileRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.CreateMeetingProfileResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.RemoveMeetingProfileRequest,
      com.gbusiness.agentslot.api.RemoveMeetingProfileResponse> METHOD_REMOVE_MEETING_PROFILE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "RemoveMeetingProfile",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.RemoveMeetingProfileRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.RemoveMeetingProfileResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.UpdateMeetingProfileRequest,
      com.gbusiness.agentslot.api.UpdateMeetingProfileResponse> METHOD_UPDATE_MEETING_PROFILE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "UpdateMeetingProfile",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.UpdateMeetingProfileRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.UpdateMeetingProfileResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.GetMeetingProfilesRequest,
      com.gbusiness.agentslot.api.GetMeetingProfilesResponse> METHOD_GET_MEETING_PROFILES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "GetMeetingProfiles",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.GetMeetingProfilesRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.GetMeetingProfilesResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest,
      com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse> METHOD_GET_AGENT_SLOTS_SETTINGS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "GetAgentSlotsSettings",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.ListSlotsRequest,
      com.gbusiness.agentslot.api.ListSlotsResponse> METHOD_LIST_SLOTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "ListSlots",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.ListSlotsRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.ListSlotsResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.GetSlotsRequest,
      com.gbusiness.agentslot.api.GetSlotsResponse> METHOD_GET_SLOTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "GetSlots",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.GetSlotsRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.GetSlotsResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.AllocateSlotRequest,
      com.gbusiness.agentslot.api.AllocateSlotResponse> METHOD_ALLOCATE_SLOT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "AllocateSlot",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.AllocateSlotRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.AllocateSlotResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.ConfirmSlotRequest,
      com.gbusiness.agentslot.api.ConfirmSlotResponse> METHOD_CONFIRM_SLOT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "ConfirmSlot",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.ConfirmSlotRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.ConfirmSlotResponse.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.FreeSlotRequest,
      com.gbusiness.agentslot.api.FreeSlotRequest> METHOD_FREE_SLOT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "FreeSlot",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.FreeSlotRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.FreeSlotRequest.parser()));
  public static final io.grpc.MethodDescriptor<com.gbusiness.agentslot.api.RescheduleSlotRequest,
      com.gbusiness.agentslot.api.RescheduleSlotResponse> METHOD_RESCHEDULE_SLOT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "com.gbusiness.agentslot.api.AgentSlotService", "RescheduleSlot",
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.RescheduleSlotRequest.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gbusiness.agentslot.api.RescheduleSlotResponse.parser()));

  public static AgentSlotServiceStub newStub(io.grpc.Channel channel) {
    return new AgentSlotServiceStub(channel);
  }

  public static AgentSlotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AgentSlotServiceBlockingStub(channel);
  }

  public static AgentSlotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AgentSlotServiceFutureStub(channel);
  }

  public static interface AgentSlotService {

    public void createMeetingProfile(com.gbusiness.agentslot.api.CreateMeetingProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.CreateMeetingProfileResponse> responseObserver);

    public void removeMeetingProfile(com.gbusiness.agentslot.api.RemoveMeetingProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.RemoveMeetingProfileResponse> responseObserver);

    public void updateMeetingProfile(com.gbusiness.agentslot.api.UpdateMeetingProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.UpdateMeetingProfileResponse> responseObserver);

    public void getMeetingProfiles(com.gbusiness.agentslot.api.GetMeetingProfilesRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetMeetingProfilesResponse> responseObserver);

    public void getAgentSlotsSettings(com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse> responseObserver);

    public void listSlots(com.gbusiness.agentslot.api.ListSlotsRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.ListSlotsResponse> responseObserver);

    public void getSlots(com.gbusiness.agentslot.api.GetSlotsRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetSlotsResponse> responseObserver);

    public void allocateSlot(com.gbusiness.agentslot.api.AllocateSlotRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AllocateSlotResponse> responseObserver);

    public void confirmSlot(com.gbusiness.agentslot.api.ConfirmSlotRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.ConfirmSlotResponse> responseObserver);

    public void freeSlot(com.gbusiness.agentslot.api.FreeSlotRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.FreeSlotRequest> responseObserver);

    public void rescheduleSlot(com.gbusiness.agentslot.api.RescheduleSlotRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.RescheduleSlotResponse> responseObserver);
  }

  public static interface AgentSlotServiceBlockingClient {

    public com.gbusiness.agentslot.api.CreateMeetingProfileResponse createMeetingProfile(com.gbusiness.agentslot.api.CreateMeetingProfileRequest request);

    public com.gbusiness.agentslot.api.RemoveMeetingProfileResponse removeMeetingProfile(com.gbusiness.agentslot.api.RemoveMeetingProfileRequest request);

    public com.gbusiness.agentslot.api.UpdateMeetingProfileResponse updateMeetingProfile(com.gbusiness.agentslot.api.UpdateMeetingProfileRequest request);

    public com.gbusiness.agentslot.api.GetMeetingProfilesResponse getMeetingProfiles(com.gbusiness.agentslot.api.GetMeetingProfilesRequest request);

    public com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse getAgentSlotsSettings(com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest request);

    public com.gbusiness.agentslot.api.ListSlotsResponse listSlots(com.gbusiness.agentslot.api.ListSlotsRequest request);

    public com.gbusiness.agentslot.api.GetSlotsResponse getSlots(com.gbusiness.agentslot.api.GetSlotsRequest request);

    public com.gbusiness.agentslot.api.AllocateSlotResponse allocateSlot(com.gbusiness.agentslot.api.AllocateSlotRequest request);

    public com.gbusiness.agentslot.api.ConfirmSlotResponse confirmSlot(com.gbusiness.agentslot.api.ConfirmSlotRequest request);

    public com.gbusiness.agentslot.api.FreeSlotRequest freeSlot(com.gbusiness.agentslot.api.FreeSlotRequest request);

    public com.gbusiness.agentslot.api.RescheduleSlotResponse rescheduleSlot(com.gbusiness.agentslot.api.RescheduleSlotRequest request);
  }

  public static interface AgentSlotServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.CreateMeetingProfileResponse> createMeetingProfile(
        com.gbusiness.agentslot.api.CreateMeetingProfileRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.RemoveMeetingProfileResponse> removeMeetingProfile(
        com.gbusiness.agentslot.api.RemoveMeetingProfileRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.UpdateMeetingProfileResponse> updateMeetingProfile(
        com.gbusiness.agentslot.api.UpdateMeetingProfileRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.GetMeetingProfilesResponse> getMeetingProfiles(
        com.gbusiness.agentslot.api.GetMeetingProfilesRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse> getAgentSlotsSettings(
        com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.ListSlotsResponse> listSlots(
        com.gbusiness.agentslot.api.ListSlotsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.GetSlotsResponse> getSlots(
        com.gbusiness.agentslot.api.GetSlotsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AllocateSlotResponse> allocateSlot(
        com.gbusiness.agentslot.api.AllocateSlotRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.ConfirmSlotResponse> confirmSlot(
        com.gbusiness.agentslot.api.ConfirmSlotRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.FreeSlotRequest> freeSlot(
        com.gbusiness.agentslot.api.FreeSlotRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.RescheduleSlotResponse> rescheduleSlot(
        com.gbusiness.agentslot.api.RescheduleSlotRequest request);
  }

  public static class AgentSlotServiceStub extends io.grpc.stub.AbstractStub<AgentSlotServiceStub>
      implements AgentSlotService {
    private AgentSlotServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentSlotServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentSlotServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentSlotServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void createMeetingProfile(com.gbusiness.agentslot.api.CreateMeetingProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.CreateMeetingProfileResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_CREATE_MEETING_PROFILE, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void removeMeetingProfile(com.gbusiness.agentslot.api.RemoveMeetingProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.RemoveMeetingProfileResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_REMOVE_MEETING_PROFILE, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void updateMeetingProfile(com.gbusiness.agentslot.api.UpdateMeetingProfileRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.UpdateMeetingProfileResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_UPDATE_MEETING_PROFILE, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void getMeetingProfiles(com.gbusiness.agentslot.api.GetMeetingProfilesRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetMeetingProfilesResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_GET_MEETING_PROFILES, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void getAgentSlotsSettings(com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_GET_AGENT_SLOTS_SETTINGS, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void listSlots(com.gbusiness.agentslot.api.ListSlotsRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.ListSlotsResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_LIST_SLOTS, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void getSlots(com.gbusiness.agentslot.api.GetSlotsRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetSlotsResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_GET_SLOTS, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void allocateSlot(com.gbusiness.agentslot.api.AllocateSlotRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AllocateSlotResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_ALLOCATE_SLOT, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void confirmSlot(com.gbusiness.agentslot.api.ConfirmSlotRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.ConfirmSlotResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_CONFIRM_SLOT, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void freeSlot(com.gbusiness.agentslot.api.FreeSlotRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.FreeSlotRequest> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_FREE_SLOT, callOptions), request, responseObserver);
    }

    @java.lang.Override
    public void rescheduleSlot(com.gbusiness.agentslot.api.RescheduleSlotRequest request,
        io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.RescheduleSlotResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(METHOD_RESCHEDULE_SLOT, callOptions), request, responseObserver);
    }
  }

  public static class AgentSlotServiceBlockingStub extends io.grpc.stub.AbstractStub<AgentSlotServiceBlockingStub>
      implements AgentSlotServiceBlockingClient {
    private AgentSlotServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentSlotServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentSlotServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentSlotServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.CreateMeetingProfileResponse createMeetingProfile(com.gbusiness.agentslot.api.CreateMeetingProfileRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_CREATE_MEETING_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.RemoveMeetingProfileResponse removeMeetingProfile(com.gbusiness.agentslot.api.RemoveMeetingProfileRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_REMOVE_MEETING_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.UpdateMeetingProfileResponse updateMeetingProfile(com.gbusiness.agentslot.api.UpdateMeetingProfileRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_UPDATE_MEETING_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.GetMeetingProfilesResponse getMeetingProfiles(com.gbusiness.agentslot.api.GetMeetingProfilesRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_GET_MEETING_PROFILES, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse getAgentSlotsSettings(com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_GET_AGENT_SLOTS_SETTINGS, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.ListSlotsResponse listSlots(com.gbusiness.agentslot.api.ListSlotsRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_LIST_SLOTS, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.GetSlotsResponse getSlots(com.gbusiness.agentslot.api.GetSlotsRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_GET_SLOTS, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.AllocateSlotResponse allocateSlot(com.gbusiness.agentslot.api.AllocateSlotRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_ALLOCATE_SLOT, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.ConfirmSlotResponse confirmSlot(com.gbusiness.agentslot.api.ConfirmSlotRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_CONFIRM_SLOT, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.FreeSlotRequest freeSlot(com.gbusiness.agentslot.api.FreeSlotRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_FREE_SLOT, callOptions), request);
    }

    @java.lang.Override
    public com.gbusiness.agentslot.api.RescheduleSlotResponse rescheduleSlot(com.gbusiness.agentslot.api.RescheduleSlotRequest request) {
      return blockingUnaryCall(
          channel.newCall(METHOD_RESCHEDULE_SLOT, callOptions), request);
    }
  }

  public static class AgentSlotServiceFutureStub extends io.grpc.stub.AbstractStub<AgentSlotServiceFutureStub>
      implements AgentSlotServiceFutureClient {
    private AgentSlotServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentSlotServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentSlotServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentSlotServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.CreateMeetingProfileResponse> createMeetingProfile(
        com.gbusiness.agentslot.api.CreateMeetingProfileRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_CREATE_MEETING_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.RemoveMeetingProfileResponse> removeMeetingProfile(
        com.gbusiness.agentslot.api.RemoveMeetingProfileRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_REMOVE_MEETING_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.UpdateMeetingProfileResponse> updateMeetingProfile(
        com.gbusiness.agentslot.api.UpdateMeetingProfileRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_UPDATE_MEETING_PROFILE, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.GetMeetingProfilesResponse> getMeetingProfiles(
        com.gbusiness.agentslot.api.GetMeetingProfilesRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_GET_MEETING_PROFILES, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse> getAgentSlotsSettings(
        com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_GET_AGENT_SLOTS_SETTINGS, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.ListSlotsResponse> listSlots(
        com.gbusiness.agentslot.api.ListSlotsRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_LIST_SLOTS, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.GetSlotsResponse> getSlots(
        com.gbusiness.agentslot.api.GetSlotsRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_GET_SLOTS, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.AllocateSlotResponse> allocateSlot(
        com.gbusiness.agentslot.api.AllocateSlotRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_ALLOCATE_SLOT, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.ConfirmSlotResponse> confirmSlot(
        com.gbusiness.agentslot.api.ConfirmSlotRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_CONFIRM_SLOT, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.FreeSlotRequest> freeSlot(
        com.gbusiness.agentslot.api.FreeSlotRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_FREE_SLOT, callOptions), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.gbusiness.agentslot.api.RescheduleSlotResponse> rescheduleSlot(
        com.gbusiness.agentslot.api.RescheduleSlotRequest request) {
      return futureUnaryCall(
          channel.newCall(METHOD_RESCHEDULE_SLOT, callOptions), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final AgentSlotService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("com.gbusiness.agentslot.api.AgentSlotService")
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_CREATE_MEETING_PROFILE,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.CreateMeetingProfileRequest,
                com.gbusiness.agentslot.api.CreateMeetingProfileResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.CreateMeetingProfileRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.CreateMeetingProfileResponse> responseObserver) {
                serviceImpl.createMeetingProfile(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_REMOVE_MEETING_PROFILE,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.RemoveMeetingProfileRequest,
                com.gbusiness.agentslot.api.RemoveMeetingProfileResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.RemoveMeetingProfileRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.RemoveMeetingProfileResponse> responseObserver) {
                serviceImpl.removeMeetingProfile(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_UPDATE_MEETING_PROFILE,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.UpdateMeetingProfileRequest,
                com.gbusiness.agentslot.api.UpdateMeetingProfileResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.UpdateMeetingProfileRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.UpdateMeetingProfileResponse> responseObserver) {
                serviceImpl.updateMeetingProfile(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_GET_MEETING_PROFILES,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.GetMeetingProfilesRequest,
                com.gbusiness.agentslot.api.GetMeetingProfilesResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.GetMeetingProfilesRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetMeetingProfilesResponse> responseObserver) {
                serviceImpl.getMeetingProfiles(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_GET_AGENT_SLOTS_SETTINGS,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest,
                com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.GetAgentSlotsSettingsRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse> responseObserver) {
                serviceImpl.getAgentSlotsSettings(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_LIST_SLOTS,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.ListSlotsRequest,
                com.gbusiness.agentslot.api.ListSlotsResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.ListSlotsRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.ListSlotsResponse> responseObserver) {
                serviceImpl.listSlots(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_GET_SLOTS,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.GetSlotsRequest,
                com.gbusiness.agentslot.api.GetSlotsResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.GetSlotsRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.GetSlotsResponse> responseObserver) {
                serviceImpl.getSlots(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_ALLOCATE_SLOT,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.AllocateSlotRequest,
                com.gbusiness.agentslot.api.AllocateSlotResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.AllocateSlotRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.AllocateSlotResponse> responseObserver) {
                serviceImpl.allocateSlot(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_CONFIRM_SLOT,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.ConfirmSlotRequest,
                com.gbusiness.agentslot.api.ConfirmSlotResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.ConfirmSlotRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.ConfirmSlotResponse> responseObserver) {
                serviceImpl.confirmSlot(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_FREE_SLOT,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.FreeSlotRequest,
                com.gbusiness.agentslot.api.FreeSlotRequest>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.FreeSlotRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.FreeSlotRequest> responseObserver) {
                serviceImpl.freeSlot(request, responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_RESCHEDULE_SLOT,
          asyncUnaryCall(
            new io.grpc.stub.ServerCalls.UnaryMethod<
                com.gbusiness.agentslot.api.RescheduleSlotRequest,
                com.gbusiness.agentslot.api.RescheduleSlotResponse>() {
              @java.lang.Override
              public void invoke(
                  com.gbusiness.agentslot.api.RescheduleSlotRequest request,
                  io.grpc.stub.StreamObserver<com.gbusiness.agentslot.api.RescheduleSlotResponse> responseObserver) {
                serviceImpl.rescheduleSlot(request, responseObserver);
              }
            }))).build();
  }
}
