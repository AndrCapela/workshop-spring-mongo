package com.andrcapela.workshopmongo.servides;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrcapela.workshopmongo.domain.Post;
import com.andrcapela.workshopmongo.repository.PostRepository;
import com.andrcapela.workshopmongo.servides.exception.ObjectNotFoundException;

@Service
public class PostService {
	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
