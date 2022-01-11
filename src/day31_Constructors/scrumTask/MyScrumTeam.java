package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1 = new Tester("John,", "SDET", 123456, 150000);
        Tester tester2 = new Tester("Jonny,", "SDET", 142536, 160000);
        Tester tester3 = new Tester("Jim", "SDET", 456789, 130000);
        Tester tester4 = new Tester("Rana,", "QA", 12, 170000);

        Tester[] testers ={tester2,tester3,tester4};

        Developer developer1 = new Developer("Olga", "Java Developer", 20, 200000);
        Developer developer2 = new Developer("Sara", "Java Master", 23, 220000);
        Developer developer3 = new Developer("Oglan", "Software Developer", 24, 240000);
        Developer developer4 = new Developer("Yulia", "Software Developer", 28, 180000);

        Developer[] developers = {developer2,developer3,developer4};

        ScrumTeam scrum = new ScrumTeam("Nigara","Hasan","Nijat",21);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDeveloper(developers);

        System.out.println(scrum);

        System.out.println("-----------------------------------------------");

        for(Tester eachTester : scrum.testersList){
            System.out.println(eachTester.name + ":" + eachTester.Salary);
        }
        System.out.println("===================================================");
        for(Developer eachDeveloper : scrum.developersList){
            System.out.println(eachDeveloper.name + ":" + eachDeveloper.Salary);
        }

        System.out.println("-----------------------------------------------");

        scrum.removeTester(12);
        scrum.removeDeveloper(23);

        System.out.println(scrum);

}
}