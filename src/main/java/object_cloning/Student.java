package object_cloning;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
public class Student implements Cloneable {

    private String name;
    private int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
