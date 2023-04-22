package predicate;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (value) -> value > 0;

        System.out.println(predicate.test(123));
    }
}
