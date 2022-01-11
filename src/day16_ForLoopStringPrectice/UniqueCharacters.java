package day16_ForLoopStringPrectice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccc";

        String result = "";

        for (int i = 0; i < str.length(); i++) { //i: index numbers of string (start from 0)
            char ch = str.charAt(i); //ch: each characters of string

            //System.out.println(ch); //can check what is upper code meaning is

            if(str.indexOf(ch) == str.lastIndexOf(ch)) { //if the first and last index numbers of the character are same, then is must be the unique character
                result += ch;
        }

        }

        System.out.println(result);
    }


}
