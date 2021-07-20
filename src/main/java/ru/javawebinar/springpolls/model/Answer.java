package ru.javawebinar.springpolls.model;

import org.springframework.stereotype.Component;

@Component
public class Answer {
    private String name;

    public Answer() {
        name = "Diner#3"; }

    public Answer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doMyInit(){
        System.out.println("init Answer");

    }

    public void doMyDestroy(){
        System.out.println("destroy Answer");

    }

    @Override
    public String toString() {
        return name;
    }
}
