package day25_CustomMethod_Overloading;

import Utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printEach(arr1);

        System.out.println("------------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5, 5.5};

        ArraysUtility.printEach(arr2);

        System.out.println("------------------------------------------");

        char[] arr3 = {'a', 'b', 'c', 'd'};
        ArraysUtility.printEach(arr3);

        System.out.println("------------------------------------------");

        String[] arr4 = {"a", "b", "c", "d"};
        ArraysUtility.printEach(arr4);

        System.out.println("-------------------------------------------");

        int[] numbers = {1, 2, 3, 4, 5, 6, 10};
        int max1 = ArraysUtility.max(numbers);
        System.out.println("max1 = " + max1);

        System.out.println("-------------------------------------------");

        double[] numbers1 = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 10.5};
        double max2 = ArraysUtility.max(numbers1);
        System.out.println("max2 = " + max2);

        System.out.println("-------------------------------------------");

        int[] a1= {1, 2, 3, 4, 5, 6, 7};
        boolean r1 = ArraysUtility.contains(a1, 5);
        System.out.println("result = " + r1);

        System.out.println("-------------------------------------------");

        double[] a2= {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5};
        boolean r2 = ArraysUtility.contains(a2, 5.5);
        System.out.println("result = " + r2);

        System.out.println("-------------------------------------------");

        char[] a3= {'a', 'b', 'c', 'd'};
        boolean r3 = ArraysUtility.contains(a3, 'e');
        System.out.println("result = " + r3);



    }
}
