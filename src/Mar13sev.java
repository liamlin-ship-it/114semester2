import java.util.Arrays;
import java.util.Scanner;

public class Mar13sev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] spl = s.split(", ");

        Arrays.sort(spl, (person1, person2) -> {
            String[] data1 = person1.split("-");
            double h1 = Double.parseDouble(data1[1]) / 100;
            double w1 = Double.parseDouble(data1[2]);
            double bmi1 = w1 / (h1 * h1);

            String[] data2 = person2.split("-");
            double h2 = Double.parseDouble(data2[1]) / 100;
            double w2 = Double.parseDouble(data2[2]);
            double bmi2 = w2 / (h2 * h2);

            return Double.compare(bmi1,  bmi2);
        });

        System.out.println(Arrays.toString(spl));
    }
}
