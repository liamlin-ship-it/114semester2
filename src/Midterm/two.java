package Midterm;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
                sum += numbers[i];
            }
        }

        transformArrayInPlace(numbers, sum);

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void transformArrayInPlace(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sum - numbers[i];
        }
    }
}
