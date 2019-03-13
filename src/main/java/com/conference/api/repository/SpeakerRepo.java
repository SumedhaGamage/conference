package com.conference.api.repository;

import com.conference.api.documents.Speaker;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * SpeakerRepo
 */
public interface SpeakerRepo extends MongoRepository<Speaker, String>{

    
}