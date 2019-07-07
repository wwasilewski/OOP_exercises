package interface_with_staticmethod;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
public class Main {

    public static void main(String[] args) {

        Drawable drawable = new Rectangle();
        drawable.draw();
        System.out.println("3 cubed: " + Drawable.countNumberCubed(3));
    }
}
