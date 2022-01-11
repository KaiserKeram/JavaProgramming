package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("A"); //index 0
        students.add("B"); //index 1
        students.add("C"); //index 2
        students.add("D"); //index 3
        students.add("E"); //index 4
        students.add("F"); //index 5
        students.add(2, "G"); // index number must be in the index...no out of index
        System.out.println(students);
        //add(data) : add the data after the last index of the Arraylist
        //add(index, data) : insert the data at the given index.

        System.out.println("----------------------------------------------------------");

        System.out.println(students.size());

        int lastIndex = students.size() - 1; // size : tell us total numbers of element.
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("--------------------------------------------------");

        String name = students.get(3);
        System.out.println(name);

        System.out.println("--------------------------------------------------");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i)); // return the element at given index
            }
        System.out.println("-----------------------------------------------");

        ArrayList<String>list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); //set(index, element): return the given element in given index. (like replace)

        System.out.println(list);

        System.out.println("-----------------------------------------------");

        //remove(): remove the Object element and index number of element

        ArrayList<String> employees = new ArrayList<>();
        employees.add("A");
        employees.add("B");
        employees.add("C");
        employees.add("D");
        employees.add("E");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);

        System.out.println("-------------------------------------------------------");



    }
}
