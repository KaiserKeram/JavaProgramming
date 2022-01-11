package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        /*list.remove(1);
        System.out.println(list);

         */
        Integer num = 100;
        list.remove(num); // list.remove(100) ==> 100 is index number here, not element.
        System.out.println(list);

        System.out.println("-----------------------------------------------------");

        System.out.println(list.size());

        list.clear(); // remove all elements from array

        System.out.println(list.size());

        System.out.println("-------------------------------------------");

        // indexOf(Data) : returns the first matching element's index number return int
        // LastIndexOf(Data): return the last matching element's index number return int

        ArrayList<Character> employees = new ArrayList<>();
        employees.add('A');
        employees.add('A');
        employees.add('A');
        employees.add('A');
        employees.add('A');

        int a = employees.indexOf('A');
        int b = employees.lastIndexOf('A');

        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------------------");

        boolean r2 = employees.contains('A'); // return true is the element contained the array
        boolean r3 = employees.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("------------------------------------------");

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2)); // if the two arrays element is same ,return true

        System.out.println("--------------------------------------");

        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);

    }
}
