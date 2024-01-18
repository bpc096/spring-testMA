package com.example.testMA.testMA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testMA.testMA.models.entity.Posts;

public interface PostsRepository extends JpaRepository<Posts, Integer> {
    
}
