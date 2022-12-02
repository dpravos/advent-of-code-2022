package com.dpravos.shared;

public class ExampleInputGetter implements InputGetter {
    @Override
    public String day(int day) {
        return switch (day) {
            case 1 -> """
                    1000
                    2000
                    3000
                                            
                    4000
                                            
                    5000
                    6000
                                            
                    7000
                    8000
                    9000
                                            
                    10000
                    """;
            case 2 -> """
                    A Y
                    B X
                    C Z
                    """;
            default -> throw new IllegalArgumentException("Invalid day number.");
        };
    }
}
