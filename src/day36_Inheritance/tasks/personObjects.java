package day36_Inheritance.tasks;

public class personObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setInfo("Murat",35,'M');
        person1.eat("Sushi");
        person1.drink("Sake");

        System.out.println(person1);
    }
}
