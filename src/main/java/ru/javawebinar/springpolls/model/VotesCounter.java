package ru.javawebinar.springpolls.model;

public class VotesCounter {
    private Question question;
    private Answer answer;
    private Integer votes;

    public VotesCounter(){
        votes = 0;

    }

    public VotesCounter(Question question, Answer answer) {
        this.question = question;
        this.answer = answer;
        votes = 0;
    }

    public void setQuestion(Question question) {
        this.question = question;
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
        System.out.println(question.bestResult() + " for " + question +
                " with "  + votes.toString() + " votes for " + answer.getName());
    }


}
