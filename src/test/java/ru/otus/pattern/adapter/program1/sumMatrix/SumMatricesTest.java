package ru.otus.pattern.adapter.program1.sumMatrix;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import ru.otus.pattern.adapter.program1.model.MatrixP1;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SumMatricesTest {

    private SumMatrices sumMatrices;
    private MatrixP1 matrixP1;

    @BeforeAll
    public void init() {
        sumMatrices = new SumMatricesImpl();
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        matrixP1 = new MatrixP1(matrix1, matrix1);
    }

    @Test
    public void sumMatricesTestShouldSuccess() {
        int[][] ints = sumMatrices.sumMatrices(matrixP1);

        int[][] expected = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };

        assertThat(ints).isEqualTo(expected);
    }

}