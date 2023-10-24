package com.example.teacher_student_mvc.Controller;

import com.example.teacher_student_mvc.Model.Student;
import com.example.teacher_student_mvc.Model.StudyGroup;
import com.example.teacher_student_mvc.Model.Teacher;
import com.example.teacher_student_mvc.ServiceGroup.StudyGroupService;
import java.util.List;

public class Controller extends StudyGroupService {

    StudyGroupService studyGroupService;
    StudyGroup studyGroup = new StudyGroup();

    public Controller() {
        super();
        this.studyGroupService = new StudyGroupService();
    }


    public StudyGroup showGroup(Teacher teacher, List<Student> listOfStudents) {
        if (teacher != null && listOfStudents != null) {
            studyGroup = studyGroupService.createStudyGroupService(teacher, listOfStudents);
        } else {
            System.out.println("Группу создать невозможно");
        }
        return studyGroup;
    }
}