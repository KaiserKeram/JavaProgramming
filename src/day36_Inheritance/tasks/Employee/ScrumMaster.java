package day36_Inheritance.tasks.Employee;

public class ScrumMaster extends Employee{


    public ScrumMaster(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        super(name, gender, age, jobTitle, ID, salary, companyName);
    }

    public void startSprint(){
        System.out.println(name + " is starting sprint");
    }
}
