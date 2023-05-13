package ru.otus.pattern.adapter.program1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import ru.otus.pattern.adapter.program1.readMatrix.ReadMatrices;
import ru.otus.pattern.adapter.program1.readMatrix.ReadMatricesImpl;
import ru.otus.pattern.adapter.program1.sumMatrix.SumMatrices;
import ru.otus.pattern.adapter.program1.sumMatrix.SumMatricesImpl;
import ru.otus.pattern.adapter.program1.writeMatrix.WriteMatrixToFile;
import ru.otus.pattern.adapter.program1.writeMatrix.WriteMatrixToFileImpl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StartAppTest {

    private StartApp startApp;

    @BeforeAll
    public void init() {

        ReadMatrices readMatrices = new ReadMatricesImpl();
        SumMatrices sumMatrices = new SumMatricesImpl();
        WriteMatrixToFile writeMatrixToFile = new WriteMatrixToFileImpl();

        startApp = new StartApp(readMatrices, sumMatrices, writeMatrixToFile);

    }

    @Test
    public void startProgram1TestSuccess() {
        assertDoesNotThrow(() -> startApp.startProgram1());
    }

}