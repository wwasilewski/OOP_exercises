package interface_with_bodyinmethod;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
public class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("I am a circle.");
    }
}
