package day36_Inheritance.tasks.Employee;

public class EmployeeObject {
    public static void main(String[] args) {
        Tester tester = new Tester("Kaiser",'M',37,"SDET",38,150000,"Amazon");
        tester.work();
        tester.test();

        System.out.println(tester);

        Developer developer = new Developer("John",'M',25,"Developer",39,350000,"Amazon");
        developer.work();
        developer.code();

        System.out.println(developer);

        Teacher teacher = new Teacher("Kate",'F',26, "teacher",55,100000,"TDSB");
        teacher.work();
        teacher.teach();

        System.out.println(teacher);

        Driver driver = new Driver("Tony",'M',52,"Driver",123,78000,"Toronto Taxi");
        driver.work();
        driver.drive();

        System.out.println(driver);
    }
}
