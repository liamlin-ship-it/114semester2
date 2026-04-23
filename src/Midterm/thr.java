package Midterm;

import java.util.Scanner;

public class thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int result = calculateRangeSum(numbers, start, end);
        System.out.println(result);

        scanner.close();
    }

    public static int calculateRangeSum(int[] numbers, int start, int end) {
        if (start > end){
            int temp = start;
            start = end;
            end = temp;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
