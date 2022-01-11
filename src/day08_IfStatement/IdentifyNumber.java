package day08_IfStatement;

public class IdentifyNumber {

    public static void main(String[] args) {


        int num = 200;

        boolean isPositive = num > 0;
        boolean isNegative = num < 0;
        boolean isZero = num ==0;

        System.out.println(num + " is positive number: " + isPositive);
        System.out.println(num + " is positive number: " + isNegative);
        System.out.println(num + " is positive number: " + isZero);

    }
}
