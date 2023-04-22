package stream.finaloperation;

import java.util.stream.IntStream;

public class SummaryStatisticsTest {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 20)
                .summaryStatistics());

        System.out.println("Addition: " + IntStream.rangeClosed(1, 20)
                .summaryStatistics()
                .getSum());
    }
}
