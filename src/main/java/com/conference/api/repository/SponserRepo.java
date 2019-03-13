package com.conference.api.repository;

import com.conference.api.documents.Sponser;
import com.conference.api.documents.Staff;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * StaffRepo
 */
public interface SponserRepo extends MongoRepository<Sponser, String> {

    
}