package main.tools;

import main.entities.Person;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;

/**
 * A different implementation I tried
 */
public class ReaderWriter2 implements Runnable {
    private String inputFile;
    private Integer targetMonth;
    private String outputFile;

    public ReaderWriter2(String inputFile, Integer targetMonth, String outputFile) {
        this.inputFile = inputFile;
        this.targetMonth = targetMonth;
        this.outputFile = outputFile;
    }

    /**
     * I tried this implementation because I wanted to do the whole thing in one stream.
     * Sadly it only writes one person in the output file.
     * What did I do wrong?
     */
    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(String.valueOf(Paths.get(inputFile)))))) {

            br.lines().map(line -> {
                String[] data = line.split(",");
                String[] name = data[0].split(" ");
                String firstName = name[0];
                String lastName = name[1];
                String[] date = data[1].split("-");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int day = Integer.parseInt(date[2]);
                LocalDate dateOfBirth = LocalDate.of(year, month, day);
                return new Person(firstName, lastName, dateOfBirth);


            })
                    .filter(person -> person.getDateOfBirth().getMonthValue() == targetMonth)
                    .sorted(Person::compareTo)
                    .forEach(line -> {

                        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((new FileOutputStream(String.valueOf(Paths.get(outputFile))))))) {
                            bw.write(line.getFirstName() + " " + line.getLastName());
                            bw.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    });


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
