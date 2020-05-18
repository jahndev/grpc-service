package com.gbusiness.agentslot.dao;

import com.gbusiness.agentslot.domain.AgentSlotModel;

import java.time.LocalDateTime;
import java.util.List;

public interface AgentSlotDao {
    List<AgentSlotModel> findByDateRange(LocalDateTime from, LocalDateTime to);
}
