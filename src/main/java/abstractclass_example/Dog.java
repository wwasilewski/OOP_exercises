package abstractclass_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public String getType() {
        return "Dog";
    }

    public String getVoice() {
        return "Hau-Hau";
    }
}
