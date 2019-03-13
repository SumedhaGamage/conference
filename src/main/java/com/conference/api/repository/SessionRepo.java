package com.conference.api.repository;

import com.conference.api.documents.Session;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * SessionRepo
 */

public interface SessionRepo extends MongoRepository<Session, String>{

    
}