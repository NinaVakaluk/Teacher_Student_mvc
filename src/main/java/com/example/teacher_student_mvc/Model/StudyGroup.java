package com.example.teacher_student_mvc.Model;

import java.util.List;
import java.util.ListIterator;

public class StudyGroup extends User {
    Teacher teacher;
    List<Student> listOfStudent;
    public StudyGroup() {
    }
    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.listOfStudent = students;
    }

    public int getTeacherID(Teacher teacher) {
        return teacher.teacherID;
    }


    public int getStudentID(Student student){
        return student.getStudentID();
    }
    @Override
    public String toString() {
        return "StudyGroup: "
                + teacher +
                "Students:"+ "\n" + listOfStudent;
    }
}

