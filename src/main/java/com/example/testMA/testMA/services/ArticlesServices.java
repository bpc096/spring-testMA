package com.example.testMA.testMA.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.testMA.testMA.models.entity.Articles;
import com.example.testMA.testMA.repositories.ArticlesRepository;

public class ArticlesServices {
    private ArticlesRepository articlesRepository;
  
    public List<Articles> getAll() {
        return articlesRepository.findAll();
    }

    public Articles getById(Integer id) {
        return articlesRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Article not found!!!"));
    }

    public Articles create(Articles articles) {
        return articlesRepository.save(articles);
    }

    public Articles update(Integer id, Articles articles) {
        getById(id);
        articles.setId(id);
        return articlesRepository.save(articles);
    }

    public Articles delete(Integer id) {
        Articles articles = getById(id);
        articlesRepository.delete(articles);
        return articles;
    }
}
