package com.rodrigoolive.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigoolive.workshopmongo.domain.Post;
import com.rodrigoolive.workshopmongo.repository.PostRepository;
import com.rodrigoolive.workshopmongo.services.exception.ObjectNotFoundExcption;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundExcption("Object not found with id: " + id));
	}

	public List<Post> findByTtile(String text){
		return repo.searchTitle(text);
	}
}	