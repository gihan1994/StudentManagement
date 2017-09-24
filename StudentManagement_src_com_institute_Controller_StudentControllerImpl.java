package com.institute.Controller;

import com.institute.Repository.StudentRepository;
import com.institute.Repository.StudentRepositoryImpl;
import com.institute.dbModel.Student;

import java.io.IOException;
import java.util.ArrayList;

public class StudentControllerImpl implements StudentController {

    StudentRepository studentRepository;

    public StudentControllerImpl(StudentRepository repository){
        studentRepository=repository;
    }

    @Override
    public void saveStudent(Student student) throws IOException {
            studentRepository.saveStudent(student);
    }

    @Override
    public Student getStudent(int studentId) throws IOException, ClassNotFoundException {

        return studentRepository.getStudent(studentId);
    }

    @Override
    public ArrayList<Student> getAllStudents() throws IOException, ClassNotFoundException {

        return studentRepository.getAllStudents();
    }
}
