package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    //print each integer of an integer array in separate lines

    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);

        }
    }

    //print each double of a double array in separate lines
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);

        }
    }

    //print each char of a char array in separate lines
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //print each String of a String array in separate lines
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    //return the maximum number for integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //return the maximum number for double array

    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //return the min number for integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];

    }
        //return the min number for integer array
        public static double min ( double[] numbers){
            Arrays.sort(numbers);
            return numbers[0];
        }
    //checks if the given integer is contained in the given array. return boolean.
    public static boolean contains(int[] array, int element){
    boolean result = false;

                for (int each: array) {
                    if(each == element){
                        result = true;
                    }
                }
                    return result;
                }
    //checks if the given double is contained in the given array. return boolean.
    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each: array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array. return boolean.
    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each: array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. return boolean.
    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each: array) {
            if(each.equals(element)){
                result = true;
            }
        }
        return result;
    }
    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];
        int i =0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];
        int i =0;
        for (double each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;
        return result;
    }
    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];
        int i =0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;
        return result;
    }
    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];
        int i =0;
        for (char each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;
        return result;
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }
    //return the unique element of array as a new array

    public static int[] uniqueElements(int[] array){
        int[] result = {};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;

    }

    //return the unique element of array as a new array

    public static double[] uniqueElements(double[] array){
        double[] result = {};

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;

    }
    //return the unique element of array as a new array

    public static char[] uniqueElements(char[] array){
        char[] result = {};

        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;

    }
    //return the unique element of array as a new array

    public static String[] uniqueElements(String[] array){
        String[] result = {};

        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each) ==1){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;

    }

    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index<0 || index>array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index<0 || index>array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index<0 || index>array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index<0 || index>array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }
    //replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }
    //replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }
    //replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue)){
                array[i] = newValue;
            }

        }
        return array;
    }

    //                    {1,1,2,2,3,3}
    public static int[] removeDuplicates(int[] array){

        int[] result = {};
        for(int each : array){
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }
    //                    {1.5,1.5,2.5,2.5,3.5,3.5}
    public static double[] removeDuplicates(double[] array){

        double[] result = {};
        for(double each : array){
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }
    //                    {'A','B','A','B','A','B'}
    public static char[] removeDuplicates(char[] array){

        char[] result = {};
        for(char each : array){
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }
    //                    {"A", "B","A", "B","A", "B","A", "B",}
    public static String[] removeDuplicates(String[] array){

        String[] result = {};
        for(String each : array){
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;


    }






}