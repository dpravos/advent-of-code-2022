package com.dpravos.day02;

enum Result {
    WIN(6),
    DRAW(3),
    LOSE(0);

    private final int score;

    Result(int score) {
        this.score = score;
    }

    public int score() {
        return score;
    }
}
