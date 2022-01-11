package day30_CustomClass;

public class Employee {

    public String name;
    public int age;
    public int ID;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, int age, int ID, char gender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle + name + " is working");
    }

}
