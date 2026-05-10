package May;

import java.util.Scanner;

record Student(String ID, String name, int computerIntro, int programming, int calculus) {

    public void showInfo() {
        System.out.println("學號: " + ID);
        System.out.println("姓名: " + name);
        System.out.println("計算機概論: " + computerIntro);
        System.out.println("計算機程式設計: " + programming);
        System.out.println("微積分: " + calculus);
    }


    public int getTotal() {
        return computerIntro + programming + calculus;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }
}

public class May8one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ID = scanner.next();
        String name = scanner.next();
        int computerIntro = scanner.nextInt();
        int programming = scanner.nextInt();
        int calculus = scanner.nextInt();

        scanner.close();

        Student student = new Student(ID, name, computerIntro, programming, calculus);

        student.showInfo();
        System.out.println("總分: " + student.getTotal());
        System.out.println("平均: " + student.getAverage());
    }
}
