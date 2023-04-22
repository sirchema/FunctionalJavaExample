package bifunction;

import java.util.function.BiFunction;

public class Calculator {
    public String calc(BiFunction<Integer, Integer, String> bi, Integer ope1, Integer ope2){
        return bi.apply(ope1, ope2);
    }
}
