package com.dpravos.day03;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

import java.util.stream.IntStream;

public class Puzzle6 extends Puzzle {

    public Puzzle6(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {
        var lines = inputGetter.day(3).lines();

        var groups = IntStream.range(0, lines.size() / 3)
                .mapToObj(i -> lines.subList(i * 3, i * 3 + 3))
                .map(linesGroup -> Group.fromContent(linesGroup.get(0), linesGroup.get(1), linesGroup.get(2)))
                .toList();

        Integer totalPriority = groups.stream().map(Group::priority).reduce(0, Integer::sum);

        return String.valueOf(totalPriority);
    }
}
