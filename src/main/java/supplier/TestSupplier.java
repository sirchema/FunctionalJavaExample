package supplier;

import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello world!";

        System.out.println("Value is: " + supplier.get());
    }
}
