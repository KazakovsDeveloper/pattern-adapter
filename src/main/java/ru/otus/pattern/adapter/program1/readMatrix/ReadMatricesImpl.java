package ru.otus.pattern.adapter.program1.readMatrix;

import ru.otus.pattern.adapter.program1.model.Matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMatricesImpl implements ReadMatrices {

    @Override
    public Matrix readMatrix() {
        try (Scanner scanner = new Scanner(
                new File(this.getClass().getClassLoader().getResource("matrices.txt").getFile()))) {
            int[][] matrix = getMatrix(scanner);
            int[][] matrix2 = getMatrix(scanner);
            return new Matrix(matrix, matrix2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл с матрицами не найден");
        }
    }

    private int[][] getMatrix(Scanner scanner) {

        int rows1 = 3;
        int cols1 = 3;
        int[][] matrix = new int[rows1][cols1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

}
