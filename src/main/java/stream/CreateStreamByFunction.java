package stream;

import java.util.Random;
import java.util.stream.Stream;

public class CreateStreamByFunction {
    public static void main(String[] args) {
        Stream<Long> firstTen = Stream.iterate(1l, n -> n + 1).limit(10);
        firstTen.forEach(System.out::println);

        System.out.println("\n");

        Stream.iterate(1l, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

        System.out.println("\n");

        Stream.iterate(1l, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\n Random number");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\nRandom integer");
        new Random().ints()
                .limit(5)
                .forEach(System.out::println);
    }
}
