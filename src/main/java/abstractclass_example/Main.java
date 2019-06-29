package abstractclass_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("no_name2");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Cat_2");
        Cat cat3 = new Cat("Cat_3");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Dog_2");
        Dog dog3 = new Dog("Dog_3");
        Pig pig1 = new Pig();
        Pig pig2 = new Pig("Pig_2");
        Pig pig3 = new Pig("Pig_2");

        Animal dogAnimal = new Dog("Dog_animal");
        Animal catAnimal = new Cat("Cat_animal");

        AnimalActions animalActions = new AnimalActions();

        animalActions.animalDialog(animal1, animal2);
        animalActions.animalDialog(cat1, cat2);
        animalActions.animalDialog(cat3, dog1);
        animalActions.animalDialog(dog2, dog3);
        animalActions.animalDialog(pig1, pig2);
        animalActions.animalDialog(pig3, cat1);
        animalActions.animalDialog(dogAnimal, catAnimal);
    }
}
