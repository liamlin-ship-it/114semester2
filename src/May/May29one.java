package May;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class May29one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> map = new TreeMap<>();

        while (scanner.hasNext()){
            String input = scanner.next();

            if (input.equals("end")){
                break;
            }

            map.put(input, map.getOrDefault(input, 0) + 1 );
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
