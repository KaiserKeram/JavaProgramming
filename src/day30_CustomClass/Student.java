package day30_CustomClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public String ID;
    public char grade;

    /*public void setInfo(String studentName, char studentGender, int studentAge, String studentID, char studentGrade){
        name = studentName;
        gender = studentGender;
        age = studentAge;
        ID = studentID;
        grade = studentGrade;
    }

     */

    public void setInfo(String name, char gender, int age, String ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void code(){
        System.out.println(name + " is coding");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID='" + ID + '\'' +
                ", grade=" + grade +
                '}';
    }
}
// this.