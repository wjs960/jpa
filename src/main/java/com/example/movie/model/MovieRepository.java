package com.example.movie.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MovieRepository {

    @PersistenceContext
    private EntityManager manager;


    public void save(Movie movie) {
        manager.persist(movie);
    }
}
