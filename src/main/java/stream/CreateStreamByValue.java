package stream;

import model.StudentStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamByValue {
    public static void main(String[] args) {
        System.out.println("Example 1");
        Stream<String> stream1 = Stream.of("Example how to create stream");
        stream1.forEach(System.out::println);

        System.out.println("\nExample 2");
        Stream<String> stream2 = Stream.of("example1", "example2", "example3", "example4");
        stream2.forEach(System.out::println);

        System.out.println("\nExample 3");
        String[] array = {"chema", "sara", "pablo", "vega"};
        Stream<String> stream3 = Stream.of(array);
        stream3.forEach(System.out::println);

        System.out.println("\nExample 4");
        Stream<StudentStream> stream4 = Stream.<StudentStream>builder()
                .add(new StudentStream("1", 35, 1.80, 8.0))
                .add(new StudentStream("2", 30, 1.60, 9.0))
                .build();
        stream4.forEach(student -> System.out.println(student.getIdentificacion()));

        System.out.println("\nExample 5");
        IntStream oneToTwenty = IntStream.rangeClosed(1, 20);
        oneToTwenty.forEach(System.out::println);
    }
}
