package OOP_HW3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HW3 {
    public static void main(String[] args) {

        UserController userController = new UserController();

        Student student1 = userController.createStudent("Иван", "Иванов", "Иванович", LocalDate.now());
        Student student2 = userController.createStudent("Иван2", "Иванов2", "Иванович2", LocalDate.now());

        List<Student> students = new ArrayList<>(List.of(new Student[]{student1, student2}));


        userController.createStudentGroup(new Teacher("Петр", "Петров", "Петрович", LocalDate.now()), students);

    }
}
