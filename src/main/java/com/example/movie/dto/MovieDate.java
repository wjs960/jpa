package com.example.movie.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class MovieDate {
    @Column(name = "RELEASED")
    private LocalDateTime released; // 개봉일
    @Column(name = "ENROLL_DATE")
    private LocalDateTime enrollDate; // 현재날짜
    @Column(name = "D_DAY")
    private LocalDateTime dDay; // d-day


}
