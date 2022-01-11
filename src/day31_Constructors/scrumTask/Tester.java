package day31_Constructors.scrumTask;

public class Tester {
    public String name, JobTitle;
    public int employeeID;
    public double Salary;

    public Tester(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        JobTitle = jobTitle;
        this.employeeID = employeeID;
        Salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", Salary=" + "$" + Salary +
                '}';
    }

    public void smokeTesting() {System.out.println(name  + " is smoke testing."); }
    public void creatingTicket(){System.out.println(name + " is creating ticket."); }
    public void dailyStandUp(){System.out.println(name + " is daily stand up."); }
}
