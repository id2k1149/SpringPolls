package ru.javawebinar.springpolls.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.javawebinar.springpolls.model.Answer;
import ru.javawebinar.springpolls.model.Question;
import ru.javawebinar.springpolls.model.VotesCounter;


@Configuration
@ComponentScan("ru.javawebinar.springpolls.model")
@PropertySource("classpath:question.properties")
public class SpringConfigOld {

    @Bean
    public Answer answer() {
        return new Answer();
    }

    @Bean
    public Question question() {
        return new Question();
    }

    @Bean
    public VotesCounter votesCounter() {
        return new VotesCounter(question(), answer());
    }
}
