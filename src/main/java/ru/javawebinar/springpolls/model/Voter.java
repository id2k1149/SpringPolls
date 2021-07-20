package ru.javawebinar.springpolls.model;

import java.time.LocalDate;

public class Voter {
    private LocalDate datePublished;
    private User user;
    private Poll question;
    private Answer answer;

}
