package com.springbootmongo.aulamongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootmongo.aulamongodb.domain.Post;


public interface PostRepository extends MongoRepository<Post, String>{

	List<Post> findByTitleContainingIgnoreCase(String text);
}
