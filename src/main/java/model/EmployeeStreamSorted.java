package model;

import java.util.Arrays;
import java.util.List;

public class EmployeeStreamSorted extends EmployeeStream implements Comparable{
    public EmployeeStreamSorted(long id, String name, double salary, Genre genre, int age) {
        super(id,name,salary,genre,age);
    }

    public static List<EmployeeStreamSorted> employeeListForSorted() {
        return Arrays.asList(
                new EmployeeStreamSorted(1, "Chema",1000.0,Genre.MALE,35),
                new EmployeeStreamSorted(2, "Sara",2000.0,Genre.FEMALE,30),
                new EmployeeStreamSorted(3, "Vega",2500.0,Genre.FEMALE,18),
                new EmployeeStreamSorted(4, "Pablo",2500.0,Genre.MALE,18),
                new EmployeeStreamSorted(5, "Gaspar",1500.0,Genre.MALE,32),
                new EmployeeStreamSorted(7, "Ángeles",2200.0,Genre.FEMALE,50),
                new EmployeeStreamSorted(8, "José",1300.0,Genre.MALE,55),
                new EmployeeStreamSorted(9, "Conchi",1100.0,Genre.FEMALE,50),
                new EmployeeStreamSorted(10, "Carlos",900.0,Genre.MALE,21),
                new EmployeeStreamSorted(11, "Vero",1000.0,Genre.FEMALE,25));

    }

    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((EmployeeStreamSorted)(o)).getName());
    }
}
