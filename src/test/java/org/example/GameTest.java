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
        System.out.println("Координата х = " + result[0] + " ,координата у = " + result[1]);
    }

    @Test
    public void testWithStartPosition() {
        int[] result = Game.makeTurn(Util.makeNewField(Util.readFile(SECOND_FILE_NAME)));
        Assertions.assertArrayEquals(SECOND_TEST_RESULT, result);
        System.out.println("Координата х = " + result[0] + " ,координата у = " + result[1]);
    }
}