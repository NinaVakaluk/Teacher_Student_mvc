package com.example.teacher_student_mvc;

import com.example.teacher_student_mvc.Controller.Controller;
import com.example.teacher_student_mvc.Model.Student;
import com.example.teacher_student_mvc.Model.Teacher;
import com.example.teacher_student_mvc.View.ModelView;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(" Olga ", " Petrova ", 38, " History ", 13);

        Student student1 = new Student("Anna", "Ivanova", 20, 10);
        Student student2 = new Student("Egor", "Sokolov", 19, 11);
        Student student3 = new Student("Irina", "Orlova", 21, 21);
        Student student4 = new Student("Petr", "Sidorov", 22, 13);


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);


        Controller controller = new Controller();

        ModelView modelView = new ModelView();
        modelView.getTeacherID(controller,teacher1);
        modelView.getStudentID(controller,student1);

        modelView.getAllGroup(studentList,teacher1,controller);
    }

}