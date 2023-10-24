package com.example.teacher_student_mvc.ServiceGroup;

import com.example.teacher_student_mvc.Model.Student;
import com.example.teacher_student_mvc.Model.StudyGroup;
import com.example.teacher_student_mvc.Model.Teacher;
import java.util.List;

public class StudyGroupService extends StudyGroup {
    private StudyGroup studyGroup;
    List<Student> students;
    public StudyGroupService() {
    }
    public int getTeacherId(Teacher teacher) {
        return teacher.getTID();
    }

    public StudyGroup createStudyGroupService(Teacher teacher, List<Student> students) {
        studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }
}








