package stream;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CreateStreamByString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        IntStream streamChars = input.chars();
        //streamChars.forEach(System.out::println);

        System.out.println("\nExample 1");
        streamChars.filter(n -> !Character.isDigit((char)n) && !Character.isWhitespace((char)n))
                .forEach(n -> System.out.println((char)n));

        System.out.println("\nExample 2");
        String str = "HTML, CSS, JAVASCRIPT, JAVA, C++, C#, RUBY";
        Pattern.compile(", ")
                .splitAsStream(str)
                .forEach(System.out::println);
    }
}
