package main.entities;

import java.util.Objects;

/**
 * This is a ski time result object
 */
public class SkiTimeResult {
    private Integer minutes;
    private Integer seconds;

    /**
     * The constructor for this object. If sixty or more seconds are passed as a parameter,
     * the constructor automatically adds a minute
     */
    public SkiTimeResult(Integer minutes, Integer seconds) {
        if (seconds > 61) {
            this.minutes =minutes+ seconds / 60;
            this.seconds=seconds%60;
        } else {
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    public Integer getMinutes() {
        return minutes;
    }

    public Integer getSeconds() {
        return seconds;
    }


    @Override
    public String toString() {
        return minutes + ":" + seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkiTimeResult that = (SkiTimeResult) o;
        return Objects.equals(getMinutes(), that.getMinutes()) &&
                Objects.equals(getSeconds(), that.getSeconds());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMinutes(), getSeconds());
    }
}
