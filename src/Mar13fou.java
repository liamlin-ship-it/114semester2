import java.util.Scanner;

public class Mar13fou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] arr = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};

        int get = (((n % 12) - 4) + 12) % 12;
        System.out.print(arr[get]);

        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
            System.out.print(" 1");
        }else {
            System.out.print(" 0");
        }
    }
}
