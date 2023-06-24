import java.sql.Date;

public class App {
    public static void main(String[] args) throws Exception {
      
        Employee pers1 = new Employee("Anna", new Date(103, 05, 07), 250); //
        System.out.println(pers1.getDob()); // интересно, когда создавали такой конструктор в Date, не планировали, что
                                            // после 2000 года будет еще кто-то жить?
        CalculateNetSalary pers1Calc = new CalculateNetSalary(pers1.getBaseSalary());
        int salary = pers1Calc.calculateNetSalary();
       
        System.out.println(salary);
    }
}
  /*
         * 1) Переписать код в соответствии с Single Responsibility Principle:
         * public class Employee {
         * private String name;
         * private Date dob;
         * private int baseSalary;
         * public Employee(String name, Date dob, int baseSalary) {
         * this.name = name;
         * this.dob = dob;
         * this.baseSalary = baseSalary;
         * }
         * public String getEmpInfo() {
         * return "name - " + name + " , dob - " + dob.toString();
         * }
         * public int calculateNetSalary() {
         * int tax = (int) (baseSalary * 0.25);//calculate in otherway
         * return baseSalary - tax;
         * }
         * }
         * ​
         * Подсказка: вынесите метод calculateNetSalary() в отдельный класс
         */

