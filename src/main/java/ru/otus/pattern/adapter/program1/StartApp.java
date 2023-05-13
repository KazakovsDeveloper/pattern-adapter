package ru.otus.pattern.adapter.program1;

import ru.otus.pattern.adapter.program1.model.Matrix;
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
            Matrix matrix = readMatrices.readMatrix();
            int[][] ints = sumMatrices.sumMatrices(matrix);
            writeMatrixToFile.writeMatrix(ints);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
