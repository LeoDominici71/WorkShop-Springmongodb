package com.LeoDominici.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LeoDominici.domain.User;


public interface UserRepository extends MongoRepository<User, String> {
	
	

}
