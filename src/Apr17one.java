import java.util.Scanner;

public class Apr17one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = f(n);
        System.out.println(sum);
        scanner.close();
    }

    public static int f(int n){
        // if n is a single digit,
        // the sum of its digits is simply the number itself
        if (n < 10){
            return n;
        }

        return n % 10 + f(n / 10);
    }
}
