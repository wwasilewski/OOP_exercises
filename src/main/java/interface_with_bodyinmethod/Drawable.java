package interface_with_bodyinmethod;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
public interface Drawable {

    void draw();

    //since Java8 method in interface can have body (you have to use "default" before method
    default void printMethodBodyFromInterface() {
        System.out.println("Method with body in interface using default (since Java8).");
    }
}
