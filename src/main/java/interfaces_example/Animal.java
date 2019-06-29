package interfaces_example;

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

    public abstract String getType();

    public String getName() {
        return name;
    }
}
