package ru.javawebinar.springpolls.model;

import java.time.LocalDate;
import java.util.List;


public class Poll {
    private String title;
    private LocalDate datePublished;
    private List<Diner> diners;
    private String result;

    public Poll(String title) {
        this.title = title;
        datePublished = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public String getResult() {
        return result;
    }

}
