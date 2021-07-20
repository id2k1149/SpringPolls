package ru.javawebinar.springpolls.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

@Component
public class Description {
    private final Answer answer;
    private Map<Info, Integer> items = new LinkedHashMap<>();

    // Instance initialization block
    {
        Random random = new Random();
        int min = 2;
        int max = 5;
        int randomNumber = random.nextInt(max - min + 1) + min;
        for (int i = 0; i < randomNumber; i++) {
            int minPrice = 1;
            int maxPrice = 10;
            int price = random.nextInt(maxPrice - minPrice + 1) + minPrice;
            String dish = "Food #" + (i + 1);
            Info info = new Info(dish);
            items.put(info, price);
        }
    }

    @Autowired
    public Description(Answer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Menu from " + answer;
    }

    public Map<Info, Integer> getItems() {
        return items;
    }
}
