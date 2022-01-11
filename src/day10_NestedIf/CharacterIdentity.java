package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '@';

        if(ch >=0 && ch <=9) {

            System.out.println("Digit");
        }else if(ch >='A' && ch <='Z')  {
            System.out.println("Alphabetic");
        }
        System.out.println("Special Character");


    }
}
