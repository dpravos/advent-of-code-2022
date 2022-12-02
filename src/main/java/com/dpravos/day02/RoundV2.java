package com.dpravos.day02;

public class RoundV2 {

    private final Play opponent;
    private final ResultV2 result;

    public RoundV2(String opponent, String result) {
        this.opponent = Play.fromOpponent(opponent);
        this.result = ResultV2.of(result);
    }

    public int score() {
        var myPlay = opponent.suchThat(result);

        return myPlay.against(opponent).score() + myPlay.score();
    }

}
