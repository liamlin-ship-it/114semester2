package MidtermPractice;

/*
 * Given an N x M binary matrix, count the number of 'lonely 1s'.
 * A 1 is considered lonely if it has no adjacent 1s horizontally or vertically.
 */

import java.util.Scanner;

public class MidtermPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i][j] == 1){
                    boolean isLonely = true;

                    if (i > 0 && arr[i - 1][j] == 1
                        || i < x - 1 && arr[i + 1][j] == 1
                        || j > 0 && arr[i][j - 1] == 1
                        || j < y - 1 && arr[i][j + 1] == 1) {
                        isLonely = false;
                    }

                    if (isLonely) count++;
                }
            }
        }

        System.out.println(count);
    }
}
