package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] classMates = {"abn smd", "bas ada", "asd cda", "asa sdd", "eas das", "fad dds" };

        for(String each : classMates){
            String reversed = "";

            for (int i = each.length()-1; i >= 0 ; i++) {

                reversed += each.charAt(i);


            }
            System.out.println(reversed);
        }
    }
}
