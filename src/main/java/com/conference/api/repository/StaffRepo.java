package com.conference.api.repository;

import com.conference.api.documents.Staff;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * StaffRepo
 */
public interface StaffRepo extends MongoRepository<Staff, String>{

    
}