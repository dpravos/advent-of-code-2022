package com.dpravos.shared;

import org.junit.jupiter.api.BeforeEach;

public abstract class PuzzleTest {
    protected InputGetter inputGetter;

    @BeforeEach
    void setUp() {
        inputGetter = new ExampleInputGetter();
    }
}
