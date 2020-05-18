package com.gbusiness.agentslot.dao;

import com.gbusiness.agentslot.domain.ProductTopicModel;
import com.google.inject.Inject;
import com.google.inject.Provider;

import javax.persistence.EntityManager;
import java.util.List;

public class ProductTopicDaoJpa implements ProductTopicDao {

    private Provider<EntityManager> entityManagerProvider;

    @Inject
    public ProductTopicDaoJpa(Provider<EntityManager> entityManagerProvider) {
        this.entityManagerProvider = entityManagerProvider;
    }

    @Override
    public List<ProductTopicModel> findAll() {
        return getEntityManager().createQuery("SELECT p FROM ProductTopic p").getResultList();
    }

    private EntityManager getEntityManager() {
        return entityManagerProvider.get();
    }
}
