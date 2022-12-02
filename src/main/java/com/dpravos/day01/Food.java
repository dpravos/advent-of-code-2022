package com.dpravos.day01;

class Food {

    private final String calories;

    Food(String calories) {
        this.calories = calories;
    }

    public int calories() {
        return Integer.parseInt(calories);
    }
}
