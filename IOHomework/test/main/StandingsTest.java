package main;

import main.entities.Athlete;
import main.entities.SkiTimeResult;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StandingsTest {

    /**
     * This method tests the functionality of the penalty calculating method
     */

    @Test
    public void calculateFinalStandings() {
        Standings standings = new Standings();
        Athlete testAthlete = new Athlete("44", "Test Athlete", "RO", new SkiTimeResult(0, 0), "ooxoo", "xxxxx", "ooxoo");
        ArrayList<Athlete> initialList = new ArrayList<>();
        initialList.add(testAthlete);
        ArrayList<Athlete> finalList = standings.calculateFinalStandings(initialList);
        Athlete updatedAthlete = finalList.get(0);
        SkiTimeResult skiTimeResult = new SkiTimeResult(1, 20);


        assertEquals(skiTimeResult, updatedAthlete.getTime());
    }

    /**
     * This method tests that the data is read correctly from the csv
     * And the fact that if two athletes have the same competition number they are equal objects
     */

    @Test
    public void getData() {
        Standings standings = new Standings();
        List<Athlete> initialStandings = standings.getStandings();
        Athlete a1 = initialStandings.get(0);
        Athlete a2 = new Athlete("27", "Piotr Smitzer", "CZ", new SkiTimeResult(30, 10), "xxxxx", "xxxxx", "xxxxx");
        assertEquals(a1, a2);
    }
}