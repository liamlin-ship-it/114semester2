package June;

import java.util.Scanner;
import java.util.ArrayList;

class Member {
    protected String id;
    protected String dept;
    protected String name;
    protected String email;
    protected String phone;

    public Member() {

    }

    public Member(String id, String dept, String name, String email, String phone) {
        this.id = id;
        this.dept = dept;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getInfo() {
        return "學號: " + id + "\n科系: " + dept + "\n姓名: " + name + "\n電子郵件: " + email + "\n電話: " + phone;
    }
}

class Teacher extends Member{
    public String title;
    public int salary;
    private final ArrayList<String> subjects = new ArrayList<>();

    public Teacher(String id, String dept, String name, String email, String phone, String title, int salary){
        super(id, dept, name, email, phone);
        this.title = title;
        this.salary = salary;
    }

    public void addSubject(String subject){
        if (!subjects.contains(subject)){
            subjects.add(subject);
        }else {
            System.out.println("科目已存在: " + subject);
        }
    }

    public void removeSubject(String subject){
        if (subjects.contains(subject)){
            subjects.remove(subject);
        }else {
            System.out.println("科目不存在: " + subject);
        }
    }

    public String getSubjectListStr(){
        String result;

        if (!subjects.isEmpty()){
            result = String.join("、", subjects);
        }else {
            result = "尚無開課科目";
        }
        return result;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n職稱: " + title + "\n月薪: " + salary + "\n開課科目: " + getSubjectListStr();
    }
}

public class June5one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String info = scanner.nextLine();
        String add = scanner.nextLine();
        String remove = scanner.nextLine();

        Teacher teacher = new Teacher(info.split(" ")[0], info.split(" ")[1], info.split(" ")[2], info.split(" ")[3], info.split(" ")[4], info.split(" ")[5], Integer.parseInt(info.split(" ")[6]));

        for (String addOne : add.split(" ")){
            teacher.addSubject(addOne);
        }

        for (String removeOne : remove.split(" ")){
            teacher.removeSubject(removeOne);
        }

        System.out.println(teacher.getInfo());
    }
}
