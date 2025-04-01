package org.example;

import university.*;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Enrollment enrollment = new Enrollment();
        Student student = new Student();

        course.courseName = "Steinfield University";
        course.courseId =  3;

        student.name = "Jenny";
        student.studentId = 4;

        enrollment.student = student;
        enrollment.course = course;

        System.out.println("The course name is : " + course.courseName);
        System.out.println("The course name ID is : " + course.courseId);


        System.out.println("The student name is : " + student.name);
        System.out.println("The studentId is : " + student.studentId);


        System.out.println("Student ID: " + enrollment.student.studentId + ", Name: " + enrollment.student.name);
        System.out.println("Course ID: " + " " + enrollment.course.courseId + ", Name: " + enrollment.course.courseName);
    }
}