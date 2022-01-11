package day31_Constructors;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("John", 15, 'M', 'A', 123456);
        System.out.println(student1);

        Student student2 = new Student("Alim", 35, 'M', 'C', 456789);
        System.out.println(student2);
    }
}
