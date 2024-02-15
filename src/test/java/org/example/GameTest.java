package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.GameTestData.*;

class GameTest {
    static {
        makeTestsFiles();
    }

    @Test
    public void normalTest() {
        int[] result = Game.makeTurn(Util.makeNewField(Util.readFile(FIRST_FILE_NAME)));
        Assertions.assertArrayEquals(FIST_TEST_RESULT, result);
        printResult(result);
    }

    @Test
    public void testWithStartPosition() {
        int[] result = Game.makeTurn(Util.makeNewField(Util.readFile(SECOND_FILE_NAME)));
        Assertions.assertArrayEquals(SECOND_TEST_RESULT, result);
        printResult(result);
    }

    @Test
    public void outOfField() {
        int[] result = Game.makeTurn(Util.makeNewField(Util.readFile(THIRD_FILE_NAME)));
        printResult(result);
    }
}