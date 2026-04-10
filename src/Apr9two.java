import java.util.Scanner;

public class Apr9two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        String value = String.valueOf(sum);

        StringBuilder reverse = new StringBuilder(value).reverse();
        String toString = reverse.toString();

        if (toString.equals(value)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
