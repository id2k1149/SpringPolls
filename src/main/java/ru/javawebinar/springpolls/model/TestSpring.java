package ru.javawebinar.springpolls.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        VotesCounter counter = context.getBean("voteBean", VotesCounter.class);

        counter.maxVotes();

        System.out.println(counter.getAnswer().getName());




        context.close();
    }
}
