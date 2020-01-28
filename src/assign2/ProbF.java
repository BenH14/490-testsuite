package assign2;

import java.io.*;

public class ProbF {

    public static void main(String[] args) throws IOException {
        problemA(System.in, System.out);
    }

    public static void problemA(InputStream in, OutputStream out) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter writer = new PrintWriter(out);

        // Solve problem

        reader.close();
        writer.close();
    }

}
