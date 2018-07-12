package com.exspring.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.exspring.demo.entity.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}