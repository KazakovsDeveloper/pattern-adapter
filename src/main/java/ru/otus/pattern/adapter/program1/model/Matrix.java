package ru.otus.pattern.adapter.program1.model;

public class Matrix {

    private int[][] matrix1;
    private int[][] matrix2;

    public Matrix(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public Matrix() {
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
