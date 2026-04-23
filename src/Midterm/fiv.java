package Midterm;

import java.util.Scanner;

public class fiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        System.out.println(getNumber(num, target));
    }

    public static int getNumber(int[] num, int target){
        // We use "num.length - 1" to safely check
        // the next element without going out of bounds
        for (int i = 0; i < num.length - 1; i++) {

            // Calculate how many missing numbers exist
            // between the current and the next element
            int gap = num[i + 1] - num[i] - 1;

            // check if the target is in the gap
            if (target <= gap){
                return num[i] + target;
            }else {
                target -= gap;
            }
        }

        // If the loop finishes, and we haven't returned,
        // the missing number is beyond the array
        return num[num.length - 1] + target;
    }
}
