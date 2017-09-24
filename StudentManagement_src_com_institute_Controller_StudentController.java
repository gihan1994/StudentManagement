package com.institute.Controller;

import com.institute.dbModel.Student;

import java.io.IOException;
import java.util.ArrayList;

public interface StudentController {

    void saveStudent(Student student) throws IOException;
    Student getStudent(int studentId) throws IOException, ClassNotFoundException;
    ArrayList<Student> getAllStudents() throws IOException, ClassNotFoundException;

}
