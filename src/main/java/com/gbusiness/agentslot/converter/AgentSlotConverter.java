package com.gbusiness.agentslot.converter;

import com.gbusiness.agentslot.api.AgentSlot;
import com.gbusiness.agentslot.api.SlotStatus;
import com.gbusiness.agentslot.api.TimeInterval;
import com.gbusiness.agentslot.domain.AgentSlotModel;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AgentSlotConverter implements Converter<AgentSlotModel, AgentSlot> {
    @Override
    public AgentSlot toProto(AgentSlotModel model) {
        return AgentSlot.newBuilder()
                .setId(model.getId().toString())
                .setAgentId(model.getAgentId().toString())
                .setStatus(SlotStatus.valueOf(model.getStatus()))
                .setTimeInterval(
                        TimeInterval.newBuilder()
                                .setFrom(model.getSlotFrom().toString())
                                .setFrom(model.getSlotTo().toString())
                                .build()
                )
                .build();
    }

    @Override
    public AgentSlotModel fromProto(AgentSlot proto) {
        return new AgentSlotModel(
                Integer.valueOf(proto.getId()),
                Integer.valueOf(proto.getAgentId()),
                proto.getStatus().getNumber(),
                LocalDateTime.ofInstant(
                        Instant.parse(proto.getTimeInterval().getFrom()), ZoneId.systemDefault()),
                LocalDateTime.ofInstant(
                        Instant.parse(proto.getTimeInterval().getTo()), ZoneId.systemDefault())
        );
    }
}
