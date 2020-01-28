package assign2;

import java.io.*;

public class ProbB {

    public static void main(String[] args) throws IOException {
        problemB(System.in, System.out);
    }

    public static void problemB(InputStream in, OutputStream out) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter writer = new PrintWriter(out);

        // Solve problem

        reader.close();
        writer.close();
    }

}
