package day36_Inheritance.tasks.Employee;

public class Teacher extends Employee{
    public Teacher(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        super(name, gender, age, jobTitle, ID, salary, companyName);
    }

    public void teach(){
        System.out.println(name + " is teaching");
    }
}
