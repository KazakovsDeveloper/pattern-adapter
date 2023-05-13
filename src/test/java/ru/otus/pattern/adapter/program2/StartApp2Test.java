package ru.otus.pattern.adapter.program2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class StartApp2Test {

    private StartApp2 startApp2 = new StartApp2();

    @Test
    public void startProgram2TestShouldSuccess() {
        assertDoesNotThrow(() -> startApp2.startProgram2());
    }

}