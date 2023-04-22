package consumer.students;

import model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercise {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Chema", 6),
                new Student("Sara", 8),
                new Student("Vega", 9),
                new Student("Pablo", 7),
                new Student("Gaspar", 4)
        );

        StudentOperations op = new StudentOperations();

        Consumer<Student> consPrint =
                student -> System.out.println("Nombre: " + student.getName() + " score: " + student.getScore());

        op.acceptAll(studentList, consPrint);

        Consumer<Student> consIncreaseScore = student -> student.setScore(student.getScore() * 1.15);

        System.out.println("Updates students scores");
        Consumer<Student> consIncreaseAndPrint = consIncreaseScore.andThen(consPrint);
        op.acceptAll(studentList, consIncreaseAndPrint);





    }
}
