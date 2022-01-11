package day17_While_DoWhile;

import java.util.Scanner;

public class MarriagePropose<sout> {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");

        String answer = scan.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid entry, please re- enter");
            System.out.println("Will you marry me?");
            answer = scan.next().toLowerCase();
        }

        if(answer.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }






    }


}
