import java.util.Scanner;

public class BetterApr9one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt() + scanner.nextInt();

        while (true){
            String input = scanner.next();

            if (input.equalsIgnoreCase("n")){
                break;
            } else if (input.equalsIgnoreCase("y")) {
                int nextNumber = scanner.nextInt();
                sum += nextNumber;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
