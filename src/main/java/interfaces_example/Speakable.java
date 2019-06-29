package interfaces_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 29.06.2019
 */
public interface Speakable {

    int LOUD = 1; //default: every field is public static final in interface
    int QUIET = 0;

    String getVoice(int voice); //default: every method is public abstract in interface
}
