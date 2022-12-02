package com.dpravos.day01;

import java.util.ArrayList;
import java.util.List;

class Stack {

    private final List<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    public int calories() {
        return foods.stream().map(Food::calories).reduce(0, Integer::sum);
    }
}
