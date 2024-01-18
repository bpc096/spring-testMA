package com.example.testMA.testMA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testMA.testMA.models.entity.Forums;

@Repository
public interface ForumsRepository extends JpaRepository<Forums, Integer> {
    
}
