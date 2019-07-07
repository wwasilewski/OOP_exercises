package interface_with_staticmethod;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
public interface Drawable {

    void draw();

    //number cubed
    static int countNumberCubed(int number) {
        return number * number * number;
    }
}
