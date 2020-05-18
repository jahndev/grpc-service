package com.gbusiness.agentslot.dao;

import com.gbusiness.agentslot.domain.ProductTopicModel;

import java.util.List;

public interface ProductTopicDao {
    List<ProductTopicModel> findAll();
}
