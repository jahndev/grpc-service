package com.gbusiness.agentslot.dao;

import com.gbusiness.agentslot.domain.ProductModel;

import java.util.List;

public interface ProductDao {
    List<ProductModel> findAll();
    void persist(ProductModel product);
}
