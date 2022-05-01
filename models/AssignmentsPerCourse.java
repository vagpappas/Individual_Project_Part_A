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
public class AssignmentsPerCourse {
    
       private ArrayList<Assignment> assignments;
    private Course course;

    public AssignmentsPerCourse() {
    }

    public AssignmentsPerCourse(ArrayList<Assignment> assignments,Course course) {
        this.assignments = assignments;
        this.course = course;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Course: " + course.getStream().toUpperCase() + "\n").append("Assignments " + "\n" );
        for(Assignment s:assignments){
            sb2.append("Title: " + s.getTitle() + " " + s.getDescription() + "\n");
        }
        sb2.append("\n");

        return sb2.toString();
    }
    
}
