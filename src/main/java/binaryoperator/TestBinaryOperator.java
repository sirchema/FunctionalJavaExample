package binaryoperator;

import java.util.function.BinaryOperator;

public class TestBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> bOperator = (num1, num2) -> num1 * num2;

        System.out.println("Result is: " + bOperator.apply(3, 4));

        BinaryOperator<Integer> bOperatorMin = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));

        System.out.println("Min number is: " + bOperatorMin.apply(10, 20));

        BinaryOperator<Integer> bOperatorMax = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));

        System.out.println("Max number is: " + bOperatorMax.apply(10, 20));
    }
}
