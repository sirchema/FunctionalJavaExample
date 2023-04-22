package function;

import java.util.function.Function;

public class IFunction {

    public static void main(String[] args) {
        Function<Integer, String> conversor = x -> Integer.toString(x);

        System.out.println(conversor.apply(3).length());
        System.out.println(conversor.apply(300).length());
    }
}
