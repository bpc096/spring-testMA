package com.example.testMA.testMA.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.testMA.testMA.models.entity.Forums;
import com.example.testMA.testMA.repositories.ForumsRepository;

public class ForumsServices {
    private ForumsRepository forumsRepository;
  
    public List<Forums> getAll() {
        return forumsRepository.findAll();
    }

    public Forums getById(Integer id) {
        return forumsRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Forum not found!!!"));
    }

    public Forums create(Forums forums) {
        return forumsRepository.save(forums);
    }

    public Forums update(Integer id, Forums forums) {
        getById(id);
        forums.setId(id);
        return forumsRepository.save(forums);
    }

    public Forums delete(Integer id) {
        Forums forums = getById(id);
        forumsRepository.delete(forums);
        return forums;
    }
}
