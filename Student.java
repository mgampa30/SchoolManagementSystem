package schoolManagementSystem;

/**
 * This class is responsible for keeping the track of students fees,name, id, grade and fees paid
 */
public class Student {
 private int id; // I gave access specifier to protect somebody from accessing it outside the student class
 private String name;
 private int grade;
 private int feesPaid;
 private int feesTotal;

 public Student(int id, String name, int grade){
     this.feesPaid = 0;
     this.feesTotal = 10000;
     this.id = id;
     this.name = name;
     this.grade = grade;
 }

    /**
     * used to update student grade
     */

//Not going to alter student's name, student's id.
   public void setGrade(int grade){
     this.grade = grade;
   }
   /**
    * keep adding fees to feesPaid Field
    * Add the fees to the fees paid
    * The school is going to receive the funds
   */
   public void payFees(int fees){
     feesPaid = feesPaid+fees;
     School.updateTotalMoneyEarned(feesPaid);
   }
   public int getId(){
       return id;
   }
   public String getName(){
       return name;
   }
   public int getGrade(){
       return grade;
   }
   public int getFeesPaid(){
       return feesPaid;
   }
   public int getFeesTotal(){
       return feesTotal;
   }

    @Override
    public String toString() {
        return "Student's name:"+name+ "Total fees  paid so far $"+ feesPaid;
    }

    public int getRemainingFees(){
       return feesTotal - feesPaid;
   }
   }

