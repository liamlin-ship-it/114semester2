import java.util.Scanner;

public class Apr10one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long days = n / 86400;   // sum of seconds in a day
        int year = 1970;   // start from 1970

        while (true){
            int daysInYear = isLeap(year) ? 366 : 365;

            if (days >= daysInYear){
                days -= daysInYear;
                year++;
            }else {
                break;
            }
        }

        int month = 1;
        while (true){
            if (days >= daysInMonth(year, month)){
                days -= daysInMonth(year, month);
                month++;
            }else {
                break;
            }
        }

        // if the remaining seconds is less than 86400, we have to add one more day
        int date = (int) days + 1;
        System.out.printf("%04d-%02d-%02d", year, month, date);
    }

    public static boolean isLeap(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    // check days in each month
    public static int daysInMonth(int year, int month){
        if (month == 2){
            return isLeap(year) ? 29 : 28;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }

        return 31;
    }
}
