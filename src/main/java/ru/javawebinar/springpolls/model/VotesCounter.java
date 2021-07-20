package ru.javawebinar.springpolls.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class VotesCounter {
    private Question question;
    private Answer answer;
    private Integer votes;

    public VotesCounter(){
        votes = 0;

    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("VotesCounter is doing its init");
    }


    @Autowired
    public VotesCounter(Question question, Answer answer) {
        this.question = question;
        this.answer = answer;
        votes = 0;
    }

    public void setPoll(Question question) {
        this.question = question;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public Question getQuestion() {
        return question;
    }



    public void doMyDestroy(){
        System.out.println("destroy Vote");

    }

    public void maxVotes(){
        System.out.println(question.bestResult() + " for " + question +
                " with "  + votes.toString() + " votes for " + answer.getName());
    }

    @Override
    public String toString() {
        return question.getDatePublished() + " --> " +
                "Question " + question +
                " Answer " + answer +
                " votes = " + votes;
    }
}
