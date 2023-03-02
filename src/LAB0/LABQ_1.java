package LAB0;

public class LABQ_1 {
    public static void main(String[] args) {
        // Test Runs
        System.out.println(isValidDate(22, 12, 2023));
        System.out.println(isValidDate(29, 2, 2023));

    }

    public static boolean isValidDate(int day, int month, int year) {
        // Year !=0
        if (year < 1) {
            return false;
        }

        // Check if month is valid
        if (month < 1 || month > 12) {
            return false;
        }

        // Check if day is valid
        int maxDays = 31; // default max days for most months
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30; // April, June, September, November
        } else if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                maxDays = 29; // For Leap year
            } else {
                maxDays = 28; // Non-leap year
            }
        }
        if (day < 1 || day > maxDays) {
            return false;
        }

        // Returns true if all the above conditions are satisfied
        return true;
    }

}