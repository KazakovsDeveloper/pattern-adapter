package ru.otus.pattern.adapter.program1;

import ru.otus.pattern.adapter.program1.model.MatrixP1;
import ru.otus.pattern.adapter.program1.readMatrix.ReadMatrices;
import ru.otus.pattern.adapter.program1.sumMatrix.SumMatrices;
import ru.otus.pattern.adapter.program1.writeMatrix.WriteMatrixToFile;

public class StartApp {

    private final ReadMatrices readMatrices;
    private final SumMatrices sumMatrices;
    private final WriteMatrixToFile writeMatrixToFile;

    public StartApp(ReadMatrices readMatrices,
                    SumMatrices sumMatrices,
                    WriteMatrixToFile writeMatrixToFile) {
        this.readMatrices = readMatrices;
        this.sumMatrices = sumMatrices;
        this.writeMatrixToFile = writeMatrixToFile;
    }

    public void startProgram1() {
        try {
            MatrixP1 matrixP1 = readMatrices.readMatrix();
            int[][] ints = sumMatrices.sumMatrices(matrixP1);
            writeMatrixToFile.writeMatrix(ints);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
