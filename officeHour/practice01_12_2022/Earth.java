package practice01_12_2022;

public class Earth {

    public static void main(String[] args) {

        AnimalSpecies dogs = new AnimalSpecies();
        dogs.growthRate = 10;
        dogs.name = "Ali";
        dogs.population = 50;

        dogs.setInfo("Ali",50,10);

        System.out.println(dogs.getGrowthRate());
        System.out.println(dogs.getName());
        System.out.println(dogs.getPopulation());
    }
}
