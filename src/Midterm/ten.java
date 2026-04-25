package Midterm;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] energy = new int[n];
        for (int i = 0; i < n; i++) {
            energy[i] = scanner.nextInt();
        }

        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextInt();
        }

        // 記錄「整座島」加起來的總電量盈虧
        int totalSurplus = 0;

        // 記錄「從目前起點出發」開到現在的電量盈虧
        int currentSurplus = 0;

        // 記錄目前的「起點站編號」，一開始先假設從第 0 站出發
        // 要從哪個起點開始不是我隨便決定，
        // 而是要看從哪裡開始才有辦法完成環島
        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            totalSurplus += energy[i] - cost[i];
            currentSurplus += energy[i] - cost[i];

            // 電量 < 0 代表到不了下一站
            if (currentSurplus < 0){
                // 把「下一站」當作新的嘗試起點
                startIndex = i + 1;
                // 換了新起點，舊的油表紀錄就不算了，儀表板歸零重新出發
                currentSurplus = 0;
            }
        }

        if (totalSurplus < 0){
            System.out.println(-1);
        }else {
            System.out.println(startIndex);
        }
    }
}
