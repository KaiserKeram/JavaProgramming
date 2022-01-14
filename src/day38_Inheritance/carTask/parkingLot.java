package day38_Inheritance.carTask;

public class parkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Black", 2016,12000,20000);
        Tesla tesla = new Tesla("Model S","red",2021,2000,45000);
        BMW bmw = new BMW("X5","Black",2019,3000,50000);

        toyota.start();
        tesla.start();
        bmw.start();

    }
}
