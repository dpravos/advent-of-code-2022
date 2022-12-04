package com.dpravos.day04;

public record AssignmentPair(Assignment first, Assignment second) {

    public static AssignmentPair fromLine(String line) {
        var intervals = line.split(",");
        var firstBounds = intervals[0].split("-");
        var secondBounds = intervals[1].split("-");

        var first = new Assignment(Integer.parseInt(firstBounds[0]), Integer.parseInt(firstBounds[1]));
        var second = new Assignment(Integer.parseInt(secondBounds[0]), Integer.parseInt(secondBounds[1]));
        return new AssignmentPair(first, second);
    }

    public boolean fullOverlap() {
        return first.contains(second) || second.contains(first);
    }
}
