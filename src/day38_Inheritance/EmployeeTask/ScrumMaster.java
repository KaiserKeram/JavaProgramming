package day38_Inheritance.EmployeeTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, String jobTitle, String companyName, int age, int ID, char gender, double salary) {
        super(name, jobTitle, companyName, age, ID, gender, salary);
    }

    public void work() {
        System.out.println(name + " is opening meeting");
    }
}
