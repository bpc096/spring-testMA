package com.example.testMA.testMA.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.testMA.testMA.models.entity.Threads;
import com.example.testMA.testMA.repositories.ThreadsRepository;

public class ThreadsServices {
    private ThreadsRepository threadsRepository;
  
    public List<Threads> getAll() {
        return threadsRepository.findAll();
    }

    public Threads getById(Integer id) {
        return threadsRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Threads not found!!!"));
    }

    public Threads create(Threads threads) {
        return threadsRepository.save(threads);
    }

    public Threads update(Integer id, Threads threads) {
        getById(id);
        threads.setId(id);
        return threadsRepository.save(threads);
    }

    public Threads delete(Integer id) {
        Threads threads = getById(id);
        threadsRepository.delete(threads);
        return threads;
    }
}
