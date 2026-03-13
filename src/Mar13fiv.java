import java.util.Scanner;

public class Mar13fiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the numbers length you want to run
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            int N = scanner.nextInt();
            int k = 0;

            while (N > 1){
                N /= 2;
                k++;
            }

            System.out.println(k);
        }
    }
}
