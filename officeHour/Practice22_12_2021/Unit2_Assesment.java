package Practice22_12_2021;

public class Unit2_Assesment{

    public static void main(String[] args) {

        String s= "the game was tied at 2-2";
        String s2= s.substring(5); // s2 = ame was tied at 2-2

        int index1 = s.indexOf("game"); // int index1 = 4
        int index2 = s2.indexOf("game"); // index2 = -1

        if(index1 == index2){
            System.out.println(index1);

        }else{
            System.out.println(index2);
        }
    }
}
