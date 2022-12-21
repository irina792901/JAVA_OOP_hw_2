package comtroller;

import data.Student;
import data.StudentGroup;
import service.DataService;
import service.DataServiceGroup;
import service.StudentServiceImpl;

public class Controller {
//    private DataService studentService;
//
//    public Controller(StudentServiceImpl studentService) {
//        this.studentService = studentService;
//
//
//    public Student createStudent(Student student){
//        studentService.create(student);
//        return (Student) studentService.read(student);
//    }
    private DataServiceGroup studentGroupSService;

    public Controller(DataServiceGroup studentGroupSService) {
        this.studentGroupSService = studentGroupSService;
    }

    public StudentGroup createGroup(int groupNumber){
        return studentGroupSService.getGroup(groupNumber);
    }
}
