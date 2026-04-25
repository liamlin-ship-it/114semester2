package Midterm;

import java.util.Scanner;

public class sev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        int i = 0;
        while (i < n) {
            numbers[i] = scanner.nextInt();
            i = i + 1;
        }

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        amplifyAndPrint(numbers, a1, a2, a3);

        scanner.close();
    }

    public static void amplifyAndPrint(int[] numbers, int a1, int a2, int a3) {
        for (int number : numbers) {
            System.out.print((number * a1) + (number * a2) + (number * a3) + " ");
        }
    }
}
