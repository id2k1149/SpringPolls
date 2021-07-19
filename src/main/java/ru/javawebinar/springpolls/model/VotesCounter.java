package ru.javawebinar.springpolls.model;

public class VotesCounter {
    private Diner diner;
    private Integer votes;

    public VotesCounter(Diner diner) {
        this.diner = diner;
        votes = 0;
    }

    public Diner getDiner() {
        return diner;
    }

    public void setDiner(Diner diner) {
        this.diner = diner;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
