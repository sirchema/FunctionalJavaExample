package stream.finaloperation;

import model.EmployeeStream;
import model.Genre;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMapTest {
    public static void main(String[] args) {
        Map<Long, String> idToNameMap = EmployeeStream.employeeList()
                .stream()
                .collect(Collectors.toMap(EmployeeStream::getId,EmployeeStream::getName));

        System.out.println(idToNameMap);

        System.out.println("\n");

        Map<Genre, String> genreToName = EmployeeStream.employeeList()
                .stream()
                .collect(Collectors.toMap(EmployeeStream::getGenre, EmployeeStream::getName,
                        (nam1, nam2) -> String.join(", ", nam1, nam2)));

        System.out.println(genreToName);
    }
}
