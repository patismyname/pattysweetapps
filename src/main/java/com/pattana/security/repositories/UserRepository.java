package com.pattana.security.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pattana.security.models.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
}
