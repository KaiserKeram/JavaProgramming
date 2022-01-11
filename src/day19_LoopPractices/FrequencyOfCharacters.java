package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        
        String str = "aabcccd";
        String result ="";
                
        char ch = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(ch ==each){
                count++;
            }

        }
    }
    
}
/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */