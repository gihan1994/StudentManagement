package com.institute.Repository;



import com.institute.dbModel.Lecture;

import java.util.ArrayList;

public interface LectureRepository {
    void saveLecture(Lecture course);
    Lecture getLecture(int courseId);
    ArrayList<Lecture> getAllLectures();
}
