package main.tools;

/**
 * The main class used both implementations
 * I used 100 rows from the files provided for the previous homework
 */
public class MainClass {
    public static void main(String[] args) {
        String inputFile = "Java8Homework/files/People.txt";
        String outputFile = "Java8Homework/files/output.txt";
        String outputFile2 = "Java8Homework/files/output2.txt";

        ReaderWriter readerWriter=new ReaderWriter(inputFile,10,outputFile);
        Thread t=new Thread(readerWriter);
        t.start();

        ReaderWriter2 tool = new ReaderWriter2(inputFile, 10, outputFile2);
        Thread t2 = new Thread(tool);
        t2.start();
    }
}
