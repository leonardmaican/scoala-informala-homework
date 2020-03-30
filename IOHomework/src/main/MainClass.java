package main;

import main.entities.Athlete;

import java.io.*;
import java.util.List;

/**
 * The main method of the implementation cicles through the updated and sorted list of athletes
 * it then writes the results into a new file
 */
public class MainClass {
    public static void main(String[] args) {
        Standings standings = new Standings();
        List<Athlete> initialStandings = standings.getStandings();
        standings.calculateFinalStandings(initialStandings);
        List<Athlete> finalStandings = standings.getFinalStandings();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IOHomework/files/finalResults.txt")))) {
            for (Athlete a : finalStandings) {
                if (a.equals(finalStandings.get(0))) {
                    bufferedWriter.write("Winner: " + a.getName() + " final time = " + a.getTime());
                }
                if (a.equals(finalStandings.get(1))) {
                    bufferedWriter.write("\n" + "Runner-up: " + a.getName() + " final time = " + a.getTime());
                }
                if (a.equals(finalStandings.get(2))) {
                    bufferedWriter.write("\n" + "Third place: " + a.getName() + " final time = " + a.getTime());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
