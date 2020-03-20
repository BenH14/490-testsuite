package assign4;

import org.junit.jupiter.api.Test;
import testcore.TestExecutor;

import java.io.IOException;

class ProbBTest {

    // In ms
    public static final int TIME_LIMIT = 1000;

    @Test
    public void testSample1() {
        String input = "1\n" +
                "3\n" +
                "0 0 3 0 3 3\n" +
                "-1 -1\n" +
                "1 1\n" +
                "2 1";
        String expectedOutput = "SAFE\n" +
                "DANGER\n" +
                "DANGER";
        TestExecutor.runTest(ProbB::problemB, TIME_LIMIT, input, expectedOutput);
    }

    @Test
    public void runTestFiles() throws IOException {
        String testfilesdir = System.getProperty("user.dir") + "/testfiles/assign4/b";
        TestExecutor.runTestFiles(ProbB::problemB, TIME_LIMIT, testfilesdir);
    }

}