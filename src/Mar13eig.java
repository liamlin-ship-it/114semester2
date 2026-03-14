import java.util.Scanner;

public class Mar13eig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isPrime = true;
        if (n == 1){
            isPrime = false;
        }else {
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime);
        scanner.close();
    }
}
