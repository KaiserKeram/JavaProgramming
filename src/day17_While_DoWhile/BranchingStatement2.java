package day17_While_DoWhile;

public class BranchingStatement2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if(i == 'C'){

                //break;//stop at B
                continue;
            }

            System.out.println(i);



        }

        System.out.println("--------------------------------------");

        for (int i = 1; i <= 10 ; i++) {

            System.out.println(i);

        }
        System.out.println("--------------------------------------");

        for (int i = 1; i <= 10 ; i++) {
            if(i%2 != 0){

                continue;



            }
            System.out.println(i);
        }
    }
}
