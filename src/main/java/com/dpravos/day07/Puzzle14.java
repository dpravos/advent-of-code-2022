package com.dpravos.day07;

import com.dpravos.day07.command.CommandParser;
import com.dpravos.day07.node.Directory;
import com.dpravos.shared.InputGetter;
import com.dpravos.shared.Puzzle;

import java.util.Comparator;

public class Puzzle14 extends Puzzle {
    public Puzzle14(InputGetter inputGetter) {
        super(inputGetter);
    }

    @Override
    public String solve() {

        CommandParser commandParser = new CommandParser();
        Terminal terminal = new Terminal(commandParser);

        terminal.parse(inputGetter.day(7));

        var totalDisk = 70000000;
        var spaceNeeded = 30000000;
        var spaceUsed = terminal.size();
        var freeSpace = totalDisk - spaceUsed;
        var toLiberate = spaceNeeded - freeSpace;

        var result = terminal.allDirectories().stream()
                .map(Directory::size)
                .filter(size -> size >= toLiberate)
                .min(Comparator.comparingInt(a -> a))
                .orElseThrow();

        return String.valueOf(result);
    }

}
