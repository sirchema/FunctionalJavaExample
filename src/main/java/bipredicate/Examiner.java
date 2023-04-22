package bipredicate;

import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Examiner {
    public List<Employee> evaluate(List<Employee> listEmp, BiPredicate<Integer, String> eval){
        return listEmp.stream()
                .filter(employee -> eval.test(employee.getAge(), employee.getDepartment()))
                .collect(Collectors.toList());
    }
}
