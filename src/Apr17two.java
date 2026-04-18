import java.util.Scanner;

public class Apr17two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String reverse = getReversed(s);
        System.out.println(reverse);
        scanner.close();
    }

    public static String getReversed(String s){
        // if the string is empty ("") or just one character,
        // it is already reversed!
        if (s.length() <= 1){
            return s;
        }

        return getReversed(s.substring(1)) + s.charAt(0);
    }
}
