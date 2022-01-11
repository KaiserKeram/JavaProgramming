package day04_01_08_2022;

public class FindIndexOfGivenWordInSentence {

    public static void main(String[] args) {

        String sentence = "Java is my job because I am SDET";
        String word = "SDET";
        int index = findIndexOfGivenWord(sentence,word);
        System.out.println(index);
    }
    private static int findIndexOfGivenWord(String sentence, String word){
        String[] words = sentence.split("");
        int counter = 0;

        for(String each:words){
            counter++;
            if(each.equals(word)){
                break;
            }
        }
        return counter;
    }
}
