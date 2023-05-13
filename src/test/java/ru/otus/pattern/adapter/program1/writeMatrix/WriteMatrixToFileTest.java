package ru.otus.pattern.adapter.program1.writeMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class WriteMatrixToFileTest {

    private WriteMatrixToFile writeMatrixToFile = new WriteMatrixToFileImpl();

    @Test
    public void writeMatrixTestShouldSuccess() {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        assertDoesNotThrow(() -> writeMatrixToFile.writeMatrix(matrix1));
    }

}