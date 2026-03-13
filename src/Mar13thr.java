import java.util.Scanner;

public class Mar13thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int temp1 = num[a];
        num[a] = num[b];
        num[b] = temp1;

        int temp2 = num[c];
        num[c] = num[d];
        num[d] = temp2;

        for (int result : num){
            System.out.print(result +" ");
        }
    }
}
