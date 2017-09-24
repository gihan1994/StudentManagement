package com.institute.Controller;



import com.institute.dbModel.Lecture;

import java.util.ArrayList;

public interface LectureController {
    void saveLecture(Lecture courses);
    Lecture getLecture(int courseId);
    ArrayList<Lecture> getAllLectures();
}
