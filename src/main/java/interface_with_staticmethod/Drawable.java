package interface_with_staticmethod;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
//interface can extend many interfaces
public interface Drawable extends Movable, Printable {

    void draw();

    //number cubed
    static int countNumberCubed(int number) {
        return number * number * number;
    }
}
