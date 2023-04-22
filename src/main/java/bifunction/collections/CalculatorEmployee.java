package bifunction.collections;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class CalculatorEmployee {
    public List<Double> calc(BiFunction<Double, Double, Double> bi, List<Employee> listEmpl, Double increase){

        return listEmpl.stream().map(employee -> bi.apply(employee.getSalary(),increase)).collect(Collectors.toList());
    }
}
