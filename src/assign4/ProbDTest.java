package assign4;

import org.junit.jupiter.api.Test;
import testcore.TestExecutor;

import java.io.IOException;

class ProbDTest {

    // In ms
    public static final int TIME_LIMIT = 2000;

    @Test
    public void testSample1() {
        String input = "4\n" +
                "1 3\n" +
                "2 4\n" +
                "3 3\n" +
                "4 1";
        String expectedOutput = "3";
        TestExecutor.runTest(ProbD::problemD, TIME_LIMIT, input, expectedOutput);
    }

    @Test
    public void testSample3() {
        String input = "10\n" +
                "3 7\n" +
                "1 3\n" +
                "5 6\n" +
                "6 6\n" +
                "9 6\n" +
                "8 15\n" +
                "12 5\n" +
                "13 1\n" +
                "10 9\n" +
                "14 2\n";
        String expectedOutput = "3";
        TestExecutor.runTest(ProbD::problemD, TIME_LIMIT, input, expectedOutput);
    }

    @Test
    public void runTestFiles() throws IOException {
        String testfilesdir = System.getProperty("user.dir") + "/testfiles/assign4/d";
        TestExecutor.runTestFiles(ProbD::problemD, TIME_LIMIT, testfilesdir);
    }

}