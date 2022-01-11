package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);

        System.out.println(list);

        System.out.println("-----------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        System.out.println(list2);

        Collections.reverse(list2);

        System.out.println(list2);

        System.out.println("-------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3, 1, 4);

        System.out.println(list3);

        System.out.println("---------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,20,30,40,50,60,70));

        int max = Collections.max(list4);

        System.out.println(max);

        System.out.println("----------------------------");

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(10,20,30,40,50,60,70));

        int min = Collections.min(list5);

        System.out.println(min);

        System.out.println("----------------------------------");

        ArrayList<Integer> list6 = new ArrayList<>();
        list6.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list6, 10,1000);
        System.out.println(list6);

        System.out.println("-----------------------------");

        int frequency = Collections.frequency(list6, 1000);
        System.out.println(frequency);

        System.out.println("------------------------------");

        ArrayList<String> list7 = new ArrayList<>();
        list7.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#"));
        int countJava = Collections.frequency(list7, "Java");
        int countPython = Collections.frequency(list7,"Python");

        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);




    }

}
