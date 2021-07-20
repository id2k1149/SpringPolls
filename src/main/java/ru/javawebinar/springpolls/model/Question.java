package ru.javawebinar.springpolls.model;

import java.time.LocalDate;


public class Question implements Poll{
    private LocalDate datePublished;
    private String title;
    private String result;


    public Question() {
        datePublished = LocalDate.now();
        title = "Where to have a lunch?";
        result = "no result";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void doMyInit(){
        System.out.println("init Question");

    }

    public void doMyDestroy(){
        System.out.println("destroy Question");

    }

    @Override
    public String bestResult() {
        return result;
    }

    @Override
    public String toString() {
        return title;
    }
}
