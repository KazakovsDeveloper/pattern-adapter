package ru.otus.pattern.adapter.program1.readMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ReadMatricesTest {

    private ReadMatrices readMatrices = new ReadMatricesImpl();

    @Test
    public void readMatrixShouldSuccess() {
        assertDoesNotThrow(() -> readMatrices.readMatrix());
    }

}
