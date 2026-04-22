package MidtermPractice;

/*
 * Given an N x M matrix,
 * print all its elements in clockwise spiral order.
 */

import java.util.Scanner;

public class MidtermPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        work(arr);
    }

    public static void work(int[][] arr){

        // Initialize the four boundary variables
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Check if there is still a valid row remaining
            // to prevent duplicate printing
            if (top <= bottom){
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // Check if there is still a valid column remaining
            // to prevent duplicate printing
            if (left <= right){
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}
