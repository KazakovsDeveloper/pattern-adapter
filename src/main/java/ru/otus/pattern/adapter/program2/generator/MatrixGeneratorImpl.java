package ru.otus.pattern.adapter.program2.generator;

import ru.otus.pattern.adapter.program2.model.Matrix2;

import java.util.Random;

public class MatrixGeneratorImpl implements MatrixGenerator {

    @Override
    public Matrix2 generate() {
        int numRows = 3; // количество строк
        int numCols = 3; // количество столбцов

        int[][] matrix1 = generateMatrix(numRows, numCols); // генерируем первую матрицу
        int[][] matrix2 = generateMatrix(numRows, numCols); // генерируем вторую матрицу

        return new Matrix2(matrix1, matrix2);
    }

    private int[][] generateMatrix(int numRows, int numCols) {
        int[][] matrix = new int[numRows][numCols];
        Random rand = new Random();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = rand.nextInt(100); // заполняем элемент случайным числом от 0 до 9
            }
        }
        return matrix;
    }

}
