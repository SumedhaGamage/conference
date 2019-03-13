package com.conference.api.repository;

import com.conference.api.documents.Category;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * CategoryRepo
 */
public interface CategoryRepo extends MongoRepository<Category,String>{

    
}