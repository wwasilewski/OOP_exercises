package abstractclass_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public abstract class Animal {

    private String name = "no_name";

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    //abstract method because i will not be able to instantiate abstract Animal class
    public abstract String getType();

    public abstract String getVoice();

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println(getType() + " " + getName() + " says " + getVoice());
    }
}
