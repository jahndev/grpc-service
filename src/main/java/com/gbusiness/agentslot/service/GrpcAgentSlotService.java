package com.gbusiness.agentslot.service;

import com.gbusiness.agentslot.api.*;
import com.google.inject.Inject;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Protobuf service implementation
 */
public class GrpcAgentSlotService implements AgentSlotServiceGrpc.AgentSlotService {

    private static final Logger logger = LoggerFactory.getLogger(GrpcAgentSlotService.class);

    private GetFreeSlotsAction getFreeSlotsAction;

    @Inject
    public GrpcAgentSlotService(GetFreeSlotsAction getFreeSlotsAction) {
        this.getFreeSlotsAction = getFreeSlotsAction;
    }

    @Override
    public void createMeetingProfile(CreateMeetingProfileRequest request,
                                     StreamObserver<CreateMeetingProfileResponse> responseObserver) {

    }

    @Override
    public void removeMeetingProfile(RemoveMeetingProfileRequest request,
                                     StreamObserver<RemoveMeetingProfileResponse> responseObserver) {

    }

    @Override
    public void updateMeetingProfile(UpdateMeetingProfileRequest request,
                                     StreamObserver<UpdateMeetingProfileResponse> responseObserver) {

    }

    @Override
    public void getMeetingProfiles(GetMeetingProfilesRequest request,
                                   StreamObserver<GetMeetingProfilesResponse> responseObserver) {

    }

    @Override
    public void getAgentSlotsSettings(GetAgentSlotsSettingsRequest request,
                                      StreamObserver<GetAgentSlotsSettingsResponse> responseObserver) {

    }

    @Override
    public void listSlots(ListSlotsRequest request, StreamObserver<ListSlotsResponse> responseObserver) {
        ListSlotsResponse response = getFreeSlotsAction.execute(request);
        responseObserver.onValue(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getSlots(GetSlotsRequest request, StreamObserver<GetSlotsResponse> responseObserver) {

    }

    @Override
    public void allocateSlot(AllocateSlotRequest request, StreamObserver<AllocateSlotResponse> responseObserver) {

    }

    @Override
    public void confirmSlot(ConfirmSlotRequest request, StreamObserver<ConfirmSlotResponse> responseObserver) {

    }

    @Override
    public void freeSlot(FreeSlotRequest request, StreamObserver<FreeSlotRequest> responseObserver) {

    }

    @Override
    public void rescheduleSlot(RescheduleSlotRequest request, StreamObserver<RescheduleSlotResponse> responseObserver) {

    }
}
