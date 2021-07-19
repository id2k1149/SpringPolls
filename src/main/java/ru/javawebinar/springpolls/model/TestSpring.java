package ru.javawebinar.springpolls.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Poll poll = context.getBean("questionBean", Poll.class);



        context.close();
    }
}
