package predicate.assessemployee;

import model.Employee;

import java.util.function.BiFunction;

public class Functions {
    public double increaseSalary(Employee employee, double increase, BiFunction<Double, Double, Double> bi) {
        return bi.apply(employee.getSalary(), increase);
    }
}
