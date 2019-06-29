package abstractclass_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public class Animal {

    private String name = "no_name";

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    String getType() {
        return "Some animal";
    }

    String getName() {
        return name;
    }

    String getVoice() {
        return "???";
    }

    void speak() {
        System.out.println(getType() + " " + getName() + " says " + getVoice());
    }
}
