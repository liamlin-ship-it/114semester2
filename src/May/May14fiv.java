package May;

import java.util.HashMap;
import java.util.Scanner;

public class May14fiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> myMap = new HashMap<>();

        int n = scanner.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        int maxCount = 0;
        for (int i = 0; i < n - 1; i++) {
            // 將相鄰的兩個數字組合成字串
            String pair = num[i] + " " + num[i + 1];

            // 如果 map 裡有這個 pair 就拿它的次數，沒有就當作 0
            int currentCount = myMap.getOrDefault(pair, 0) + 1;
            myMap.put(pair, currentCount);

            if (currentCount > maxCount){
                maxCount = currentCount;
            }
        }

        if (maxCount <= 1){
            // 如果最高次數只有 1，代表沒有重複出現的子序列
            System.out.println("Cannot cut out any segment.");
        }else {
            for (int i = 0; i < n - 1; i++) {
                String pair = num[i] + " " + num[i + 1];

                // 檢查這個組合是否在 Map 中，並且次數等於最大次數
                if (myMap.containsKey(pair) && myMap.get(pair) == maxCount){
                    System.out.println(pair);

                    // 印完之後，把它從 Map 中移除，
                    // 這樣迴圈走到後面遇到重複的就不會再印一次
                    myMap.remove(pair);
                }
            }
        }
    }
}
