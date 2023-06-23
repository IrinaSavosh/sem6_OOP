public class CalculateNetSalary {

   private int salaryBase;

   public CalculateNetSalary(int salaryBase) {
      this.salaryBase = salaryBase;
   }

   public int calculateNetSalary() {

      int tax = (int) (salaryBase * 0.25);// calculate in otherway
      return salaryBase - tax;
   }

   public int getSalaryBase() {
      return salaryBase;
   }

   public void setSalaryBase(int salaryBase) {
      this.salaryBase = salaryBase;
   }
}
