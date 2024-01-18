package com.example.testMA.testMA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testMA.testMA.models.entity.Votes;

public interface VotesRepository extends JpaRepository<Votes, Integer>{
    
}
