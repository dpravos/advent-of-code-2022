package com.dpravos.day02;

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
