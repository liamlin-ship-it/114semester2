package May;

import java.util.Scanner;

public class May14thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        String[] rank = new String[5];

        String[] s = {"1st", "2nd", "3rd"};

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            rank[i] = String.valueOf(num[i]);
        }

        for (int i = 0; i < 3; i++) {
            int maxIdx = maxIndex(num);
            rank[maxIdx] = s[i];
            num[maxIdx] = -1;
        }

        for (String string : rank) {
            System.out.print(string + " ");
        }
    }

    public static int maxIndex(int[] num){
        int maxIdx = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[maxIdx] < num[i]){
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
