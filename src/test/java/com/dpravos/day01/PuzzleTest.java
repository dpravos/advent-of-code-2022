package com.dpravos.day01;

import com.dpravos.shared.ExampleInputGetter;
import com.dpravos.shared.InputGetter;
import org.junit.jupiter.api.BeforeEach;

public abstract class PuzzleTest {
    protected InputGetter inputGetter;

    @BeforeEach
    void setUp() {
        inputGetter = new ExampleInputGetter();
    }
}
