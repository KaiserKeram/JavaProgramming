package day30_CustomClass;

import java.util.ArrayList;

public class studentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Azfer",'M', 9, "MSA202",'A');

        Student student2 = new Student();
        student2.setInfo("Sofia",'F',3,"MDF001", 'A');

        Student student3 = new Student();
        student3.setInfo("John",'M',38,"MDF003", 'C');

        Student student4 = new Student();
        student4.setInfo("Kate",'F',35,"MDF011", 'D');

        Student student5 = new Student();
        student5.setInfo("Alim",'M',35,"MDF012", 'D');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {

            if(student.grade =='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }
        System.out.println(earlyBirds);

        System.out.println("------------------------------------------------");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        student1.eat();
        student2.drink();
        student3.code();
        student4.sleep();
        student5.eat();
    }
}
/*
Student Class:

    Attributes:
        name, gender, age, studentID

    Actions:
        eat(), sleep(), drink(), code()
 */