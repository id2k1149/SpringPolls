package ru.javawebinar.springpolls.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Description {
    private Answer answer;
    private Map<Info, BigDecimal> items = new HashMap<>();

}
