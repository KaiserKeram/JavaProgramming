package day26;

public class RemoveElements1 {

    //remove integer element from integer array
    public static int[] removeElement(int[] array, int index){
        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length-1];
        int j = 0;
        for (int each : array) {
            if(each == array[index]){
                continue;
            }
            result[j++] = each;
        }
            return result;
        }
    }
