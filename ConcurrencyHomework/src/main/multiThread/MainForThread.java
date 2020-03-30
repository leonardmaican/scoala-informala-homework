package main.multiThread;

/**
 * This is the main class for the threaded implementation
 * Time it took for every run was usually below 10 at every run
 */

public class MainForThread {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        String inputPath1 = "ConcurrencyHomework/files/file1.txt";
        String inputPath2 = "ConcurrencyHomework/files/file2.txt";
        String output2 = "ConcurrencyHomework/files/output2.txt";
        ThreadedFileReader tfr1 = new ThreadedFileReader(inputPath1, output2);
        ThreadedFileReader tfr2 = new ThreadedFileReader(inputPath2, output2);
        Thread t1 = new Thread(tfr1);
        Thread t2 = new Thread(tfr2);
        t1.start();
        t2.start();
        long timeItTook = System.currentTimeMillis() - currentTime;
        System.out.println(timeItTook);
    }
}
