package day32_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John");
        System.out.println(employee1);

        Employee employee2 = new Employee("Jimmy",'M');
        System.out.println(employee2);

        Employee employee3 = new Employee("Yulia", "SDET", 'F');
        System.out.println(employee3);


    }




}
