package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        ArrayList<Integer> validNumbers = getUserInput();

        String studentID = buildStudentID(validNumbers);
        System.out.println(studentID);
    }

    public static ArrayList<Integer> getUserInput() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> validNumbers = new ArrayList<>();
        while (scanner.hasNext()) {
            String input = scanner.next();

            if (validNumbers.size() == 4) break;

            try {
                if (Integer.parseInt(input) >= 0 && Integer.parseInt(input) <= 9999){
                    validNumbers.add(Integer.parseInt(input));
                }
            }catch (Exception e){
                // ignore
            }
        }

        scanner.close();
        return validNumbers;
    }

    public static String buildStudentID(ArrayList<Integer> numList) {
        String studentID = "";

        for (int num : numList) {
            studentID += String.format("%04d", num);
        }

        return studentID;
    }
}
