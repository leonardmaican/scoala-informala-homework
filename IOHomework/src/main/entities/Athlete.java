package main.entities;

import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.Objects;

/**
 * This is the athlete object implementation
 */
public class Athlete implements Serializable {
    private String number;
    private String name;
    private String countryCode;
    private SkiTimeResult time;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;


    public Athlete(String number, String name, String countryCode, SkiTimeResult time, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.number = number;
        this.name = name;
        this.countryCode = countryCode;
        this.time = time;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }


    public void setTime(SkiTimeResult time) {
        if (time.getSeconds() < 0) {
            throw new InvalidParameterException("The time you are trying to set is not correct");
        }

        this.time = time;
    }

    public SkiTimeResult getTime() {
        return time;
    }

    public String getFirstShootingRange() {
        return firstShootingRange;
    }

    public String getSecondShootingRange() {
        return secondShootingRange;
    }

    public String getThirdShootingRange() {
        return thirdShootingRange;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", contrycode='" + countryCode + '\'' +
                ", time=" + time +
                ", firstShootingRange='" + firstShootingRange + '\'' +
                ", secondShootingRange='" + secondShootingRange + '\'' +
                ", thirdShootingRange='" + thirdShootingRange + '\'' +
                '}';
    }

    /**
     * This method compares athlete's competition number. If the numbers are equal, then the athlete objects are equal.
     *
     * @param o the object to be compared with
     * @return true/false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return number.equals(athlete.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public String getName() {
        return name;
    }
}
