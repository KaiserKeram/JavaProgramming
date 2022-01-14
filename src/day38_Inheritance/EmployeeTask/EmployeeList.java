package day38_Inheritance.EmployeeTask;

public class EmployeeList {

    public static void main(String[] args) {

        Tester tester = new Tester("Nijat","SDET","Cydeo",33,123,'M',150000);
        Developer dev = new Developer("Alim","Developer","Amazon Inc.",36,456,'M',450000);
        ProductOwner po = new ProductOwner("Aliya","PO","Google",46,789,'F',550000);
        BusinessAnalyst ba = new BusinessAnalyst("Asiya","BA","Cydeo",34,147,'F',130000);
        ScrumMaster sm = new ScrumMaster("Nurjan", "BM","RBC",35,258,'M',120000);
        Teacher teacher = new Teacher("Ali","Teacher","western university",45,369,'M',360000);
        Driver driver = new Driver("Tom","Driver","Toronto Taxi",39,357,'M',100000);
        Pilot pilot = new Pilot("John","Pilot","ANA",46,369,'M',400000);

        tester.work();
        dev.work();
        po.work();
        ba.work();
        sm.work();
        teacher.work();
        driver.work();
        pilot.work();

        System.out.println(tester);
        System.out.println(dev);
        System.out.println(po);
        System.out.println(ba);
        System.out.println(sm);
        System.out.println(teacher);
        System.out.println(driver);
        System.out.println(pilot);
    }
}
