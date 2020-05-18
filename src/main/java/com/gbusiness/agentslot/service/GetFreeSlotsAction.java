package com.gbusiness.agentslot.service;

import com.gbusiness.agentslot.api.*;
import com.gbusiness.agentslot.converter.AgentSlotConverter;
import com.gbusiness.agentslot.dao.AgentSlotDao;
import com.gbusiness.agentslot.domain.AgentSlotModel;
import com.google.inject.Inject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class GetFreeSlotsAction implements Action<ListSlotsRequest, ListSlotsResponse> {

    private AgentSlotDao agentSlotDao;
    private AgentSlotConverter agentSlotConverter;

    @Inject
    public GetFreeSlotsAction(AgentSlotDao agentSlotDao, AgentSlotConverter agentSlotConverter) {
        this.agentSlotDao = agentSlotDao;
        this.agentSlotConverter = agentSlotConverter;
    }

    @Override
    public ListSlotsResponse execute(ListSlotsRequest input) {
        List<AgentSlotModel> agentSlotModelList = agentSlotDao.findByDateRange(
                LocalDateTime.parse(input.getTimeInterval().getFrom(), DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                LocalDateTime.parse(input.getTimeInterval().getTo(), DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        );

        ListSlotsResponse.Builder responseBuilder = ListSlotsResponse.newBuilder();

        agentSlotModelList.forEach(agentSlotModel -> {
            AgentSlot agentSlot = agentSlotConverter.toProto(agentSlotModel);
            responseBuilder.addSlots(
                    AgentSlot.newBuilder()
                            .setTimeInterval(agentSlot.getTimeInterval())
                            .setStatus(agentSlot.getStatus())
                            .build()
            );
        });
        return responseBuilder.build();
    }
}
