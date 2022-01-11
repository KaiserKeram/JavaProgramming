package day37_Inheritance.PhoneTask;

public class Iphone extends phone{
    public Iphone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }


}
/*
1.2 Create a sub class of Phone named IPhone:
                Variables:
                    brand, model, size, price, color

                Methods:

                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */