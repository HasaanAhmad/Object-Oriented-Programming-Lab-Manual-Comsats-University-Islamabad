package Lab2;

public class GLT5 {

}

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hours, int minutes, int seconds) {
        set_time(hours, minutes, seconds);
    }

    public void set_time(int hoursIn, int minutesIn, int secondsIn) {
        if (hours >= 0 && hours <= 23) {
            hours = hoursIn;
        } else {
            System.out.println("invalid hours");
        }

        if (minutes >= 0 && minutes <= 59) {
            minutes = minutesIn;
        } else {

            System.out.println("Invalid minutes");
        }

        if (seconds >= 0 && seconds <= 59) {
            seconds = secondsIn;
        } else {
            System.out.println("Invalid seconds");
        }
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
