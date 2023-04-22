package unaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90,100);

        List<Integer> resultList = unaryOperator(num -> num * num, list);

        resultList.forEach(x -> System.out.println(x));
    }

    public static  List<Integer> unaryOperator(UnaryOperator<Integer> unaryOperator, List<Integer> list){
        List<Integer> updateList = new ArrayList<>();

        list.forEach(num -> updateList.add(unaryOperator.apply(num)));

        return updateList;
    }
}
