package abstractclass_example2;

import java.util.ArrayList;

/**
 * @author Wojciech Wasilewski
 * @date Created on 30.06.2019
 */
public class Main {

    public static void main(String[] args) {

        //list of all persons
        ArrayList<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Employee("Wojtek W", 20000d, 2019, 02, 22));
        listOfPersons.add(new Employee("Anna B", 10000d, 2019, 03, 12));
        listOfPersons.add(new Student("Tomasz M", "Informatics"));
        listOfPersons.add(new Student("Marta K", "Sleeping"));

        System.out.println("List of persons: ");

        //loop to show all persons
        for (Person p : listOfPersons) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }

        System.out.println("\nList of employees after 10% raise : ");

        //loop to give employees 10% raise
        for (Person employees : listOfPersons) {
            if (employees instanceof Employee) {
                ((Employee) employees).raiseSalary(10);
                System.out.println(employees.getName() + ", " + employees.getDescription());
            }
        }
    }
}
