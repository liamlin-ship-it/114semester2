package Midterm;

import java.util.Scanner;

public class fou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        int[] queries = new int[k];
        for (int i = 0; i < k; i = i + 1) {
            queries[i] = scanner.nextInt();
        }

        processQueries(matrix, queries, k);
    }

    public static void processQueries(int[][] matrix, int[] queries, int k) {
        for (int i = 0; i < k; i++) {
            System.out.println(calculateRowSum(matrix, queries[i]));
        }
    }

    public static int calculateRowSum(int[][] matrix, int targetRow) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[targetRow][j];
        }
        return sum;
    }
}
