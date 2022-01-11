package day36_Inheritance;

public class Student {

    private String name;
    private int age;
    private char gender;
    private String schoolName;
    private char grade;

    public Student(String name, int age, char gender, String schoolName, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSchoolName(schoolName);
        setGender(grade);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getName(){return name;}

    public int getAge(){return age;}

    public void setName(String name){this.name = name;}

    public void setAge(int age) {
        if(age < 5 || age > 90){
            return;
        }
        this.age = age;}

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')){
            return;
        }
        this.gender = gender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade =='A' || grade =='B' || grade =='C' || grade =='D' || grade =='F')){
            return; // exits the method
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(name + " is studying");
    }
}
/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age should not be set less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
 */
