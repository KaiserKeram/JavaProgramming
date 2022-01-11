package day16_ForLoopStringPrectice;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Dad";

        String reversed = " ";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);
    }


}
/*
"Java" ==>"avaJ"  ==>false (not palindrome)

"Anna" ==>"annA" ==>true

"Level"
"Dad"
"Mom"
........
 */