package ru.javawebinar.springpolls.model;

public class Answer {
    private Question question;
    private String answer;
    private Integer votes;

    public Answer(Question question, String answer, Integer votes) {
        this.question = question;
        this.answer = answer;
        this.votes = votes;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
