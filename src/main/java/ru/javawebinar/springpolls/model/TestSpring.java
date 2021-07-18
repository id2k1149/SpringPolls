package ru.javawebinar.springpolls.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Question question = context.getBean("questionBean", Question.class);

        System.out.println(question.getTitle());

        context.close();
    }
}
