package com.dpravos.day02;

import java.util.HashMap;
import java.util.Map;

enum Play {
    ROCK("A", "X", 1),
    PAPER("B", "Y", 2),
    SCISSORS("C", "Z", 3);

    private final String opponent;
    private final String me;
    private final int score;

    private static final Map<String, Play> opponentPlays = new HashMap<>();
    private static final Map<String, Play> myPlays = new HashMap<>();
    private static final Map<Integer, Play> scores = new HashMap<>();

    static {
        for (Play value : Play.values()) {
            opponentPlays.put(value.opponent, value);
        }
        for (Play value : Play.values()) {
            myPlays.put(value.me, value);
        }
        for (Play value : Play.values()) {
            scores.put(value.score, value);
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

    public static Play ofScore(int score) {
        return scores.get(score);
    }

    public Result against(Play that) throws IllegalStateException {
        return switch (Math.floorMod(this.score - that.score, 3)) {
            case 0 -> Result.DRAW;
            case 1 -> Result.WIN;
            case 2 -> Result.LOSE;
            default -> throw new IllegalStateException("Unexpected value: " + (this.score - that.score % 3));
        };
    }

    public int score() {
        return score;
    }

    public Play suchThat(ResultV2 result) {
        return switch (result) {
            case DRAW -> this;
            case WIN -> Play.ofScore(Math.floorMod(this.score, 3) + 1);
            case LOSE -> Play.ofScore(Math.floorMod(this.score + 1, 3) + 1);
        };
    }
}
