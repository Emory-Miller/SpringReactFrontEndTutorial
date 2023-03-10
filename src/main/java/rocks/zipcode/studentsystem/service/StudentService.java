package rocks.zipcode.studentsystem.service;

import rocks.zipcode.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
