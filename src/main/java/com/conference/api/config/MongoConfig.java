package com.conference.api.config;

import java.io.IOException;

import com.mongodb.MongoClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

//import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;

/**
 * MongoConfig
 */
@Configuration
public class MongoConfig {
//     private final static String MONGO_DB_URL = "localhost";
//     private final static String MONGO_DB_NAME = "embeded_db";

//     @Bean
//     public MongoTemplate mongoTemplate() throws IOException {
//      EmbeddedMongoFactoryBean mongo = new EmbeddedMongoFactoryBean();
//      mongo.setBindIp(MONGO_DB_URL);
//      MongoClient mongoClient = mongo.getObject();
//      MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, MONGO_DB_NAME);
//      return mongoTemplate;
//  }
    
}