package Practice_12_15_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int number=input.nextInt();

        int[] fibo = new int[number];

        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i < number ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.println(Arrays.toString(fibo));
    }


}

/*
Scanner input=new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int number=input.nextInt();
        int num0=0;
        int num1=1;
        int result=0;

        System.out.println(num0);
        System.out.println(num1);

        for(int i=2;i<number;i++){
            result=num0+num1; // 0+1=1
            System.out.println(result);
            num0=num1; //num1=1
            num1=result; //num2=1
        }
 */
