package stream.finaloperation;

import model.EmployeeStream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectTest {

    public static void main(String[] args) {
        List<String> names = EmployeeStream.employeeList()
                .stream()
                .map(EmployeeStream::getName)
                .collect(ArrayList::new, ArrayList::add,ArrayList::addAll);

        names.stream().forEach(System.out::println);

        names = EmployeeStream.employeeList()
                .stream()
                .map(EmployeeStream::getName)
                .collect(Collectors.toList());

        System.out.println("\nExample 2");
        names.stream().forEach(System.out::println);

        System.out.println("\nExample 3 with Set");
        Set<String> namesSet = EmployeeStream.employeeList()
                .stream()
                .map(EmployeeStream::getName)
                .collect(Collectors.toSet());

        namesSet.stream().forEach(System.out::println);

        System.out.println("\nExample 4 with toCollection");
        SortedSet<String> namesCollect = EmployeeStream.employeeList()
                .stream()
                .map(EmployeeStream::getName)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(namesCollect);

    }


}
