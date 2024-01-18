package com.example.testMA.testMA.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.testMA.testMA.models.entity.Posts;
import com.example.testMA.testMA.repositories.PostsRepository;

public class PostsServices {
     private PostsRepository postsRepository;
  
    public List<Posts> getAll() {
        return postsRepository.findAll();
    }

    public Posts getById(Integer id) {
        return postsRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Posts not found!!!"));
    }

    public Posts create(Posts posts) {
        return postsRepository.save(posts);
    }

    public Posts update(Integer id, Posts posts) {
        getById(id);
        posts.setId(id);
        return postsRepository.save(posts);
    }

    public Posts delete(Integer id) {
        Posts posts = getById(id);
        postsRepository.delete(posts);
        return posts;
    }
}
