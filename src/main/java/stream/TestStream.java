package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Stream<Integer> numStream = numbers.stream();

        int suma = numStream
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("The sum of the odd numbers is: " + suma);
    }
}
