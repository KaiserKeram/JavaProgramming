package practice01_12_2022.Statics;

public class StaticBlockObjects {

    public static void main(String[] args) {

        StaticBlock sb = new StaticBlock();

        System.out.println(sb.num);

        StaticBlock sb1 = new StaticBlock(40);
        System.out.println(sb1.num);
    }
}
