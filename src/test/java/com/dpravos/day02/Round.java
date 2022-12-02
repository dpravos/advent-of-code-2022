package com.dpravos.day02;

import java.util.HashMap;
import java.util.Map;

public class Round {

    private final Play opponent;
    private final Play me;

    public Round(String opponent, String me) {
        this.opponent = Play.fromOpponent(opponent);
        this.me = Play.fromMe(me);
    }

    public int score() {
        return me.against(opponent).score() + me.score();
    }
}

enum Play {
    ROCK("A", "X", 1),
    PAPER("B", "Y", 2),
    SCISSORS("C", "Z", 3);

    private final String opponent;
    private final String me;
    private final int score;

    private static final Map<String, Play> opponentPlays = new HashMap<>();
    private static final Map<String, Play> myPlays = new HashMap<>();

    static {
        for (Play value : Play.values()) {
            opponentPlays.put(value.opponent, value);
        }
        for (Play value : Play.values()) {
            myPlays.put(value.me, value);
        }
    }

    Play(String opponent, String me, int score) {
        this.opponent = opponent;
        this.me = me;
        this.score = score;
    }

    public static Play fromOpponent(String opponent) {
        return opponentPlays.get(opponent);
    }

    public static Play fromMe(String me) {
        return myPlays.get(me);
    }

    public Result against(Play that) throws IllegalStateException {
        return switch (this.score - that.score % 3) {
            case 0 -> Result.DRAW;
            case 1 -> Result.WIN;
            case 2 -> Result.LOSE;
            default -> throw new IllegalStateException("Unexpected value: " + (this.score - that.score % 3));
        };
    }

    public int score() {
        return score;
    }
}

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