package day14_String;

public class StringMethod3 {

    public static void main(String[] args) {

        //substring(beginning index, ending index)

        String word = "Cydeo School";

        //String brand

        String brand = word.substring(0, 4+1);

        System.out.println(brand);

        System.out.println("----------------------");

        String brand2 = word.substring(6);
        System.out.println(brand2);

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" "));
        System.out.println(s1);

        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        System.out.println(s2);

        String s3 = word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println(s3);

    }
}
