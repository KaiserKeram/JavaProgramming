package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int num = 100;

        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        System.out.println("-----------------------");

         String result1 = (num%2 ==0)? "Even" :"Odd";
        System.out.println(result1);

        System.out.println("-----------------------");

        int num1 = 100;

        if (num1 >0){
            System.out.println("Positive");
        }else if(num1<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");

            System.out.println("-----------------------");

           String result3 = (num1>0)? "Positive" : (num1<0)? "Negative" : "Zero";
        }
    }
}
