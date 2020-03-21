package main.tools;

import main.entities.Person;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ReaderWriter implements Runnable {
    private String inputFile;
    private Integer targetMonth;
    private String outputFile;

    public ReaderWriter(String inputFile, Integer targetMonth, String outputFile) {
        this.inputFile = inputFile;
        this.targetMonth = targetMonth;
        this.outputFile = outputFile;
    }

    @Override
    public void run() {
        ArrayList<Person> newPeople = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(String.valueOf(Paths.get(inputFile)))));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((new FileOutputStream(String.valueOf(Paths.get(outputFile))))))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitLine = line.split(",");
                String[] name = splitLine[0].split(" ");
                String firstName = name[0];
                String lastName = name[1];
                String[] date = splitLine[1].split("-");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int day = Integer.parseInt(date[2]);
                LocalDate dateOfBirth = LocalDate.of(year, month, day);

                Person person = new Person(firstName, lastName, dateOfBirth);
                newPeople.add(person);
            }


            newPeople.stream()
                    .filter(person -> person.getDateOfBirth().getMonthValue() == targetMonth)
                    .sorted(Person::compareTo)
                    .forEach(person -> {
                        try {
                            bw.write(person.getFirstName() + " " + person.getLastName());
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
