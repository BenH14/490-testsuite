package assign2;

import org.junit.jupiter.api.Test;
import testcore.TestExecutor;

class ProbCTest {

    // In ms
    public static final int TIME_LIMIT = 1000;

    @Test
    public void testSample1() {
        String input = "7\n" +
                "1 2 13\n" +
                "1 3 13\n" +
                "1 4 13\n" +
                "2 5 14\n" +
                "3 6 14\n" +
                "4 7 14";
        String expectedOutput = "42";
        TestExecutor.runTest(ProbC::problemC, TIME_LIMIT, input, expectedOutput);
    }

    @Test
    public void testSample2() {
        String input = "7\n" +
                "1 2 -4\n" +
                "1 3 -7\n" +
                "2 4 -6\n" +
                "2 5 -1\n" +
                "3 6 -2\n" +
                "3 7 -8";
        String expectedOutput = "0";
        TestExecutor.runTest(ProbC::problemC, TIME_LIMIT, input, expectedOutput);
    }

    @Test
    public void testSample3() {
        String input = "7\n" +
                "1 2 4\n" +
                "1 3 7\n" +
                "2 4 6\n" +
                "2 5 1\n" +
                "3 6 2\n" +
                "3 7 8";
        String expectedOutput = "14";
        TestExecutor.runTest(ProbC::problemC, TIME_LIMIT, input, expectedOutput);
    }

}