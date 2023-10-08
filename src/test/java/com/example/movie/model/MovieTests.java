package com.example.movie.model;

import com.example.movie.model.dto.MovieDTO;
import com.example.movie.model.dto.MovieDate;
import com.example.movie.model.service.MovieServiece;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootTest
public class MovieTests {

    @Autowired
    private MovieServiece movieServiece;

    private static Stream<Arguments> getMovieInfo() {
        return Stream.of(
                Arguments.of(
                        "잠",
                        "몽유병...",
                        "이선균",
                        "유재선",
                        "Lewis Pictures",
                        "한국",
                        "ROLE_YOUTH",
                        "2023-11-11",
                        LocalDate.now()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getMovieInfo")
    void testMovieInfo(String title, String content, String cast, String produce,
                       String producer, String country, MovieRole movieRole, LocalDate released, LocalDate enrollDate) {

        MovieDTO movieInfo = new MovieDTO(title, content, cast, produce, producer, country, movieRole, released, enrollDate);
        Assertions.assertDoesNotThrow(
                () -> movieServiece.registMovie(movieInfo));
    }
}