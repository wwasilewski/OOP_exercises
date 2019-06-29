package interfaces_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public class Main {

    public static void main(String[] args) {

        Dog ares = new Dog("Ares");
        ares.start();
        System.out.println(ares.getVoice(Speakable.LOUD));
        ares.stop();
    }
}
