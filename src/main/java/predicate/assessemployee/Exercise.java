package predicate.assessemployee;

import model.Employee;

import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<Employee> listEmpl = Arrays.asList(
                new Employee("Chema", 35, 1000, "Development"),
                new Employee("Sara", 30, 2000, "Marketing"),
                new Employee("Vega", 20, 3000, "Sales"),
                new Employee("Pablo", 20, 3000, "Sales"));

        Examiner examiner = new Examiner();

        System.out.println("Employee with salary > 2000");
        examiner.evaluate(listEmpl, employee -> employee.getSalary() > 2000)
                .forEach(employee -> System.out.println(employee.getName()));

        System.out.println("\n");
        System.out.println("Employee with name started with S:");
        examiner.evaluate(listEmpl, employee -> employee.getName().startsWith("S"))
                .forEach(employee -> System.out.println(employee.getName()));

        System.out.println("\n");
        System.out.println("Old employee are: ");
        examiner.evaluate(listEmpl, employee -> employee.getAge() > 30)
                .forEach(employee -> System.out.println(employee.getName()));

        System.out.println("\n");
        Functions func = new Functions();

        //List<Employee> youngEmpl = examiner.evaluate(listEmpl, employee -> employee.getAge() < 30);

        examiner.evaluate(listEmpl, employee -> employee.getAge() < 30)
                .forEach(employee -> employee.setSalary(func.increaseSalary(employee,3.0,
                (salary, increase) -> salary + (salary * (increase / 100)))));

        listEmpl.stream().filter(employee -> employee.getAge() < 30).forEach(employee ->
                System.out.println("Name: " + employee.getName() + " , new salary of: " + employee.getSalary()));


        System.out.println("\n");
        System.out.println("Youngest employee are: ");
        examiner.evaluateOpposite(listEmpl, employee -> employee.getAge() > 30)
                .forEach(employee -> System.out.println(employee.getName()));
    }
}
