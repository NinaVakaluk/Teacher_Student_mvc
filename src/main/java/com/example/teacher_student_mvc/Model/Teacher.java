package com.example.teacher_student_mvc.Model;

public class Teacher extends User {
    protected String subject;
    protected int teacherID;

    public Teacher(String name, String surname, int age, String subject, int teacherID) {
        super(name, surname, age);
        this.subject = subject;
        this.teacherID = teacherID;
    }

    public int getTID() {
        return teacherID;
    }
    @Override
    public String toString() {
        return "Teacher Name:" + name +
                ",Surname:" + surname + ",Teacher Id:" + teacherID + "\n";
    }
}
