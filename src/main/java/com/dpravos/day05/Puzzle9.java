package com.dpravos.day05;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

import java.util.Arrays;

public class Puzzle9 extends Puzzle {

    private final InputParser inputParser = new InputParser();
    private final CargoParser cargoParser = new CargoParser();
    private final InstructionsParser instructionsParser = new InstructionsParser();
    public Puzzle9(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {

        var input = inputGetter.day(5);

        var cargoInput = inputParser.cargoInput(input);
        var instructionsInput = inputParser.instructionsInput(input);

        var stacks = cargoParser.parse(cargoInput);
        var instructions = instructionsParser.parse(instructionsInput);

        var crane = new Crane(stacks);

        instructions.forEach(crane::move);

        return String.join("", Arrays.stream(stacks).map(Stack::top).toList());
    }
}
