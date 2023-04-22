package stream.finaloperation;

import model.EmployeeStream;

import java.util.List;
import java.util.stream.IntStream;

public class ReductionOperationTest {
    public static void main(String[] args) {
        int[] numbers = {4,6,10,12,15,66,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};

        List<EmployeeStream> listEmp = EmployeeStream.employeeList();

        System.out.println("The addition is: " + IntStream.of(numbers).sum());
        System.out.println("The average is: " + IntStream.of(numbers).average().getAsDouble());
        System.out.println("The maximun is: " + IntStream.of(numbers).max().getAsInt());
        System.out.println("The minimun is: " + IntStream.of(numbers).min().getAsInt());
        System.out.println("Count of elements: " + IntStream.of(numbers).count());

        System.out.println("Salary addition: " + listEmp.stream()
                .mapToDouble(EmployeeStream::getSalary)
                .sum());
        System.out.println("Get employee with highest salary: " + listEmp.stream()
                .max((emp1, emp2) -> (int)(emp1.getSalary() - emp2.getSalary()))
                .get().getName());



    }
}
