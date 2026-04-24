package Midterm;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[3];
        for (int i = 0; i < 3; i++) {
            inputs[i] = scanner.next();
        }

        int k = scanner.nextInt();
        String result = "";

        int index = 0;
        while (index < 3) {
            result = result + adjustString(inputs[index], k);
            index++;
        }

        System.out.println(result);
        scanner.close();
    }

    public static String adjustString(String input, int k) {
        String result;
        if (input.length() < k){
            result = input + input;
        }else {
            result = input;
        }
        return result;
    }
}
