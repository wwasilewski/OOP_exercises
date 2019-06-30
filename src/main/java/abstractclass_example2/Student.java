package abstractclass_example2;

/**
 * @author Wojciech Wasilewski
 * @date Created on 30.06.2019
 */
public class Student extends Person {

    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getDescription() {
        return "Student with major: " + major;
    }
}
