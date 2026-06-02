package May;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class May28two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            String[] part = input.split(" ");
            String cmd = part[0];

            if (cmd.equals("ADD")){
                list.add(part[1]);
            } else if (cmd.equals("VIP")) {
                list.addFirst(part[1]);
            } else if (cmd.equals("LEAVE")) {
                list.remove(part[1]);
            } else if (cmd.equals("SERVE")) {
                if (list.isEmpty()){
                    System.out.println("Queue is empty!");
                }else {
                    System.out.println("Serving: " + list.removeFirst());
                }
            } else if (cmd.equals("CLOSE")){
                System.out.println(list + "\n" + list.size());
                break;
            }
        }
    }
}
