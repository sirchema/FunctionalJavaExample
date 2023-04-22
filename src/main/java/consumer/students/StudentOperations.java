package consumer.students;

import model.Student;

import java.util.List;
import java.util.function.Consumer;

public class StudentOperations {

    public void acceptAll(List<Student> studentList, Consumer<Student> cons){
        studentList.forEach(cons);
    }
}
