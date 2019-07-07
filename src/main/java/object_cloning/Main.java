package object_cloning;

/**
 * @author Wojciech Wasilewski
 * @date Created on 07.07.2019
 */
public class Main {

    public static void main(String[] args) {

        Student studentToClone = new Student("Wojciech W.", 12345);

        try {
            Student clonedStudent = (Student) studentToClone.clone();

            System.out.println("Student to clone: " + studentToClone.getName() + " - rollno: " + studentToClone.getRollno());
            System.out.println("Cloned student: " + clonedStudent.getName() + " - rollno: " + clonedStudent.getRollno());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
