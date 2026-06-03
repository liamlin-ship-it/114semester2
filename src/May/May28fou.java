package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May28fou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> watchList = readWatchHistory(scanner, n);

        double avg = calculateAverage(watchList);
        System.out.printf("Average watch time: %.2f mins\n", avg);

        printQualifiedVideos(watchList, avg);

        System.out.println("Analysis Complete.");
    }

    public static ArrayList<Integer> readWatchHistory(Scanner scanner, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            list.add(arr[i]);
        }
        return list;
    }

    public static double calculateAverage(ArrayList<Integer> watchList) {
        double result = 0;
        for (Integer integer : watchList) {
            result += integer;
        }
        return result / watchList.size();
    }

    public static void printQualifiedVideos(ArrayList<Integer> watchList, double avg) {
        System.out.println("Popular videos:");
        for (int i = 0; i < watchList.size(); i++){
            if (watchList.get(i) >= avg){
                System.out.println(i + 1);
            }
        }
    }
}
