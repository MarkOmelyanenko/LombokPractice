package src;

import lombok.Cleanup;

import java.io.*;

public class CleanupExample {
    static String inputFileName = "inputFileName";
    static String outputFileName = "optoutFileName";

    public void cleanupExample() throws IOException {
        @Cleanup InputStream in = new FileInputStream(inputFileName);
        @Cleanup OutputStream out = new FileOutputStream(outputFileName);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
    }
}
