package com.springbootmongo.aulamongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootmongo.aulamongodb.domain.User;


public interface UserRepository extends MongoRepository<User, String>{

}
