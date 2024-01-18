package com.example.testMA.testMA.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.testMA.testMA.models.entity.Votes;
import com.example.testMA.testMA.repositories.VotesRepository;

public class VotesServices {
    private VotesRepository votesRepository;
  
    public List<Votes> getAll() {
        return votesRepository.findAll();
    }

    public Votes getById(Integer id) {
        return votesRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Votes not found!!!"));
    }

    public Votes create(Votes votes) {
        return votesRepository.save(votes);
    }

    public Votes update(Integer id, Votes votes) {
        getById(id);
        votes.setId(id);
        return votesRepository.save(votes);
    }

    public Votes delete(Integer id) {
        Votes votes = getById(id);
        votesRepository.delete(votes);
        return votes;
    }
}
