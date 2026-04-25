package Midterm;

import java.util.Scanner;

public class nin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        String commands = "";
        for (int i = 0; i < 4; i++) {
            commands += scanner.next();
        }

        for (int k = 0; k < commands.length(); k++) {
            char cmd = commands.charAt(k);
            if (cmd == 'v') {
                verticalFlip(matrix);
            } else if (cmd == 'h') {
                horizontalFlip(matrix);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void verticalFlip(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[2][j];
            matrix[2][j] = temp;
        }
    }

    public static void horizontalFlip(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][2];
            matrix[i][2] = temp;
        }
    }
}
