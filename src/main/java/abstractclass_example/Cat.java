package abstractclass_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public String getType() {
        return "Cat";
    }

    public String getVoice() {
        return "Miauuu";
    }
}
