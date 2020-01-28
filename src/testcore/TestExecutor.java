package testcore;

import assign2.ProbA;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestExecutor {

    public static void runTest(Solution solution, long timeLimit, String input, String expected) {
        InputStream instream = new ByteArrayInputStream(input.getBytes());
        OutputStream outputStream = new java.io.ByteArrayOutputStream();

        var startTime = System.currentTimeMillis();
        try {
            solution.solve(instream, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        var t = System.currentTimeMillis() - startTime;

        String result = outputStream.toString();

        Assertions.assertEquals(expected, result, "Incorrect Output");
        Assertions.assertTrue(t < timeLimit, "Time Limit Exceeded");
        System.out.println(String.format("Completed in %dms", t));
    }
}
