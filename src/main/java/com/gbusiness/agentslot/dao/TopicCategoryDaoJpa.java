package com.gbusiness.agentslot.dao;

import com.gbusiness.agentslot.domain.TopicCategoryModel;
import com.google.inject.Inject;
import com.google.inject.Provider;

import javax.persistence.EntityManager;
import java.util.List;

public class TopicCategoryDaoJpa implements TopicCategoryDao {

    private Provider<EntityManager> entityManagerProvider;

    @Inject
    public TopicCategoryDaoJpa(Provider<EntityManager> entityManagerProvider) {
        this.entityManagerProvider = entityManagerProvider;
    }

    private EntityManager getEntityManager() {
        return entityManagerProvider.get();
    }

    @Override
    public List<TopicCategoryModel> findAll() {
        return getEntityManager().createQuery("SELECT p FROM TopicCategory p").getResultList();
    }

}
