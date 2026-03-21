import java.util.Scanner;

public class Mar20one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] spl = input.split("");

        int count = 0;
        boolean isValid = true;
        for (String element : spl){
            if (element.equals("(")){
                count++;
            } else if (element.equals(")")){
                count--;
            }

            // If count drops below 0,
            // a ')' appeared without a matching '('
            if (count < 0) isValid = false;
        }

        if (count != 0) isValid = false;

        if (isValid){
            System.out.println("legal");
        }else {
            System.out.println("illegal");
        }

        scanner.close();
    }
}
