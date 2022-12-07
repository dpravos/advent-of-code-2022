package com.dpravos.day06;

public record Signal(String value) {

    public static Signal of(String value) {
        return new Signal(value);
    }

    public int startOfPacketMarker() {
        for (int i = 0; i < value.length() - 3; i++) {
            String sequence = value.substring(i, i + 4);
            if (new Sequence(sequence).isDistinct()) {
                return i + 4;
            }
        }

        return -1;
    }

    public int startOfMessageMarker() {
        for (int i = 0; i < value.length() - 13; i++) {
            String sequence = value.substring(i, i + 14);
            if (new Sequence(sequence).isDistinct()) {
                return i + 14;
            }
        }

        return -1;
    }
}
