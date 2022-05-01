/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Vaggelis
 */
public class StudentsPerCourse {
    
    private ArrayList<Student> students;
    private Course course;

    public StudentsPerCourse() {
    }

    public StudentsPerCourse(ArrayList<Student> students, Course course) {
        this.students = students;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("Course: " + course.getStream().toUpperCase() + "\n").append("Students " + "\n" );
      for(Student s:students){
          sb.append("Name: " + s.getfName() + " " + s.getlName() + "\n");
      }
      sb.append("\n");

      return sb.toString();
    }
    
}
