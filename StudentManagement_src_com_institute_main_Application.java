package com.institute.main;

import com.institute.Controller.StudentController;
import com.institute.Controller.StudentControllerImpl;
import com.institute.Repository.StudentRepositoryImpl;
import com.institute.dbModel.Student;

import java.io.IOException;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        StudentController studentController=new StudentControllerImpl(new StudentRepositoryImpl());
        //save student ==========================================================
//

//
//        Student student=new Student();
//        student.setStudentId(002);
//        student.setStudentName("Tharindu");
//        student.setTire(4);
//
//        try {
//            studentController.saveStudent(student);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // get specific student =================================================

//
//        try {
//            Student student = studentController.getStudent(1);
//            System.out.println(student.getStudentName());
//            System.out.println(student.getTire());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }



        // get all Students  ====================================================


        try {
            ArrayList<Student> allStudents = studentController.getAllStudents();
            for (Student student:allStudents) {
                System.out.println("StudentId : "+ student.getStudentId());
                System.out.println("StudentName : "+ student.getStudentName());
                System.out.println("StudentTire :"+student.getTire());
                System.out.println("===========================================");

            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
