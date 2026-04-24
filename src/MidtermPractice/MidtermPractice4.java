package MidtermPractice;

import java.util.Scanner;

public class MidtermPractice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(calculate(arr, n));
        scanner.close();
    }

    public static int calculate(int[][] arr, int n){
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || n - i - 1 == j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
