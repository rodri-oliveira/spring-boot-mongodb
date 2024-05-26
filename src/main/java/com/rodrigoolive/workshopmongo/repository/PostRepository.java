package com.rodrigoolive.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rodrigoolive.workshopmongo.domain.Post;

// Indica que esta interface é um repositório Spring
@Repository
// Declaração da interface que estende MongoRepository para a entidade Post
public interface PostRepository extends MongoRepository<Post, String> {
	
	List<Post> findByTitleContainingIgnoreCase(String text);
}
