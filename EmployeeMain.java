import java.util.*;
import java.util.function.Function;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Murad", "Huseynov", 1200),
                new Employee("Ali", "Aliyev", 900),
                new Employee("Leyla", "Mammadova", 1500));

        Function<Employee, String> formatCard = e -> "Name: [" + e.getLastName() + ", " + e.getName()
                + "] - Salary: $" + e.getSalary();

        Function<Employee, Double> salaryPicker = Employee::getSalary;

        for (Employee e : employees) {
            System.out.println(formatCard.apply(e));
            System.out.println("Salary only: $" + salaryPicker.apply(e));
        }
    }
}