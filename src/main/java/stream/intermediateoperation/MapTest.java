package stream.intermediateoperation;

import model.EmployeeStream;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class MapTest {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5)
                .map(new IntUnaryOperator() {
                    @Override
                    public int applyAsInt(int operand) {
                        return operand * operand;
                    }
                })
                .forEach(System.out::println);

        System.out.println("\n");
        IntStream.rangeClosed(1, 10)
                .map(n -> n * 2)
                .forEach(System.out::println);

        System.out.println("\n");
        List<EmployeeStream> listEmpl = EmployeeStream.employeeList();

        System.out.println("Average salary of female employee older than 25 year");
        double add = listEmpl.stream()
                .filter(EmployeeStream::isFemale)
                .filter(emp -> emp.getAge() > 25)
                .mapToDouble(emp -> emp.getSalary())
                .sum();

        double average = add / listEmpl.stream()
                .filter(EmployeeStream::isFemale)
                .filter(emp -> emp.getAge() > 25)
                .count();

        System.out.println("The average is: " + average);

    }
}
