package com.gbusiness.agentslot.dao;

import com.gbusiness.agentslot.domain.ProductModel;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

@Singleton
public class ProductDaoJpa implements ProductDao {

    private Provider<EntityManager> entityManagerProvider;

    @Inject
    public ProductDaoJpa(Provider<EntityManager> entityManagerProvider) {
        this.entityManagerProvider = entityManagerProvider;
    }

    private EntityManager getEntityManager() {
        return entityManagerProvider.get();
    }

    @Override
    public List<ProductModel> findAll() {
        return getEntityManager().createQuery("SELECT p FROM Product p").getResultList();
    }

    @Override
    public void persist(ProductModel product) {
        EntityTransaction transaction = getEntityManager().getTransaction();
        try {
            transaction.begin();
            getEntityManager().persist(product);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
}
