package abstractclass_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public class AnimalActions {

    public void animalDialog(Animal a1, Animal a2) {
        a1.speak();
        a2.speak();
        System.out.println("----------------------------------");
    }
}
