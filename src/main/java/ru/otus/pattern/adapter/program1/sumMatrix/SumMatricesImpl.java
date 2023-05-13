package ru.otus.pattern.adapter.program1.sumMatrix;

import ru.otus.pattern.adapter.program1.model.MatrixP1;

import static java.util.Objects.nonNull;

public class SumMatricesImpl implements SumMatrices {

    @Override
    public int[][] sumMatrices(MatrixP1 matrixP1) {
       if (nonNull(matrixP1.getMatrix1()) && nonNull(matrixP1.getMatrix2())) {
           int[][] matrix1 = matrixP1.getMatrix1();
           int[][] matrix2 = matrixP1.getMatrix2();
           if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
               throw new IllegalArgumentException("Размерности матриц не совпадают");
           }
           int rows = matrix1.length;
           int cols = matrix1[0].length;
           int[][] result = new int[rows][cols];

           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < cols; j++) {
                   result[i][j] = matrix1[i][j] + matrix2[i][j];
               }
           }
           return result;
       }
       throw new RuntimeException("Матрицы отсутствуют");
    }
}
