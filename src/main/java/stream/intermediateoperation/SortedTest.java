package stream.intermediateoperation;

import model.EmployeeStream;
import model.EmployeeStreamSorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedTest {
    public static void main(String[] args) {
        System.out.println("Sorted names: ");
        Arrays.asList("Chema", "Sara", "Pablo", "Vega")
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nSorted number: ");
        Arrays.asList(1,2,7,8,9,1,4,5,7,8,9)
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n");
        List<EmployeeStreamSorted> listEmp = EmployeeStreamSorted.employeeListForSorted();

        listEmp.stream()
                .sorted()
                .forEach(emp -> System.out.println(emp.getName()));

        System.out.println("\nEmployee sorted by age:");
        listEmp.stream()
                .sorted(new Comparator<EmployeeStreamSorted>() {
                    @Override
                    public int compare(EmployeeStreamSorted o1, EmployeeStreamSorted o2) {
                        return o1.getAge() - o2.getAge();
                    }
                })
                .forEach(emp -> System.out.println(emp.getName() + " " + emp.getAge()));

        System.out.println("\nEmployee sorted by salary:");
        listEmp.stream()
                .filter(emp -> emp.getAge() > 25)
                .sorted((emp1, emp2) -> (int)(emp1.getSalary() - emp2.getSalary()))
                .forEach(emp -> System.out.println(emp.getName() + " " + emp.getSalary()));

    }
}
