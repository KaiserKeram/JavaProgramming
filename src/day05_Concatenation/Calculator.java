package day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {

        int first_number = 100;
        int second_number = 50;
        int total = first_number + second_number;
        int subtraction = first_number - second_number;
        int multiplication = first_number * second_number;

        //  100 + 50 = 150

        System.out.println(first_number + " + "  + second_number + " = " + total);

        //  100 - 50 = 50

        System.out.println(first_number + " - "  + second_number + " = " + subtraction);

        //  100 * 50 = 500

        System.out.println(first_number + " * "  + second_number + " = " + multiplication);
    }
}
