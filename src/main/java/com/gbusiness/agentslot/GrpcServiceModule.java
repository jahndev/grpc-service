package com.gbusiness.agentslot;

import com.gbusiness.agentslot.api.AgentSlotServiceGrpc;
import com.gbusiness.agentslot.api.ProductServiceGrpc;
import com.gbusiness.agentslot.dao.*;
import com.gbusiness.agentslot.server.GrpcServerMain;
import com.gbusiness.agentslot.service.GrpcAgentSlotService;
import com.gbusiness.agentslot.service.GrpcProductService;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.google.inject.persist.jpa.JpaPersistModule;

import java.util.Properties;

public class GrpcServiceModule extends AbstractModule {

    public GrpcServiceModule() {
    }

    @Override
    protected void configure() {
        //Server
        bind(GrpcServerMain.class).asEagerSingleton();
        bind(Integer.class).annotatedWith(Names.named("GrpcPort")).toInstance(50062);
        bind(String.class).annotatedWith(Names.named("GrpcHost")).toInstance("localhost");

        //Service
        bind(ProductServiceGrpc.ProductService.class).to(GrpcProductService.class);
        bind(AgentSlotServiceGrpc.AgentSlotService.class).to(GrpcAgentSlotService.class);


        //Dao
        bind(ProductDao.class).to(ProductDaoJpa.class);
        bind(ProductTopicDao.class).to(ProductTopicDaoJpa.class);
        bind(TopicCategoryDao.class).to(TopicCategoryDaoJpa.class);
        bind(AgentSlotDao.class).to(AgentSlotDaoJpa.class);

        // Jpa
        binder().install(new JpaPersistModule("JpaUnit").properties(getPersistenceProperties()));
        binder().bind(PersistenceInitializer.class).asEagerSingleton();
    }

    private static Properties getPersistenceProperties() {
        Properties properties = new Properties();
        properties.put("javax.persistence.jdbc.driver", "com.mysql.jdbc.Driver");
        properties.put("javax.persistence.jdbc.url", "jdbc:mysql://localhost:3306/gbusiness_20200417");
        properties.put("javax.persistence.jdbc.user", "gbusiness");
        properties.put("javax.persistence.jdbc.password", "gbusiness");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        return properties;
    }
}