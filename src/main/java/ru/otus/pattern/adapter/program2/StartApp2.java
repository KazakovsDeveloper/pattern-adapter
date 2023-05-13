package ru.otus.pattern.adapter.program2;

import ru.otus.pattern.adapter.program1.model.MatrixP1;
import ru.otus.pattern.adapter.program2.adapter.MatrixAdapter;
import ru.otus.pattern.adapter.program2.generator.MatrixGenerator;
import ru.otus.pattern.adapter.program2.generator.MatrixGeneratorImpl;
import ru.otus.pattern.adapter.program2.mapper.MatrixMapper;
import ru.otus.pattern.adapter.program2.model.Matrix2;

public class StartApp2 {

    private MatrixGenerator matrixGenerator;
    private MatrixAdapter matrixAdapter;
    private MatrixMapper matrixMapper;

    public StartApp2() {
        this.matrixGenerator = new MatrixGeneratorImpl();
        this.matrixAdapter = new MatrixAdapter(matrixGenerator);
        this.matrixMapper = new MatrixMapper();
    }


    public void startProgram2() {
        try {
            Matrix2 matrix2 = matrixAdapter.generateMatrix();

            MatrixP1 matrixP1 = matrixMapper.mapMatrix(matrix2);

            int[][] result = matrixAdapter.sumMatrices(matrixP1);

            matrixAdapter.writeMatrix(result);
        } catch (Exception e) {
            throw new RuntimeException("Что-то не так " + e);
        }

    }

}
