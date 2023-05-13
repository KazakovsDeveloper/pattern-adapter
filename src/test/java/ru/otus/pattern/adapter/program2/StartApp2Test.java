package ru.otus.pattern.adapter.program2;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StartApp2Test {

    private StartApp2 startApp2 = new StartApp2();

    @Test
    public void startProgram2TestShouldSuccess() {
        assertDoesNotThrow(() -> startApp2.startProgram2());
    }

    @Test
    public void testFileOutputOfGenerateMatrixExists() {
        String fileName = "outputOfGenerateMatrix.txt";
        Path filePath = Paths.get(fileName);

        assertTrue(Files.exists(filePath));
    }

}