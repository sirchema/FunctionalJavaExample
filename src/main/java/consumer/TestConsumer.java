package consumer;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> cons = x -> System.out.println(x);

        cons.accept("Hello world!");
    }
}
