package ru.otus.pattern.adapter.program2.generator;

import org.junit.jupiter.api.Test;
import ru.otus.pattern.adapter.program2.model.Matrix2;

import static java.util.Objects.nonNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrixGeneratorTest {

    MatrixGenerator matrixGenerator = new MatrixGeneratorImpl();

    @Test
    public void generateTestShouldSuccessCreate2Matrix() {
        Matrix2 generate = matrixGenerator.generate();

        assertTrue(nonNull(generate.getMatrix1()));
        assertTrue(nonNull(generate.getMatrix2()));
        assertEquals(3, generate.getMatrix1().length);
        assertEquals(3, generate.getMatrix2().length);
    }

}