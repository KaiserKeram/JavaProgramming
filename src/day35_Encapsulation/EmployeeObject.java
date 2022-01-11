package day35_Encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Muhtar",'M',36,402000);
        employee1.setAge(32);
        System.out.println(employee1);

        Employee employee2 = new Employee("Aygul",'F',32,122000);
        employee2.setSalary(employee2.getSalary() + 8000);
        System.out.println(employee2);

    }

}
