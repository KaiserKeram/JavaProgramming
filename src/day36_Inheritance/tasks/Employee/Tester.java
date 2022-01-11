package day36_Inheritance.tasks.Employee;

public class Tester extends Employee{

    public Tester(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        super(name, gender, age, jobTitle, ID, salary, companyName);
    }

    public void test(){
        System.out.println(name + " is testing");
    }
}
