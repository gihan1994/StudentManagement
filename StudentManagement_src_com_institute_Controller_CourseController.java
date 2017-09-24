package com.institute.Controller;

import com.institute.dbModel.Courses;

import java.util.ArrayList;

interface CourseController {
    void saveCourse(Courses courses);
    Courses getCourse(int courseId);
    ArrayList<Courses> getAllCourses();

}
