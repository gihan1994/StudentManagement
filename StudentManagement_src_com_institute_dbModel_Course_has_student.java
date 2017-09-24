package com.institute.dbModel;

import java.io.Serializable;
import java.util.Date;

public class Course_has_student implements Serializable {

    private Student student;
    private Courses course;
    private Date StartedDate;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Date getStartedDate() {
        return StartedDate;
    }

    public void setStartedDate(Date startedDate) {
        StartedDate = startedDate;
    }
}
