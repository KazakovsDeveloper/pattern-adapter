package ru.otus.pattern.adapter.program2.adapter;

import ru.otus.pattern.adapter.program1.model.MatrixP1;
import ru.otus.pattern.adapter.program1.sumMatrix.SumMatrices;
import ru.otus.pattern.adapter.program1.writeMatrix.WriteMatrixToFile;
import ru.otus.pattern.adapter.program2.generator.MatrixGenerator;
import ru.otus.pattern.adapter.program2.model.Matrix2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MatrixAdapter implements SumMatrices, WriteMatrixToFile {

    private MatrixGenerator generator;

    public MatrixAdapter(MatrixGenerator generator) {
        this.generator = generator;
    }

    @Override
    public int[][] sumMatrices(MatrixP1 matrixP1) {
        int rows = matrixP1.getMatrix1().length;
        int cols = matrixP1.getMatrix1()[0].length;

        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixP1.getMatrix1()[i][j] + matrixP1.getMatrix1()[i][j];
            }
        }
        return resultMatrix;
    }

    public Matrix2 generateMatrix() {
        return generator.generate();
    }

    @Override
    public void writeMatrix(int[][] matrix) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(new File("outputOfGenerateMatrix.txt")))) {
            writer.println(
                    "вывод для суммы сгенерированных матриц, размер " + matrix.length + " на " + matrix[0].length);
            for (int[] ints : matrix) {
                for (int j = 0; j < matrix[0].length; j++) {
                    writer.print(ints[j] + " ");
                }
                writer.println();
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка ввода-вывода: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Что-то пошло не так " + e.getMessage());
        }
    }
}
