package stream.finaloperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceTest {
    public static void main(String[] args) {
        int[] numbers = {4,6,10,12,15,66,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};

        int addition = IntStream.of(numbers)
                .reduce(0, new IntBinaryOperator() {
                    @Override
                    public int applyAsInt(int left, int right) {
                        return left + right;
                    }
                });

        System.out.println("Addition is: " + addition);
        System.out.println("\nAddition is: " + IntStream.of(numbers)
                .reduce(0, (num1, num2) -> num1 + num2));
        System.out.println("\nAddition is: " + IntStream.of(numbers)
                .reduce(0, (num1, num2) -> Integer.sum(num1, num2)));
        System.out.println("\nAddition is: " + IntStream.of(numbers)
                .reduce(0, Integer::sum));

        Path path1 = Paths.get("Example.txt");
        String text = "";
        try(Stream<String> lines = Files.lines(path1)) {
            text = lines.map(line -> line.replace(",",""))
                    .reduce("", (line1, line2) -> line1.concat("\n").concat(line2));

        }catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("example2.txt"))) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
