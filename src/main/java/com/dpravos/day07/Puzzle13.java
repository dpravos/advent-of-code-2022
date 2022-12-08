package com.dpravos.day07;

import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

public class Puzzle13 extends Puzzle {
    public Puzzle13(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {

        CommandParser commandParser = new CommandParser();
        Terminal terminal = new Terminal(commandParser);

        terminal.parse(inputGetter.day(7));

        var result = terminal.allDirectories().stream()
                .map(Directory::size)
                .filter(size -> size <= 100000)
                .reduce(0, Integer::sum);

        return String.valueOf(result);
    }

}
