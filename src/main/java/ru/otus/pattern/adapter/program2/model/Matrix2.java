package ru.otus.pattern.adapter.program2.model;

public class Matrix2 {

    private int[][] matrix1;
    private int[][] matrix2;

    public Matrix2(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public Matrix2() {
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

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }
}
