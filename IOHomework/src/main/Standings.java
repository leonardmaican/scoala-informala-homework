package main;


import main.entities.Athlete;
import main.entities.SkiTimeResult;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * This is the implementation for the homework requirements.
 */

public class Standings {
    private static final String dataPath = "IOHomework/files/results.csv";
    private List<Athlete> standings = getData(Paths.get(dataPath));
    private List<Athlete> finalStandings = calculateFinalStandings(standings);

    /**
     * This method retrieves the athlete's data from the CSV, creates a new athlete using the constructor and adds it to the list of athletes.
     * @param filepath the file to read the data from
     * @return a list with the athletes read from the file
     */
    public List<Athlete> getData(Path filepath) {
        List<Athlete> newList = new ArrayList<>();
        Path resultPath = Paths.get(String.valueOf(filepath));
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(resultPath.toFile())))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitline = line.split(",");
                String athleteNumber = splitline[0];
                String athleteName = splitline[1];
                String countryCode = splitline[2];
                String[] time = splitline[3].split(":");
                SkiTimeResult initialTime = new SkiTimeResult(Integer.parseInt(time[0]), Integer.parseInt(time[1]));
                String firstShootingRange = splitline[4];
                String secondShootingRange = splitline[5];
                String thirdShootRange = splitline[6];
                Athlete newAthlete = new Athlete(athleteNumber, athleteName, countryCode, initialTime, firstShootingRange, secondShootingRange, thirdShootRange);
                newList.add(newAthlete);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newList;

    }

    /**
     * This method sorts and returns an unmodifiable list of athletes created in the previous method
     */
    public List<Athlete> getStandings() {
        standings.sort(new AthleteComparator());
        return Collections.unmodifiableList(standings);
    }

    /**
     *
     * This method calculates the total time to be added to the initial time
     * Then creates a new list with the athletes from the original list but with updated times
     * @param initialList the athletes to calculate the final time for
     * @return the athletes with the updated times
     */
    public ArrayList<Athlete> calculateFinalStandings(List<Athlete> initialList) {
        ArrayList<Athlete> finalStandings = new ArrayList<>();
        for (Athlete a : initialList) {
            int missedShots = 0;
            for (int i = 0; i < 5; i++) {
                if (a.getFirstShootingRange().charAt(i) == 'o') {
                    missedShots++;
                }
                if (a.getSecondShootingRange().charAt(i) == 'o') {
                    missedShots++;
                }
                if (a.getThirdShootingRange().charAt(i) == 'o') {
                    missedShots++;
                }

            }
            SkiTimeResult finalTime = new SkiTimeResult(a.getTime().getMinutes(), a.getTime().getSeconds() + (missedShots * 10));
            if (missedShots > 6) {
                finalTime = new SkiTimeResult(a.getTime().getMinutes() + missedShots%6, a.getTime().getSeconds() + ((missedShots % 6) * 10));
            }
            a.setTime(finalTime);
            finalStandings.add(a);


        }
        return finalStandings;

    }

    public List<Athlete> getFinalStandings() {
        finalStandings.sort(new AthleteComparator());
        return Collections.unmodifiableList(finalStandings);
    }
}
