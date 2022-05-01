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
public class AssignmentsPerStudents {
    
       private ArrayList<Assignment> assignments;
    private Student student;

    public AssignmentsPerStudents() {
    }

    public AssignmentsPerStudents(ArrayList<Assignment> assignments,Student student) {
        this.assignments = assignments;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }
    @Override
    public String toString() {
        StringBuilder sb3 = new StringBuilder("Student: " + student.getfName().toUpperCase() + " " + student.getlName().toUpperCase() + "\n").append("Assignments " + "\n" );
        for(Assignment s:assignments){
            sb3.append("Title: " + s.getTitle() + " " + s.getDescription() + "\n");
        }
        sb3.append("\n");

        return sb3.toString();
    }
    
}
