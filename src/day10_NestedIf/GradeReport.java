package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        /*
        90-100; Excellent
        80-89; Great
        70-79;good
        60-69; passed
        0-59;failed
         */

        int score = 95;

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Graet");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else if (score >= 0) {
                System.out.println("Failed");
            } else {
                System.out.println("invalid score");
            }
        }
    }
}
