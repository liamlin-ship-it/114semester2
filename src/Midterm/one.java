package Midterm;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int totalSum = 0;

        for (int i = 0; i <= y; i++) {
            totalSum += calculateTerm(x, i);
        }

        System.out.println(totalSum);
        scanner.close();
    }

    public static int calculateTerm(int x, int i) {
        return x + (i * i);
    }
}
