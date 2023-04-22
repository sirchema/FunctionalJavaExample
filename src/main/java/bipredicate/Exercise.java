package bipredicate;

import model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Exercise {
    public static void main(String[] args) {
        List<Employee> listEmpl = Arrays.asList(
                new Employee("Chema", 35, 1000, "Development"),
                new Employee("Sara", 30, 2000, "Marketing"),
                new Employee("Vega", 20, 3000, "Sales"),
                new Employee("Pablo", 20, 3000, "Sales"));


        Examiner examiner = new Examiner();

        BiPredicate<Integer, String> firstCriteria =
                (age, department) -> (age > 20) && (department.equals("Marketing"));

        BiPredicate<Integer, String> secondCriteria = (age, department) -> (age < 30) && (department.equals("Sales"));

        BiPredicate<Integer, String> criteria = firstCriteria.or(secondCriteria);

        System.out.println("Employees older than 20 and marketing department " +
                "or employees younger than 30 and sales department");
        examiner.evaluate(listEmpl, criteria)
                .forEach(employee -> System.out.println("Employees who meet the criteria are: " + employee.getName()));
    }
}
