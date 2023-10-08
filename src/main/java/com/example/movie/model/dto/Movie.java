package com.example.movie.model.dto;

import com.example.movie.model.MovieRole;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "TBL_MOVIE")
public class Movie {

    @Id
    @Column(name = "MOVIE_CODE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieCode;
    @Column(name = "TITLE")
    private String title; // 제목
    @Column(name = "CONTENT", length = 1000)
    private String content; // 줄거리
    @Column(name = "CAST")
    private String cast; // 출연진
    @Column(name = "PRODUCE")
    private String produce; // 감독
    @Column(name = "PRODUCER")
    private String producer; // 제작사
    @Column(name = "COUNTRY ")
    private String country; // 개봉국가
    @Column(name = "MOVIE_ROLE")
    @Enumerated(EnumType.STRING)
    private MovieRole movieRole; // 이용등급
    @Embedded
    private MovieDate movieDate;

    protected Movie() {}

    public Movie(String title, String content, String cast, String produce, String producer, String country, MovieRole movieRole, MovieDate movieDate) {
        this.title = title;
        this.content = content;
        this.cast = cast;
        this.produce = produce;
        this.producer = producer;
        this.country = country;
        this.movieRole = movieRole;
        this.movieDate = movieDate;
    }

    public String getCast() {
        return cast;
    }

    public String getProduce() {
        return produce;
    }

    public MovieRole getMovieRole() {
        return movieRole;
    }

    public int getMovieCode() {
        return movieCode;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


    public String getProducer() {
        return producer;
    }

    public String getCountry() {
        return country;
    }

    public MovieDate getMovieDate() {
        return movieDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieCode=" + movieCode +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", cast='" + cast + '\'' +
                ", produce='" + produce + '\'' +
                ", producer='" + producer + '\'' +
                ", country='" + country + '\'' +
                ", movieRole=" + movieRole +
                ", movieDate=" + movieDate +
                '}';
    }
}
