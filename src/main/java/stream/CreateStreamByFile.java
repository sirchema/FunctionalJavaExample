package stream;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreateStreamByFile {
    public static void main(String[] args) {
        Path path1 = Paths.get("example.txt");

        try(Stream<String> lines = Files.lines(path1)) {
            lines.forEach(line -> {
                System.out.println("Linea...");
                System.out.println(line);
            });
        }catch (IOException e) {
            e.printStackTrace();;
        }

        System.out.println("\n");
        Path dir = Paths.get(".");
        System.out.printf("%nTree project's files is: %s es %n", dir.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(dir)){
            paths.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
