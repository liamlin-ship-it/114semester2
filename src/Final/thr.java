package Final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> records = EmployeeCollector.getInputData(scanner, 5);

        String targetDepartment = scanner.next();
        scanner.close();

        EmployeeAnalyzer analyzer = new EmployeeAnalyzer(records);
        int averageSalary = analyzer.calculateAverageSalary(targetDepartment);

        System.out.println(averageSalary);
    }
}

class EmployeeCollector {
    public static ArrayList<HashMap<String, String>> getInputData(Scanner scanner, int numberOfRecords) {
        ArrayList<HashMap<String, String>> records = new ArrayList<>();
        for (int i = 0; i < numberOfRecords; i++) {
            HashMap<String, String> record = new HashMap<>();
            String name = scanner.next();
            String department = scanner.next();
            String salaryLevel = scanner.next();
            record.put("name", name);
            record.put("department", department);
            record.put("salaryLevel", salaryLevel);
            records.add(record);
        }
        return records;
    }
}

class EmployeeAnalyzer {
    private final ArrayList<HashMap<String, String>> records;

    public EmployeeAnalyzer(ArrayList<HashMap<String, String>> records) {
        this.records = records;
    }

    public int calculateAverageSalary(String departmentName) {
        int totalSalary = 0;
        int count = 0;

        for (HashMap<String, String> record : records) {
            if (record.get("department").equalsIgnoreCase(departmentName)){
                if (record.get("salaryLevel").equalsIgnoreCase("senior")){
                    totalSalary += 50000;
                } else if (record.get("salaryLevel").equalsIgnoreCase("middle")) {
                    totalSalary += 40000;
                } else if (record.get("salaryLevel").equalsIgnoreCase("junior")) {
                    totalSalary += 30000;
                }
                count++;
            }
        }

        if (count == 0){
            return 0;
        }else {
            return Math.round((float) totalSalary / count);
        }
    }
}
