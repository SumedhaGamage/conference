package com.conference.api.repository;

import com.conference.api.documents.Contributor;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * StaffRepo
 */
public interface ContributorRepo extends MongoRepository<Contributor, String> {

    
}