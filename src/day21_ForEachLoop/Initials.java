package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] classMates = {"a", "b", "c", "d", "e", "f" };

        for(String each : classMates){

            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);

            System.out.println(initial);
        }
    }
}
