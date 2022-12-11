package schoolManagementSystem;

/**
 * This class is responsible for keeping the track of teacher's name, ID, and the salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = salaryEarned;
    }

    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                + "Total salary earned so far $"
                +salaryEarned;
    }

    public void receiveSalary(int salary){
       salaryEarned += salary;
       School.updateTotalMoneySpent(salary);
    }
}
