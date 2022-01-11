package day36_Inheritance.tasks.Employee;

public class Driver extends Employee{

    public Driver(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        super(name, gender, age, jobTitle, ID, salary, companyName);
    }

    public void drive(){
        System.out.println(name + " is driving");
    }
}
