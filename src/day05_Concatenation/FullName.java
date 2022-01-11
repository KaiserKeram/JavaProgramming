package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String first_name = "John";
        String last_name = "Tom";
        int age = 45;
        String JobTitle = "SDET";
        String CompaneName = "Cydeo";
        double salary = 100000.58;


        String full_name = first_name + " " + last_name;

        //Full name of the person is ________.
        System.out.println("Full name of the person is " + full_name + ".");

        //___is ___years old

        System.out.println(full_name + " is " + age + " years old");

        //Full name is JobTitle, work at CompanyName

        System.out.println(full_name + " is " + JobTitle + ", works at " + CompaneName + ", and " + full_name + "'s salary is $" + salary);


    }
}
