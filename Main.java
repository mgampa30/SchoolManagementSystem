package schoolManagementSystem;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Teacher Jacob = new Teacher(1,"Jacob", 2000);
        Teacher Jack = new Teacher(2, "Jack", 1000);
        Teacher Atef = new Teacher(3, "Atef", 900);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Jacob);
        teacherList.add(Jack);
        teacherList.add(Atef);

        Student Monica = new Student(1,"Monica",4);
        Student Prags = new Student(2,"Prags",3);
        Student Harshi = new Student(3,"Harshi",2);

        List<Student> StudentList = new ArrayList<>();
        StudentList.add(Monica);
        StudentList.add(Prags);
        StudentList.add(Harshi);

        School ghs = new School(teacherList,StudentList);

        Monica.payFees(4000);
        Prags.payFees(5000);
        System.out.println("GHS has earned $" +ghs.getTotalMoneyEarned());
        System.out.println("-----Making GHS Pay Salary-----");
        Jacob.receiveSalary(Jacob.getSalary());
        System.out.println("GHS has spent for salary to "+ Jacob.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());
        Atef.receiveSalary(Atef.getSalary());
        System.out.println("GHS has spent for salary to " + Atef.getName()
        +"and now has $ " + ghs.getTotalMoneyEarned());

        System.out.println(Prags);

        Jack.receiveSalary(Jack.getSalary());
        System.out.println(Jack);
    }
}
