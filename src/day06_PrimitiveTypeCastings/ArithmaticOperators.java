package day06_PrimitiveTypeCastings;

public class ArithmaticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); //121 concatenation
        System.out.println(10 + 20); //30 addition
        System.out.println(20 - 10); //10 subtract
        System.out.println(10 * 4); //40 multiplication
        System.out.println(10/4); // in math 2.5 ; in java 10/4 = 2   10.0 / 4 = 2.5
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println(10/4.0);
        System.out.println(10d/4);
        System.out.println(10/4d);

        //integer / integer = integer
        //deciaml/integer = decimal

        int a = 100;
        double b = a/6;
        System.out.println(b);

        double c = (double)a/6;
        System.out.println(c);




        /*
        + ; addition
        - ; subtract
        / ; division
        * ; multiplication
        % ; Remainder

        */
    }
}
