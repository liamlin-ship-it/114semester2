// Based on Mar20two add another function to check leap year
import java.util.Scanner;

public class LevelUpMar20two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int index = scanner.nextInt();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] date = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        for (String element : date){
            System.out.printf("%4s", element);
        }
        System.out.println();

        for (int i = 0; i < index; i++){
            System.out.printf("%4s", "");
        }

        int myDays = days[month - 1];

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        // Calculate leap year and update the array FIRST
        if (isLeapYear && month == 2) myDays = 29;

        for (int i = 1; i <= myDays; i++){
            System.out.printf("%4d", i);

            if ((i + index) % 7 == 0){
                System.out.println();
            }
        }
    }
}
