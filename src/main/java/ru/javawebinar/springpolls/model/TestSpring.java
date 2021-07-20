package ru.javawebinar.springpolls.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        VotesCounter counter = context.getBean("votesCounter", VotesCounter.class);

        counter.maxVotes();

        System.out.println(counter.getAnswer().getName());
        System.out.println(counter);




        context.close();
    }
}
