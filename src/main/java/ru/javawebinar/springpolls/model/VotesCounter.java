package ru.javawebinar.springpolls.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VotesCounter {
    private Poll poll;
    private Answer answer;
    private Integer votes;

    public VotesCounter(){
        votes = 0;

    }

    @Autowired
    public VotesCounter(Poll poll, Answer answer) {
        this.poll = poll;
        this.answer = answer;
        votes = 0;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void doMyInit(){
        System.out.println("init Vote");

    }

    public void doMyDestroy(){
        System.out.println("destroy Vote");

    }

    public void maxVotes(){
        System.out.println(poll.bestResult() + " for " + poll +
                " with "  + votes.toString() + " votes for " + answer.getName());
    }

    @Override
    public String toString() {
        return "Poll " + poll +
                " Answer " + answer +
                " votes = " + votes;
    }
}
