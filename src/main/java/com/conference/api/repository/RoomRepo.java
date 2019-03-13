package com.conference.api.repository;

import com.conference.api.documents.Room;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * RoomRepo
 */
public interface RoomRepo extends MongoRepository<Room, String>{

    
}