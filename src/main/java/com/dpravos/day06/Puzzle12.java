package com.dpravos.day06;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

public class Puzzle12 extends Puzzle {

    public Puzzle12(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {
        var signal = Signal.of(inputGetter.day(6).lines().get(0));

        return String.valueOf(signal.startOfMessageMarker());
    }
}
