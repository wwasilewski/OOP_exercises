package timeclass_with_inputvalidation;

/**
 * @author Wojciech Wasilewski
 * @date Created on 05.07.2019
 */
public class Time {

    private int second;
    private int minute;
    private int hour;

    //default constructor
    public Time() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public Time(int hour, int minute, int second) {
        //invoke setters to do input validation
        this.setTime(hour, minute, second);
    }

    // Input validations are done in setters.
    // All the other methods (such as constructors and setTime()) invoke
    // these setters to perform input validation to avoid code duplication.
    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour");
        }
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    //return "hh:mm:ss" with leading zeros
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //increment this instance by one second, return this instance
    public Time nextSecond() {
        ++second;
        if (second == 60) {
            second = 0;
            ++minute;
            if (minute == 60) {
                minute = 0;
                ++hour;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this; //return this instance, to support chaining
    }
}
