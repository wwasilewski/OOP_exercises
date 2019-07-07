package interface_with_staticmethod;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
public class Rectangle implements Drawable, Movable, Printable {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle.");
    }

    @Override
    public void move() {
        System.out.println("Moving fast.");
    }

    @Override
    public void print() {
        System.out.println("Printing money.");
    }
}
