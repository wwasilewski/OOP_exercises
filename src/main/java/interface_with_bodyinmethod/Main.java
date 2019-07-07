package interface_with_bodyinmethod;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
public class Main {
    public static void main(String[] args) {

        Drawable drawable = new Circle();
        drawable.draw();
        drawable.printMethodBodyFromInterface();
    }
}
