package com.institute.Repository;

import com.institute.dbModel.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface StudentRepository {

    void saveStudent(Student student) throws IOException;
    Student getStudent(int studentId) throws FileNotFoundException, IOException, ClassNotFoundException;
    ArrayList<Student> getAllStudents() throws IOException, ClassNotFoundException;

}
