package May;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class May28fiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            System.out.println(n + " " + m);

            if (n == 0 && m == 0){
                break;
            }

            Integer[] num = new Integer[n];
            for (int i = 0; i < n; i++) {
                num[i] = scanner.nextInt();
            }

            Arrays.sort(num, new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    int remA = a % m;
                    int remB = b % m;

                    if (remA != remB){
                        return Integer.compare(remA, remB);
                    }

                    boolean isOddA = Math.abs(a % 2) == 1;
                    boolean isOddB = Math.abs(b % 2) == 1;

                    if (isOddA && !isOddB){
                        return -1;
                    }
                    if (!isOddA && isOddB){
                        return 1;
                    }

                    if (isOddA && isOddB){
                        return Integer.compare(b, a);
                    }

                    return Integer.compare(a, b);
                }
            });

            for (int i = 0; i < n; i++) {
                System.out.println(num[i]);
            }
        }
    }
}
