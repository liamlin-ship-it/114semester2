import java.util.Scanner;

public class Apr9one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt();
        String input = scanner.next();
        while (!input.equalsIgnoreCase("n")){
            if (!input.equalsIgnoreCase("y")){
                int par = Integer.parseInt(input);
                sum += par;
            }
            input = scanner.next();
        }
        System.out.println(sum);
    }
}
