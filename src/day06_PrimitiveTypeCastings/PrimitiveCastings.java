package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        // short b = (short)a;


        int c = b; // implicit casing
        // int c = (int)b;

        long d = c;
        //      (long)c;

        float e =d;
        double f = e;

        System.out.println("------------------------------------------------");

        System.out.println(a + b + c + d + e);

        int x = 55;
        short y = (short)x;

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println( j + " : " + k);


        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;

        System.out.println(n + " : " + s);

        System.out.println("------------------------------------------------");

        double g = 20.5;
        short h = (short) g;

        System.out.println( g + " : " + h);

        float a1 = 30.5f;
        long b1 = (long) a1;

        System.out.println( a1 + " : " + b1);




    }
}
