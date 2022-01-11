package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota", "Hylander", "Black", 2021, "$40000");

        Car car2 =new Car();
        car2.setInfo("Nissan", "Murano", "White", 2021, "$45000");

        System.out.println(car1);
        System.out.println(car2);

        car1.drive();
        car2.stop();

        ArrayList<Car> carslist = new ArrayList<>();
        carslist.addAll(Arrays.asList(car1, car2));

        for (Car each : carslist) {
            System.out.println(each.brand + " : " + each.price);

        }

    }
    /*
    Car Class:

    Attributes:
        brand, model, color, year, price

    Actions:
        drive(), start(), stop(), toString(), setInfo()
     */
}
