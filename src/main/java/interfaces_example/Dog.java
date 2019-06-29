package interfaces_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public class Dog extends Animal implements Speakable, Moveable {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String getVoice(int voice) {
        if (voice == LOUD) {
            return "HAU HAU HAU!!";
        } else {
            return "hau hau";
        }
    }

    @Override
    public void start() {
        System.out.println("Dog " + getName() + " runs");
    }

    @Override
    public void stop() {
        System.out.println("Dog " + getName() + " stops");
    }
}
