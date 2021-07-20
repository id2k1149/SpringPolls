package ru.javawebinar.springpolls.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Answer answer1 = context.getBean("answer", Answer.class);
        System.out.println(answer1.toString());

        Answer answer2 = context.getBean("answer", Answer.class);
        System.out.println(answer2.toString());

        VotesCounter counter = context.getBean("votesCounter", VotesCounter.class);
        counter.maxVotes();
        System.out.println(counter.toString());
        System.out.println("-----");

        Description menu = context.getBean("description", Description.class);
        System.out.println(menu);
//        System.out.println(menu.getItems());


        Map<Info, Integer> dinerMenu = menu.getItems();
//        System.out.println(dinerMenu);

        for(Map.Entry<Info, Integer> entry : dinerMenu.entrySet()) {
            System.out.println(entry.getKey().getName() + " : $" + entry.getValue());
        }



        System.out.println("-----");


        System.out.println(counter.getAnswer().getName());
        System.out.println(counter.getQuestion().getDatePublished());




        context.close();
    }
}
