package day24_CustomMethod_Return;

import java.util.Locale;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("Cydeo", "School");
        domain("kaiser@gmail.com");
        nameOfMonth(5);
        nameOfDay(6);
        daysOfMonth(2);
        groupOfAge(37);


    }

    //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //2. Create a method that can display the domain of the email

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mer" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : (number == 12) ? "Dec" : "Invalid";
            System.out.println("name = " + name);
        }


    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number) {

        if (number >= 1 && number <= 7) {

            switch (number) {//1,2,3,4,5,6,7

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break; //exits the switch after executing the case block

                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;
            }


        } else {
            System.out.println("Invalid number");

        }

    }

    //5. Create a method that can print how many days a month has

    public static void daysOfMonth(int number) {
        String result = "";

        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    result = "28 days";
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;

                default:
                    result = "31 days";
            }
        } else {
            result = "Invalid Number";
        }
        System.out.println(result);
    }

    //5. Create a class called AgeGroups, and write a program that can define the age groups of a person
    //
    //                 age groups are:
    //                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
    //                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
    //                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
    //                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
    //                        Senior Citizen (75 - 84),
    //                        Old Senior Citizen (85+)

    public static void groupOfAge(int age){
        String groupOfAge = "";
        if (age>0 && age<120) {
            groupOfAge = (age>=1 && age<=2) ? "infant" : (age>=3 && age<=5) ? "Toddler" : (age>=6 && age<=9) ? "Kid" : (age>=10 && age<=12) ? "Pre-Teen" : (age>=13 && age<=17) ? "Teenager" : (age>=18 && age<=20) ? "Young Adult" :
                    (age>=21 && age<=39) ? "Adult" : (age>=40 && age<=49) ? "Young Middle-Aged Adult" : (age>=50 && age<=54) ? "Middle-Aged Adult" : (age>=55 && age<=64) ? "Very Young Senior Citizen" : (age>=65 && age<=74) ? "Young Senior Citizen" :
                            (age>=75 && age<=84) ? "Senior Citizen" : (age>=85) ? "Old Senior Citizen" : "invalid age";
            System.out.println("groupOfAge = " + groupOfAge);
        }


    }




    }



/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
 */
