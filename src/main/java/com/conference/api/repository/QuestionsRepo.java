package com.conference.api.repository;

import com.conference.api.documents.Question;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * QuestionsRepo
 */
public interface QuestionsRepo extends MongoRepository<Question,String>{

    
}