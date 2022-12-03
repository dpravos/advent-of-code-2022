package com.dpravos.shared;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputGetterTest {

    @Test
    void should_return_days_input() {
        HttpInputGetter inputGetter = new HttpInputGetter();

        var input = inputGetter.day(1);

        assertEquals(ExpectedInput.value, input.content());
    }

}