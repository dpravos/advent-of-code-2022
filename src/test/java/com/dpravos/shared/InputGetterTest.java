package com.dpravos.shared;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputGetterTest {

    @Test
    void should_return_days_input() {
        InputGetter inputGetter = new InputGetter();

        String input = inputGetter.day(1);

        assertEquals(ExpectedInput.value, input);
    }

}