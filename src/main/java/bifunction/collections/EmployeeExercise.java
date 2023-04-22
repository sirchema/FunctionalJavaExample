package bifunction.collections;

import java.util.Arrays;
import java.util.List;

public class EmployeeExercise {

    public static void main(String[] args) {
        List<Employee> listEmpl = Arrays.asList(
                new Employee("Chema", 1000d),
                new Employee("Sara", 2000d),
                new Employee("Vega", 3000d),
                new Employee("Pablo", 2500d));

        CalculatorEmployee cal = new CalculatorEmployee();

        List<Double> wages = cal.calc((salary, increase) -> salary + (salary * (increase / 100)), listEmpl, 10.0);

        wages.forEach(System.out::println);
    }
}
