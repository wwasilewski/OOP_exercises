package abstractclass_example2;

import java.time.LocalDate;

/**
 * @author Wojciech Wasilewski
 * @date Created on 30.06.2019
 */
public class Employee extends Person {

    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("Employee earnings %.2f PLN", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary = salary + raise;
    }
}
