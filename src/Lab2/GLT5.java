package Lab2;

public class GLT5 {
    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time(23, 22, 40);
        Time t3 = new Time(20, 22, 40);
        t1.display();
        t2.display();
        t3.display();
    }

}

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time() {
        isValidTime(0, 0, 0);
    }

    public Time(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    public static boolean isValidTime(int hours, int minutes, int seconds) {
        // check if the hours, minutes, and seconds are within the valid range
        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
