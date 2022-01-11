package day32_Constructors;

public class Employee {
    public String name, JobTitle;
    public char gender;
    public double Salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this(name);  //this.name = name;
        this.gender = gender;
    }

    public Employee(String name, String jobTitle, char gender) {
        this(name,gender); //this.name = name; // this gender = gender;
        this.JobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, char gender, double salary) {
        this(name, jobTitle, gender);//this.name = name;
                                   //this.JobTitle = jobTitle;
                                   //this.gender = gender;
        this.Salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", gender=" + gender +
                ", Salary=" + Salary +
                '}';
    }
}
