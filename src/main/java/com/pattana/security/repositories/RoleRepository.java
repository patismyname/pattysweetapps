package com.pattana.security.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pattana.security.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRole(String role);
}
