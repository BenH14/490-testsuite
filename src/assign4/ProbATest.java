package assign4;

import org.junit.jupiter.api.Test;
import testcore.TestExecutor;

import java.io.IOException;

class ProbATest {

    // In ms
    public static final int TIME_LIMIT = 1000;

    @Test
    public void testSample1() {
        String input = "4\n" +
                "0 0 0 1 2\n" +
                "10 0 0 1 2\n" +
                "10 0 10 1 2\n" +
                "10 10 5 1 2\n";
        String expectedOutput = "0.000000000\n" +
                "5.000000000\n" +
                "10.000000000\n" +
                "10.094108191";
        TestExecutor.runTest(ProbA::problemA, TIME_LIMIT, input, expectedOutput);
    }

    @Test
    public void runTestFiles() throws IOException {
        String testfilesdir = System.getProperty("user.dir") + "/testfiles/assign4/a";
        TestExecutor.runTestFiles(ProbA::problemA, TIME_LIMIT, testfilesdir);
    }

}