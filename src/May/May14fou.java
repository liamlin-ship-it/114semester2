package May;

import java.util.Scanner;

class Employee {
    private final String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(int ratio) {
        if (ratio < 0){
            System.out.println("You cannot increase the salary by a negative amount");
        }else {
            salary = salary + (salary * ratio / 100);
        }
    }

    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

public class May14fou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();
        int salary1 = scanner.nextInt();
        int ratio1 = scanner.nextInt();

        String name2 = scanner.next();
        int salary2 = scanner.nextInt();
        int ratio2 = scanner.nextInt();

        Employee emp1 = new Employee(name1, salary1);
        Employee emp2 = new Employee(name2, salary2);

        emp1.increaseSalary(ratio1);
        emp2.increaseSalary(ratio2);

        System.out.println(emp1);
        System.out.println(emp2);

        scanner.close();
    }
}
