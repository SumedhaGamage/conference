package com.conference.api.repository;

import java.util.List;

import com.conference.api.documents.Sponser;
import com.conference.api.documents.Staff;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * StaffRepo
 */
public interface SponserRepo extends MongoRepository<Sponser, String> {

    public List<Sponser> findByKind(String kind);
}