package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GameTestData {
    public static final String FIRST_FILE_NAME = "test1";
    public static final int[] FIST_TEST_RESULT = new int[]{1, 2};

    public static void makeFistTestFile() {
        try (FileWriter fw = new FileWriter(FIRST_FILE_NAME)) {
            List<String> parameters = List.of("10", "10", "0", "0", "right", "right", "go", "right", "go", "right", "go", "left", "left", "go", "left", "go");
            for (String s : parameters) {
                fw.write(s + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
