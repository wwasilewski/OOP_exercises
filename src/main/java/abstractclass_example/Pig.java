package abstractclass_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public class Pig extends Animal {

    public Pig() {
    }

    public Pig(String name) {
        super(name);
    }

    public String getType() {
        return "Pig";
    }

    public String getVoice() {
        return "Hrum hrum";
    }
}
