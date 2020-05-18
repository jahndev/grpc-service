package com.gbusiness.agentslot.dao;

import com.gbusiness.agentslot.domain.AgentSlotModel;
import com.google.inject.Inject;
import com.google.inject.Provider;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

public class AgentSlotDaoJpa implements AgentSlotDao {

    private Provider<EntityManager> entityManagerProvider;

    @Inject
    public AgentSlotDaoJpa(Provider<EntityManager> entityManagerProvider) {
        this.entityManagerProvider = entityManagerProvider;
    }

    private EntityManager getEntityManager() {
        return entityManagerProvider.get();
    }

    @Override
    public List<AgentSlotModel> findByDateRange(LocalDateTime from, LocalDateTime to) {
        return getEntityManager().createQuery("SELECT c FROM AgentSlot c " +
                "WHERE c.slotFrom >= :from AND c.slotTo <= :to ")
                .setParameter("from", from)
                .setParameter("to", to)
                .getResultList();
    }
}
