import java.util.Date;

public class Employee {
   private String name;
   private Date dob;
   private int baseSalary;


   public Employee(String name, Date dob, int baseSalary) {
      this.name = name;
      this.dob = dob;
      this.baseSalary = baseSalary;
   }


   public Employee(String name2, java.sql.Date dob2, int baseSalary2) {
   }


   public String getEmpInfo() {
      return "name - " + name + " , dob - " + dob.toString();
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Date getDob() {
      return dob;
   }

   public void setDob(Date dob) {
      this.dob = dob;
   }
   
   public int getBaseSalary() {
      return baseSalary;
   }

   public void setBaseSalary(int baseSalary) {
      this.baseSalary = baseSalary;
   }

  }
