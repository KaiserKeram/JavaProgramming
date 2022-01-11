package day36_Inheritance.tasks.Employee;

public class Developer extends Employee{

    public Developer(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        super(name, gender, age, jobTitle, ID, salary, companyName);
    }

    public void code(){
        System.out.println(name + " is coding");
    }
}
