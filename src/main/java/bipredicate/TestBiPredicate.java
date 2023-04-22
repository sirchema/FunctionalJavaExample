package bipredicate;

import java.util.function.BiPredicate;

public class TestBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x < y;

        System.out.println(biPredicate.test(2, 3));
    }
}
