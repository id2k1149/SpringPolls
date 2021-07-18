package ru.javawebinar.springpolls.model;

import java.time.LocalDate;


public class Question {
    private String title;
    private LocalDate date_published;

    public Question(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
