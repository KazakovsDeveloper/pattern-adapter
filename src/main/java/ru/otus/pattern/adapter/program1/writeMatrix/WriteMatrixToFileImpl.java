package ru.otus.pattern.adapter.program1.writeMatrix;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteMatrixToFileImpl implements WriteMatrixToFile {

    @Override
    public void writeMatrix(int[][] matrix) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(new File("output.txt")))) {
            writer.println("размер матрицы: " + matrix.length + " на " + matrix[0].length);
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
