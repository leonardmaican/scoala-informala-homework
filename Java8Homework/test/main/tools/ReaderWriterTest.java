package main.tools;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class ReaderWriterTest {
    /**
     * This method tests that the output file is not empty and the tool works.
     *
     * @throws IOException in case the file isn't found
     */
    @Test
    public void run() throws IOException {
        String outputFile = "Java8Homework/files/output.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(String.valueOf(Paths.get(outputFile)))));
        String information = br.readLine();
        assertTrue(information.length() > 1);
    }
}