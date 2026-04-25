package Midterm;

import java.util.Scanner;

public class eig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] dataArray = new int[n];
        for (int i = 0; i < n; i++) {
            dataArray[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int[] indexArray = new int[k];
        for (int i = 0; i < k; i++) {
            indexArray[i] = scanner.nextInt();
        }

        for (int j = 0; j < k - 1; j++) {
            int pos1 = getFirstIndex(indexArray, j);
            int pos2 = getSecondIndex(indexArray, j);

            swapAndDisplay(dataArray, pos1, pos2);
        }

        for (int i : dataArray) {
            System.out.print(i + " ");
        }
    }

    public static int getFirstIndex(int[] indexArray, int j) {
        return indexArray[j];
    }

    public static int getSecondIndex(int[] indexArray, int j) {
        return indexArray[j + 1];
    }

    public static void swapAndDisplay(int[] dataArray, int pos1, int pos2) {
        int temp = dataArray[pos1];
        dataArray[pos1] = dataArray[pos2];
        dataArray[pos2] = temp;
    }
}
