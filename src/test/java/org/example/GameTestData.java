package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GameTestData {
    public static final String FIRST_FILE_NAME = "test1.txt";
    public static final String SECOND_FILE_NAME = "test2.txt";
    public static final int[] FIST_TEST_RESULT = new int[]{1, 2};
    public static final int[] SECOND_TEST_RESULT = new int[]{6, 1};

    public static void makeTestsFiles() {
        try (FileWriter firstTestWriter = new FileWriter(FIRST_FILE_NAME); FileWriter secondTestWriter = new FileWriter(SECOND_FILE_NAME)) {
            List<String> parameters = List.of("10", "10", "0", "0", "right", "right", "go", "right", "go", "right", "go", "left", "left", "go", "left", "go");
            for (String s : parameters) {
                firstTestWriter.write(s + "\n");
            }
            parameters = List.of("10", "10", "4", "3", "go", "right", "go", "right", "go", "right", "go", "go", "left", "go");
            for (String s : parameters) {
                secondTestWriter.write(s + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
