package day25_CustomMethod_Overloading;

import Utilities.StringUtility;

public class test {
    public static void main(String[] args) {

        String str = "Java Programming language";
        StringUtility.printEachChar(str);

        System.out.println("------------------------------------------------");

        String s1 = "Cydeo School";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("------------------------------------------------");

        String word = "Java";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("------------------------------------------------");

        String s2 = "aaaaaaaaaaaaabbbbbbbbbbbcccdddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);
    }
}
