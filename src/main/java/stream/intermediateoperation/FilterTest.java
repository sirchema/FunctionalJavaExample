package stream.intermediateoperation;

import model.EmployeeStream;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class FilterTest {
    public static void main(String[] args) {
        List<EmployeeStream> employeeList = EmployeeStream.employeeList();

        System.out.println("Employee male: ");
        employeeList
                .stream()
                .filter(new Predicate<EmployeeStream>() {
                    @Override
                    public boolean test(EmployeeStream empl) {
                        return empl.isMale();
                    }
                })
                .forEach(emp -> System.out.println(emp.getName()));

        System.out.println("\nEmployee female: ");
        employeeList
                .stream()
                .filter(EmployeeStream::isFemale)
                .forEach(emp -> System.out.println(emp.getName()));

        System.out.println("\nEmployees older than 25 years: ");
        employeeList
                .stream()
                .filter(emp -> emp.getAge() > 25)
                .forEach(emp -> System.out.println(emp.getName() + " " + emp.getAge()));

        System.out.println("\nEmployees male and name start with letter c: ");
        employeeList
                .stream()
                .filter(EmployeeStream::isMale)
                .filter(emp -> emp.getName().toUpperCase(Locale.ROOT).startsWith("C"))
                .forEach(emp -> System.out.println(emp.getName()));

        System.out.println("\nEmployee female with salary higher 2000");
        employeeList
                .stream()
                .filter(emp -> emp.isFemale() && emp.getSalary() > 2000)
                .forEach(emp -> System.out.println(emp.getName() + " " + emp.getSalary()));

        System.out.println("\nEmployee female older than 25 and salary higher than 2000");
        Predicate<EmployeeStream> empFemale = emp -> emp.isFemale();
        Predicate<EmployeeStream> empOlder25 = emp -> emp.getAge() > 25;
        Predicate<EmployeeStream> empHigher2k = emp -> emp.getSalary() > 2000;
        Predicate<EmployeeStream> female252k = empFemale.and(empOlder25).and(empHigher2k);

        employeeList
                .stream()
                .filter(female252k)
                .forEach(emp -> System.out.println(emp.getName() + " " + emp.getGenre() + " " + emp.getSalary()));
        System.out.println("Totally: " + employeeList.stream().filter(female252k).count());
    }
}
