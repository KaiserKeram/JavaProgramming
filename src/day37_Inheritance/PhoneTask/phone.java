package day37_Inheritance.PhoneTask;

public class phone {
    public String brand, model, size, color;
    public double price;

    public static boolean hasBattery; // or hasBattery = true; (in this case we don't need static blog)

    public phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    static{
        hasBattery = true;
    }

    public void call(Long phoneNumber){
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }
    public void text(Long phoneNumber){
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", hasBattery= " + hasBattery +
                '}';
    }
}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					constructor()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */