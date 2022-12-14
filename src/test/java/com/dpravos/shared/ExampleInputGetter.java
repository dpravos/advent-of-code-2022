package com.dpravos.shared;

public class ExampleInputGetter implements InputGetter {
    @Override
    public Input day(int day) {
        return new Input(content(day));
    }

    private String content(int day) {
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
            case 3 -> """
                    vJrwpWtwJgWrhcsFMMfFFhFp
                    jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                    PmmdzqPrVvPwwTWBwg
                    wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                    ttgJtRGJQctTZtZT
                    CrZsJsPPZsGzwwsLwLmpwMDw
                    """;
            case 4 -> """
                    2-4,6-8
                    2-3,4-5
                    5-7,7-9
                    2-8,3-7
                    6-6,4-6
                    2-6,4-8
                    """;
            case 5 -> """
                        [D]   \s
                    [N] [C]   \s
                    [Z] [M] [P]
                     1   2   3\s
                                        
                    move 1 from 2 to 1
                    move 3 from 1 to 3
                    move 2 from 2 to 1
                    move 1 from 1 to 2
                    """;
            case 6 -> "mjqjpqmgbljsphdztnvjfqwrcgsmlb";
            case 7 -> """
                    $ cd /
                    $ ls
                    dir a
                    14848514 b.txt
                    8504156 c.dat
                    dir d
                    $ cd a
                    $ ls
                    dir e
                    29116 f
                    2557 g
                    62596 h.lst
                    $ cd e
                    $ ls
                    584 i
                    $ cd ..
                    $ cd ..
                    $ cd d
                    $ ls
                    4060174 j
                    8033020 d.log
                    5626152 d.ext
                    7214296 k
                    """;
            case 8 -> """
                    30373
                    25512
                    65332
                    33549
                    35390
                    """;
            default -> throw new IllegalArgumentException("Invalid day number.");
        };
    }
}
