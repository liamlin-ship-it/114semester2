import java.util.Scanner;

public class Mar13six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.next();
        int ageDis = scanner.nextInt();

        String[] arr = {"鼠", "牛", "虎", "兔", "龍", "蛇", "馬", "羊", "猴", "雞", "狗", "豬"};

        boolean found = false;
        int animalYears = 0;
        for (int i = 0; i < 12; i++){
            if (animal.equals(arr[i])){
                animalYears = i;
                found = true;
            }
        }



        if (found){
            //B - A = ageDis => dis + a = b
            int myYear = (((ageDis + animalYears) % 12) + 12) % 12;
            System.out.println(arr[myYear]);
        }else {
            System.out.println("輸入生肖錯誤");
        }
    }
}
