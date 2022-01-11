package day16_ForLoopStringPrectice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = "";//12345
        String letters = "";//CydeoSchoolWoodenSpoon
        String specialChars = "";//!@#$%

        for (int i = 0; i < str.length(); i++) { // i: index numbers of string (0-last)

            char ch = str.charAt(i); //ch: every single characters that we have in string

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                if (ch != ' ') {
                    specialChars += ch;
                }

            }

            System.out.println("digits = " + digits);
            System.out.println("letters = " + letters);
            System.out.println("specialChars = " + specialChars);
        }
    }
}