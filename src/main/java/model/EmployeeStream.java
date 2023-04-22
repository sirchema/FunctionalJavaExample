package model;

import java.util.Arrays;
import java.util.List;

public class EmployeeStream {
    private long id;
    private String name;
    private double salary;
    private Genre genre;
    private int age;

    public EmployeeStream(long id, String name, double salary, Genre genre, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.genre = genre;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return this.genre == Genre.MALE;
    }

    public boolean isFemale() {
        return this.genre == Genre.FEMALE;
    }

    public static List<EmployeeStream> employeeList() {
        return Arrays.asList(
                new EmployeeStream(1, "Chema",1000.0,Genre.MALE,35),
                new EmployeeStream(2, "Sara",2000.0,Genre.FEMALE,30),
                new EmployeeStream(3, "Vega",2500.0,Genre.FEMALE,18),
                new EmployeeStream(4, "Pablo",2500.0,Genre.MALE,18),
                new EmployeeStream(5, "Gaspar",1500.0,Genre.MALE,32),
                new EmployeeStream(7, "Ángeles",2200.0,Genre.FEMALE,50),
                new EmployeeStream(8, "José",1300.0,Genre.MALE,55),
                new EmployeeStream(9, "Conchi",1100.0,Genre.FEMALE,50),
                new EmployeeStream(10, "Carlos",900.0,Genre.MALE,21),
                new EmployeeStream(11, "Vero",1000.0,Genre.FEMALE,25),
                new EmployeeStream(12, "Chema",1500.0,Genre.MALE,29));
    }
}
