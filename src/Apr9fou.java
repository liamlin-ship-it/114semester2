import java.util.Scanner;

public class Apr9fou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        String getYearA = a.substring(0, 4);
        String getYearB = b.substring(0,4);
        String getMonthA = a.substring(4, 6);
        String getMonthB= b.substring(4, 6);
        String getDateA = a.substring(6, 8);
        String getDateB = b.substring(6, 8);

        int yearA = Integer.parseInt(getYearA);
        int yearB = Integer.parseInt(getYearB);
        int monthA = Integer.parseInt(getMonthA);
        int monthB = Integer.parseInt(getMonthB);
        int dateA = Integer.parseInt(getDateA);
        int dateB = Integer.parseInt(getDateB);

        int daysA = countTotalDays(yearA, monthA, dateA);
        int daysB = countTotalDays(yearB, monthB, dateB);

        System.out.println(Math.abs(daysA - daysB));
    }

    public static int countTotalDays(int year, int month, int date){
        int totalDays = 0;
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // add days for all the fully completed years from 1970 to (year - 1)
        for (int i = 1970; i < year; i++) {
            if (isLeap(i)){
                totalDays += 366;
            }else {
                totalDays += 365;
            }
        }

        // add days for all the fully completed months in the current year
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i];

            if (i == 2 && isLeap(year)){
                totalDays += 1;
            }
        }

        // add the remaining days of the current month
        totalDays += date;
        return totalDays;
    }

    public static boolean isLeap(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
