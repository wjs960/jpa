package com.example.movie.model;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieServiece {
    MovieRepository movieRepository;

    public MovieServiece(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Transactional
    public void registMovie(MovieDTO movieInfo) {
        Movie movie = new Movie(
                movieInfo.getTitle(),
                movieInfo.getContent(),
                movieInfo.getCast(),
                movieInfo.getProduce(),
                movieInfo.getProducer(),
                movieInfo.getCountry(),
                movieInfo.getMovieRole(),
                new MovieDate(
                        movieInfo.getReleased(),
                        movieInfo.getEnrollDate()
                )
        );
        movieRepository.save(movie);
    }
}
