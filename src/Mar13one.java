import java.util.Scanner;

public class Mar13one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 50 || n < -50){
            System.out.println("Error");
        }else if (n >= 30){
            System.out.println("Summer");
        }else if (20 <= n){
            System.out.println("Spring");
        }else if (10 <= n){
            System.out.println("Autumn");
        }else{
            System.out.println("Winter");
        }
    }
}
