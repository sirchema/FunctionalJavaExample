package predicate.assessemployee;

import model.Employee;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Examiner {
    public List<Employee> evaluate(List<Employee> listEmp, Predicate<Employee> eval){
        return listEmp.stream().filter(eval).collect(Collectors.toList());
    }

    public List<Employee> evaluateOpposite(List<Employee> listEmp, Predicate<Employee> eval) {
        return listEmp.stream().filter(eval.negate()).collect(Collectors.toList());
    }
}
