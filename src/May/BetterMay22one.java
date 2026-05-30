package May;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BetterMay22one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allFruits = new ArrayList<>();
        ArrayList<String> uniqueOrder = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String fruit = scanner.next();
            allFruits.add(fruit);

            if (!uniqueOrder.contains(fruit)){
                uniqueOrder.add(fruit);
            }
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<String> rangeList = allFruits.subList(a, b + 1);

        // Iterating over uniqueOrder ensures correct
        // output order and prevents duplicate prints.
        for (String fruit : uniqueOrder){
            // Count how many times the fruit appears
            // within the target range.
            int count = Collections.frequency(rangeList, fruit);

            if (count > 0){
                System.out.println(fruit + " " + count);
            }
        }
    }
}
