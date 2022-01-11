package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
         String[] arr ={"A", "B","A", "B","A", "B","A", "B"};
         arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
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
