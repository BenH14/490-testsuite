package assign2;

import org.junit.jupiter.api.Test;
import testcore.TestExecutor;

class ProbBTest {

    // In ms
    public static final int TIME_LIMIT = 1000;

    @Test
    public void testSample1() {
        String input = "2\n" +
                "7\n" +
                "47 12 12 3 9 9 3\n" +
                "4\n" +
                "1 2 3 1";
        String expectedOutput = "48\n" +
                "3";
        TestExecutor.runTest(ProbB::problemB, TIME_LIMIT, input, expectedOutput);
    }

}