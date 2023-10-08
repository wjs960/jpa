package com.example.movie.model.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

@Embeddable
public class MovieDate {
    @Column(name = "RELEASED")
    private LocalDate released; // 개봉일
    @Column(name = "ENROLL_DATE")
    private LocalDate enrollDate; // 현재날짜
    @Column(name = "D_DAY")
    private long dDay; // d-day

    protected MovieDate() {}

    public MovieDate(LocalDate released, LocalDate enrollDate) {
        //validateNegativereleased(released, enrollDate);
        this.released = released;
        this.enrollDate = enrollDate;
        this.dDay = dDayGet(released, enrollDate);
    }

    private long dDayGet(LocalDate released, LocalDate enrollDate) {

        long dDay = ChronoUnit.DAYS.between(enrollDate,released);

        return dDay;
    }

  /*  private void validateNegativereleased(LocalDate released, LocalDate enrollDate) {
        if (released.isAfter(enrollDate)) {
            throw new IllegalArgumentException("개봉일은 현재날짜보다 작을 수 없습니다");
        }
    }*/

    public LocalDate getReleased() {
        return released;
    }

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public long getdDay() {
        return dDay;
    }

    @Override
    public String toString() {
        return "MovieDate{" +
                "released=" + released +
                ", enrollDate=" + enrollDate +
                ", dDay=" + dDay +
                '}';
    }
}
