package testcore;

import assign2.ProbA;
import org.junit.jupiter.api.Assertions;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class TestExecutor {

    public static void runTest(Solution solution, long timeLimit, String input, String expected) {
        runTest(solution, timeLimit, input, expected, "");
    }

    public static void runTest(Solution solution, long timeLimit, String input, String expected, String testname) {
        InputStream instream = new ByteArrayInputStream(input.getBytes());
        OutputStream outputStream = new java.io.ByteArrayOutputStream();

        var startTime = System.currentTimeMillis();
        try {
            solution.solve(instream, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        var t = System.currentTimeMillis() - startTime;

        String result = outputStream.toString().trim();

        Assertions.assertEquals(expected.trim(), result, "Incorrect Output");
        Assertions.assertTrue(t < timeLimit, "Time Limit Exceeded");
        if (testname.length() > 0) {
            System.out.println("Test Name = " + testname);
        }
        System.out.println(String.format("Completed in %dms", t));
    }

    public static void runTestFiles(Solution solution, long timelimit, String dirpath) throws IOException {
        String indir = dirpath + "\\in";
        String outdir = dirpath + "\\std";
        File inputFiles = new File(indir);
        for (String fname: inputFiles.list()) {
            var infile = Paths.get(indir + "\\" + fname);
            var outfile = Paths.get(outdir+ "\\" + fname.split("\\.")[0] + ".std");
            String input = new String(Files.readAllBytes(infile));
            String output = new String(Files.readAllBytes(outfile));
            runTest(solution, timelimit, input, output, fname);
        }
    }
}
