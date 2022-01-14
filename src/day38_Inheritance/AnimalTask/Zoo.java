package day38_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Tom","A","small","Black",3, 'M');
        Dog dog = new Dog("Tonny","Husky","large","White",5,'M');
        Tiger tiger = new Tiger("alse","C","small","Brown",2, 'F');
        Eagle eagle = new Eagle("Jerry","D","large","Black",5,'M');

        cat.eat();
        dog.eat();
        tiger.eat();
        eagle.eat();

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(tiger);
        System.out.println(eagle);
    }
}
