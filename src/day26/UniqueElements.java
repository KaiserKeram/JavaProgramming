package day26;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {


    
    
    
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


}
