package day31_Constructors;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("John", 'M', 35);
        Person person2 = new Person("Yulia", 'F', 36);
        Person person3 = new Person("Ghayret", 'M', 38);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
