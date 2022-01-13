package Constructor;

public class BaklavaObjects {

    public static void main(String[] args) {

        BaklavaRecipe Baklava1 = new BaklavaRecipe("pistachio");
        Baklava1.price = 50;
        Baklava1.amountLB = 3;
        System.out.println(Baklava1);

        BaklavaRecipe br2 = new BaklavaRecipe("walnut",2,60);
        System.out.println(br2);

        Baklava1.feedback();
        br2.order();
    }
}
