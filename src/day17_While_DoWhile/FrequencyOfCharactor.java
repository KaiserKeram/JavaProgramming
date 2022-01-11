package day17_While_DoWhile;

public class FrequencyOfCharactor {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { //i: indexes of str
            char eachChar = str.charAt(i); //eachChar: each character of str

            if(ch == eachChar){
                frequency++;

            }


        }
        System.out.println(frequency);




        }
    }

