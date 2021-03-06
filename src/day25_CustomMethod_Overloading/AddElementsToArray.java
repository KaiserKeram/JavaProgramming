package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        arr = addInteger(arr,5);

        System.out.println(Arrays.toString(arr));


        double[] arr1 = {1.0, 2.0, 3.0, 4.0};

        arr1 = addDouble(arr1,5.0);

        System.out.println(Arrays.toString(arr1));


        String[] arr2 = {"a", "b", "c", "d"};

        arr2 = addString(arr2,"e");

        System.out.println(Arrays.toString(arr2));

        char[] arr3 = {'a', 'b', 'c', 'd'};

        arr3 = addChar(arr3,'e');

        System.out.println(Arrays.toString(arr3));



    }

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element){

        int[] result = new int[array.length + 1];

        int i = 0;

        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }

    //2. create a return method called addDouble that can add a double after the last index of a double array

    public static double[] addDouble(double[] array, double element){

        double[] result = new double[array.length + 1];

        int i = 0;

        for (double each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }

    //3. create a return method called addString that can add a String after the last index of a String array

    public static String[] addString(String[] array, String element){

        String[] result = new String[array.length + 1];

        int i = 0;

        for (String each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }
    
    //4. create a return method called addChar that can add a char after last index of a char array

    public static char[] addChar(char[] array, char element){

        char[] result = new char[array.length + 1];

        int i = 0;

        for (char each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;
    }


}
/*
Task2:
        1. create a return method called addInteger that can add an Integer  after the  last index of an integer array

        2. create a return method called addDouble that can add a double after the last index of a double array

       3. create a return method called addString that can add a String after the last index of a String array

        4. create a return method called addChar that can add a char after last index of a char array
 */
