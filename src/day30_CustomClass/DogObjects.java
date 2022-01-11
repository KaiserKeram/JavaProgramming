package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {
         Dog dog1 = new Dog();

         dog1.name = "Lucy";
         dog1.breed = "Husky";
         dog1.age = 3;
         dog1.gender = 'M';
         dog1.size = "Small";
         dog1.color = "white";

         Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'F';
        dog2.size = "Big";
        dog2.color = "Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "Husky", 4,'F', "Small", "Blue");

        Dog dog4 = new Dog();
        dog4.setInfo("Nick", "Husky", 8,'M', "Large", "Yello");

        Dog dog5 = new Dog();
        dog5.setInfo("Jimmy", "Husky", 4,'F', "Extra Large", "Gold");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);

        dog1.eat();

        dog2.bark();

        System.out.println("---------------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs =new ArrayList<>();











    }
}
