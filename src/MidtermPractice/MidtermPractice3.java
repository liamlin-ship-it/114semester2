package MidtermPractice;

import java.util.Scanner;

public class MidtermPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(countPeaks(arr));
        scanner.close();
    }

    public static int countPeaks(int[] arr){
        int count = 0;

        if (arr.length == 1){
            return 1;
        }else {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]){
                    count++;
                }
            }

            if (arr[0] > arr[1]){
                count++;
            }

            if (arr[arr.length -1] > arr[arr.length - 2]){
                count++;
            }
        }
        return count;
    }
}
