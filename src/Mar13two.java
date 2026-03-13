import java.util.Scanner;

public class Mar13two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i >= 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
