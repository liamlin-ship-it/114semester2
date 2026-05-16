package May;

import java.util.Scanner;

class ScoreManager {
    public int getHighest(int[] arr) {
        int highest = arr[0];
        for (int j : arr) {
            if (highest < j) {
                highest = j;
            }
        }
        return highest;
    }

    public int getLowest(int[] arr) {
        int lowest = arr[0];
        for (int j : arr) {
            if (lowest > j) {
                lowest = j;
            }
        }
        return lowest;
    }

    public void reverseSequence(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class May14two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        ScoreManager sm = new ScoreManager();

        System.out.println(sm.getHighest(scores));
        System.out.println(sm.getLowest(scores));

        sm.reverseSequence(scores);
    }
}
