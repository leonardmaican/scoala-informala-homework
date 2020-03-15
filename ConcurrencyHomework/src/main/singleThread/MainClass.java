package main.singleThread;

/**
 * Main class for single the single threaded tool.
 * Time it took for every run was over 900
 */

public class MainClass {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        String inputPath1 = "ConcurrencyHomework/files/file1.txt";
        String inputPath2 = "ConcurrencyHomework/files/file2.txt";
        String outputPath = "ConcurrencyHomework/files/output.txt";
        FileReader fileReader1 = new FileReader(inputPath1, outputPath);
        fileReader1.readFile();
        FileReader fileReader2 = new FileReader(inputPath2, outputPath);
        fileReader2.readFile();
        long timeItTook = System.currentTimeMillis() - currentTime;
        System.out.println(timeItTook);

    }
}
