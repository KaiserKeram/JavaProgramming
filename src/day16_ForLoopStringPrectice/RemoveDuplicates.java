package day16_ForLoopStringPrectice;

public class RemoveDuplicates {

    public static void main(String[] args) {


        String str = "aabbaacc";

        String result = " ";

        for (int i = 0; i < str.length(); i++) { //i: represents the all the index numbers of str (start from 0)
            String ch ="" +  str.charAt(i);

            if(!result.contains(ch)) {

                result += ch;
            }
        }

        System.out.println(result);



    }
}

/*
2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */