package day32_Constructors;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Toyota", "CRV-4");
        Car car3 = new Car("Toyota", "CRV-4",2016);
        Car car4 = new Car("Toyota", "CRV-4", 2016, 25000);
        Car car5 = new Car("Toyota", "Yellow","CRV-4",2016, 25000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
