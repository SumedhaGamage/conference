package com.conference.api.repository;

import com.conference.api.documents.Announcement;
import com.conference.api.documents.Staff;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * StaffRepo
 */
public interface AnnouncementRepo extends MongoRepository<Announcement, String>{

    
}