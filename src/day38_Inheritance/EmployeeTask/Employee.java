package day38_Inheritance.EmployeeTask;

public class Employee {
    public String name, jobTitle, companyName;
    public int age, ID;
    public char gender;
    public double salary;

    public Employee(String name, String jobTitle, String companyName, int age, int ID, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender=" + gender +
                ", salary= $ " + salary +
                '}';
    }
}
