package Practice_12_15_2021;

public class CompareLoops {

    public static void main(String[] args) {


        int num = 10;

        for(int i = num; i < 5; i++ ){
            System.out.println("Hello Batch-25 For Loop");
        }

        System.out.println("================================================");

        if (num < 5) {
            System.out.println("Hello Batch-25 For Loop");
        }

        while(num<5){
            System.out.println("Hello Batch-25 For Loop");
        }

        System.out.println("================================================");

        do{
            System.out.println("Hello Batch-25 For Loop");
        }while(num<5);
    }
}
