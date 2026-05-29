package May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class May22one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (String s : list) {
            if (map.containsKey(s)) {
                System.out.println(s + " " + map.get(s));
            }
        }
    }
}
