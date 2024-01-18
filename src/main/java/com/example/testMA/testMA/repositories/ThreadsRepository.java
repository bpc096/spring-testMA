package com.example.testMA.testMA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testMA.testMA.models.entity.Threads;

public interface ThreadsRepository extends JpaRepository<Threads, Integer>{
    
}
