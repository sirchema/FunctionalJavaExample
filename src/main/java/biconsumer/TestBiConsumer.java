package biconsumer;

import java.util.function.BiConsumer;

public class TestBiConsumer {
    public static void main(String[] args) {
        BiConsumer<Double, Double> biConsumer = (num1, num2) -> {
          double mult = num1 * num2;
          System.out.println("The result is: " + mult);
        };

        biConsumer.accept(13.4, 10.0);
    }
}
