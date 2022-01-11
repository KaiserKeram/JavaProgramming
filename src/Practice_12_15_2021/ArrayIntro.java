package Practice_12_15_2021;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {
        String[] color = {"Yellow", "Blue", "Purple"};
        //                   0         1        2

        // finding size of Array
        System.out.println(color.length);

        //equals
        int[] num1 = new int[4];

        num1[0] =42;
        num1[1] =2;
        num1[2] =22;
        num1[3] =32;
        System.out.println(Arrays.toString(num1));

        int[] num2 = {1, 2, 3, 4};

        System.out.println("Arrays.equals(num1,num2) = " + Arrays.equals(num1,num2));

        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));






        String[] color2 = new String[3];
        color2[0]="Red";
        color2[1]="Orange";
        color2[2]="Green";
        System.out.println(Arrays.toString(color2));
        System.out.println(color[1]);



    }
}
