package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        ArrayList<Double> validScores = collectAndValidateScores("end");

        calculateAndDisplayTotal(validScores);
    }

    public static ArrayList<Double> collectAndValidateScores(String sentinel) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> validScores = new ArrayList<>();

        while (scanner.hasNext()) {
            String input = scanner.next();

            if (input.equalsIgnoreCase(sentinel)) break;
            try {
                validScores.add(Double.parseDouble(input));
            }
            catch (Exception e) {
                System.out.println(input + " is not a valid score format");
            }
        }
        return validScores;
    }

    public static void calculateAndDisplayTotal(ArrayList<Double> scoreList) {
        double total = 0;
        for (double score : scoreList) {
            total += score;
        }
        System.out.println(total);
    }
}
