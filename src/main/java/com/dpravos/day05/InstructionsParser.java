package com.dpravos.day05;

import java.util.List;
import java.util.stream.Collectors;

public class InstructionsParser {
    public List<Instruction> parse(List<String> lines) {
        return lines.stream().map(this::parseLine).collect(Collectors.toList());
    }

    private Instruction parseLine(String line) {
        String[] words = line.split(" ");
        var quantity = Integer.parseInt(words[1]);
        var origin = Integer.parseInt(words[3]);
        var destination = Integer.parseInt(words[5]);
        return new Instruction(quantity, origin, destination);
    }
}
