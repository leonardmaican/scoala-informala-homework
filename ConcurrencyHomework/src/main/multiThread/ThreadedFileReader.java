package main.multiThread;

import main.entities.Gender;
import main.entities.Person;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;

/**
 * Threaded implementation for the homework requirement
 */

public class ThreadedFileReader implements Runnable {
    String inputPath;
    String outputPath;

    public ThreadedFileReader(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }

    /**
     * This method reads the data from the file received as an argument and creates new Person objects.
     * Then, if one person's birthday is today, he/she will be written in an output file containing the happy birthday message,
     * the name and the year that person was born
     *
     */
    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(String.valueOf(Paths.get(inputPath)))));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((new FileOutputStream(String.valueOf(Paths.get(outputPath))))))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitLine = line.split(",");
                String name = splitLine[0];
                String[] date = splitLine[1].split("-");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int day = Integer.parseInt(date[2]);
                LocalDate dateOfBirth = LocalDate.of(year, month, day);
                String genderFromFile = splitLine[2];
                Gender gender = null;
                if (genderFromFile.equals("male") || genderFromFile.equals("0")) {
                    gender = Gender.MALE;
                }
                if (genderFromFile.equals("female") || genderFromFile.equals("1")) {
                    gender = Gender.FEMALE;
                }
                Person newPerson = new Person(name, dateOfBirth, gender);


                if (newPerson.getGender().equals(Gender.FEMALE)) {
                    if (newPerson.getDateOfBirth().getMonthValue() == 3 && newPerson.getDateOfBirth().getDayOfMonth() == 13) {
                        try {
                            bw.write("Happy birthday " + newPerson.getName() + " " + newPerson.getDateOfBirth().getYear());
                            bw.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
