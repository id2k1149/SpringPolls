package ru.javawebinar.springpolls.model;

public class Answer {
    private String name;

    public Answer(){}

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
}
