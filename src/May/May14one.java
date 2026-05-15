package May;

import java.util.Scanner;

public class May14one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        int score1 = scanner.nextInt();
        int add1 = scanner.nextInt();

        String name2 = scanner.next();
        int score2 = scanner.nextInt();
        int add2 = scanner.nextInt();

        if (add1 < 0){
            System.out.println("Score cannot be negative");
        }

        if (add2 < 0){
            System.out.println("Score cannot be negative");
        }

        if (add1 >= 0){
            System.out.println(name1 + " " + (score1 + add1));
        }else {
            System.out.println(name1 + " " + score1);
        }

        if (add2 >= 0){
            System.out.println(name2 + " " + (score2 + add2));
        }else {
            System.out.println(name2 + " " + score2);
        }
    }
}
