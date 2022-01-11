package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Tom","Husky",'M',3, "Small","Black");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();


        Cat cat = new Cat();
        cat.setInfo("Fistik","outside cat",'M',3,"Small","orange");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.meow();
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("sher khan", "Bengal",'M',6,"Large","Orange");
        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();
        tiger.sleep();

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);
    }
}
