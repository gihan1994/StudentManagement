package com.institute.Repository;

import com.institute.dbModel.Courses;


import java.util.ArrayList;

public interface CourseRepository {
    void saveCourse(Courses course);
    Courses getCourse(int courseId);
    ArrayList<Courses> getAllCourses();

}
