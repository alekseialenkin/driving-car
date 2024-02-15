package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.GameTestData.FIRST_FILE_NAME;
import static org.example.GameTestData.FIST_TEST_RESULT;

class GameTest {
    @Test
    public void normalTest() {
        GameTestData.makeFistTestFile();
        int[] result = Game.makeTurn(Util.makeNewField(Util.readFile(FIRST_FILE_NAME)));
        Assertions.assertArrayEquals(FIST_TEST_RESULT, result);
        System.out.println("Координата х = " + result[0] + " ,координата у = " + result[1]);
    }

}