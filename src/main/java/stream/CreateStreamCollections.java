package stream;

import model.StudentStream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamCollections {
    public static void main(String[] args) {
        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5});
        numStream.forEach(System.out::println);

        System.out.println("\nExample 2");
        Stream<String> names = Arrays.stream(new String[]{"Chema", "Sara", "Vega", "Pablo"});
        names.forEach(System.out::println);

        System.out.println("\nExample 3");
        Set<String> languagesSet = new HashSet<>();
        languagesSet.add("JAVA");
        languagesSet.add("C++");
        languagesSet.add("C#");
        languagesSet.stream().forEach(System.out::println);

        System.out.println("\nExample 4");
        List<StudentStream> students = new ArrayList<>();
        students.add(new StudentStream("Chema", 35, 1.80, 6.0 ));
        students.add(new StudentStream("Sara", 30, 1.60, 8.0 ));
        students.add(new StudentStream("Pablo", 10, 1.50, 8.0 ));
        students.add(new StudentStream("Vega", 10, 1.50, 8.0 ));

        students.parallelStream().forEach( student -> System.out.println(student.getIdentificacion()));
    }
}
