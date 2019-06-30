package abstractclass_example2;

/**
 * @author Wojciech Wasilewski
 * @date Created on 30.06.2019
 */
public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[4];

        people[0] = new Employee("Wojtek W", 20000d, 2019, 02, 22);
        people[1] = new Employee("Anna B", 10000d, 2019, 03, 12);
        people[2] = new Student("Tomasz M", "Informatics");
        people[3] = new Student("Marta K", "Sleeping");

        System.out.println("Persons(employees) before raise: ");

        //loop to show all persons
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }

        System.out.println();
        System.out.println("After 10% raise: ");

        //loop to give employees 10% raise
        for (Person employees : people) {
            if (employees instanceof Employee) {
                ((Employee) employees).raiseSalary(10);
                System.out.println(employees.getName() + ", " + employees.getDescription());
            }
        }
    }
}
