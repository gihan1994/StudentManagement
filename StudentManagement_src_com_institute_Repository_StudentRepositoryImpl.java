package com.institute.Repository;

import com.institute.dbModel.Student;

import java.io.*;
import java.util.ArrayList;

public class StudentRepositoryImpl implements StudentRepository {
    private static final String dataSavePath ="/Users/gihanmunasinghe/Desktop/InstituteData/Students/";

    @Override
    public void saveStudent(Student student) throws IOException {

        FileOutputStream fout=new FileOutputStream(dataSavePath+student.getStudentId()+".obj");
        ObjectOutputStream out=new ObjectOutputStream(fout);

        out.writeObject(student);
        out.flush();
        System.out.println("success");

    }

    @Override
    public Student getStudent(int studentId) throws IOException, ClassNotFoundException {



        ObjectInputStream in=new ObjectInputStream(new FileInputStream(dataSavePath+studentId+".obj"));
        Student student=(Student)in.readObject();
        in.close();

        return student;
    }

    @Override
    public ArrayList<Student> getAllStudents() throws IOException, ClassNotFoundException{

        ArrayList<Student> students=new ArrayList<>();

        File directory = new File(dataSavePath);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            ObjectInputStream in=new ObjectInputStream((new FileInputStream(file)));
            Student student=(Student)in.readObject();
            students.add(student);
            in.close();
        }


        return students;
    }
}
