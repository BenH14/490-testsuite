package assign2;

import org.junit.jupiter.api.*;
import testcore.TestExecutor;

import java.io.*;

class ProbATest {

    // In ms
    public static final int TIME_LIMIT = 1000;

    @Test
    public void testSample1() {
        String input = "3 5\n" +
                "5 55\n" +
                "2 20\n" +
                "3 42";
        String expectedOutput = "62";
        TestExecutor.runTest(ProbA::problemA, TIME_LIMIT, input, expectedOutput);
    }

    @Test
    public void runTestFiles() throws IOException {
        String testfilesdir = System.getProperty("user.dir") + "/testfiles/assign2/a";
        TestExecutor.runTestFiles(ProbA::problemA, TIME_LIMIT, testfilesdir);
    }

}