package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulkoperations {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,3,5,5,5,5,5,8,8,8,8,8,8)); // addAll(CollectionType): ass collection of valies to the arraylist.
        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8)); // removeAll(Collection Type): removes all the matching elements from arraylist.
        System.out.println(list);

        System.out.println("-------------------------------------------");

        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));
        numbers.retainAll(Arrays.asList(100,200,300)); // retainAll(collectionType) : removes all the non-matching elements from arraylist.
        System.out.println(numbers);

        System.out.println("-----------------------");

        ArrayList<String>jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);

        System.out.println("----------------------------------------");

        ArrayList<Integer>nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10)); // checks if the all the elements are contained in the arraylist

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //asList (array of values) ==> return the collection type of values

        System.out.println("-----------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namelist = new ArrayList<>(Arrays.asList(names));
        /*
        ArrayList<String> nameslist = new ArrayList<>();

        nameslist.addAll(Arrays.asList(names));

         */

        System.out.println(namelist);

        System.out.println("-----------------------------------------");

        //int [] arr = {1,2,3,4,5,6,7,8,9,10};

        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list3);

        System.out.println("------------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list4 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list4 = " + list4);


    }
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);

        }
        return list;
    }
}
