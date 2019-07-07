package interface_with_staticmethod;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
public class Rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle.");
    }
}
