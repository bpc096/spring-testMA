package com.example.testMA.testMA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testMA.testMA.models.entity.Articles;

@Repository
public interface ArticlesRepository extends JpaRepository<Articles, Integer> {
    
}
