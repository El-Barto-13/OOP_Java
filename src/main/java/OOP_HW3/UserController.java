package OOP_HW3;

import java.time.LocalDate;
import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    public Student createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        Student student = dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
        return student;
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}
