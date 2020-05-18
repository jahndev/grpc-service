package com.gbusiness.agentslot.dao;

import com.gbusiness.agentslot.domain.TopicCategoryModel;

import java.util.List;

public interface TopicCategoryDao {
    List<TopicCategoryModel> findAll();
}
