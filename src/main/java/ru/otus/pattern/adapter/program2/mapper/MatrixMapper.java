package ru.otus.pattern.adapter.program2.mapper;

import ru.otus.pattern.adapter.program1.model.MatrixP1;
import ru.otus.pattern.adapter.program2.model.Matrix2;

public class MatrixMapper {

    public MatrixP1 mapMatrix(Matrix2 matrix2) {
        return new MatrixP1(matrix2.getMatrix1(), matrix2.getMatrix2());
    }

}
