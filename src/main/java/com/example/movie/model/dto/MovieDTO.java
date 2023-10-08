package com.example.movie.model.dto;

import com.example.movie.model.MovieRole;

import java.time.LocalDate;

public class MovieDTO {

    private String title; // 제목
    private String content; // 줄거리
    private String cast; // 출연진
    private String produce; // 감독
    private String producer; // 제작사
    private String country; // 개봉국가
    private MovieRole movieRole; // 이용등급
    private LocalDate released;
    private LocalDate enrollDate;

    protected MovieDTO() {}

    public MovieDTO(String title, String content, String cast, String produce, String producer, String country, MovieRole movieRole, LocalDate released, LocalDate enrollDate) {
        this.title = title;
        this.content = content;
        this.cast = cast;
        this.produce = produce;
        this.producer = producer;
        this.country = country;
        this.movieRole = movieRole;
        this.released = released;
        this.enrollDate = enrollDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCast() {
        return cast;
    }

    public String getProduce() {
        return produce;
    }

    public String getProducer() {
        return producer;
    }

    public String getCountry() {
        return country;
    }

    public MovieRole getMovieRole() {
        return movieRole;
    }

    public LocalDate getReleased() {
        return released;
    }

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", cast='" + cast + '\'' +
                ", produce='" + produce + '\'' +
                ", producer='" + producer + '\'' +
                ", country='" + country + '\'' +
                ", movieRole=" + movieRole +
                ", released=" + released +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
