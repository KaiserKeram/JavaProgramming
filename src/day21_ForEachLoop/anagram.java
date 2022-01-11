package day21_ForEachLoop;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";
        System.out.println("--------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        String s = "Today is nice day. Today we learn Java. Today is Monday.";
        String[] sentences = s.split("\\. ");
        System.out.println(Arrays.toString(sentences));
    }
}
