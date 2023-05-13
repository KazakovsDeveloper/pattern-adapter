package ru.otus.pattern.adapter.program1.model;

public class MatrixP1 {

    private int[][] matrix1;
    private int[][] matrix2;

    public MatrixP1(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public MatrixP1() {
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
