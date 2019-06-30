package abstractclass_example2;

/**
 * @author Wojciech Wasilewski
 * @date Created on 30.06.2019
 */
public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();
}
