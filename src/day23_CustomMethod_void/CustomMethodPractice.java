package day23_CustomMethod_void;

public class CustomMethodPractice {
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");

        }
        /*
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");


         */
    }
    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
        /*
        System.out.println("Hello Cydeo");
        System.out.println("Hello Cydeo");
        System.out.println("Hello Cydeo");
        System.out.println("Hello Cydeo");
        System.out.println("Hello Cydeo");

         */

    }

    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();
        evenNumbers();

    }

    public static void evenNumbers(){

        for (int i = 2; i <11 ; i+=2) {

            System.out.println(i);

        }
    }
}
