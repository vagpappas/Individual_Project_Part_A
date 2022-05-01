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
public class TrainersPerCourse {
    
      private ArrayList<Trainer> trainers;
    private Course course;

    public TrainersPerCourse() {
    }

    public TrainersPerCourse(ArrayList<Trainer> trainers, Course course) {
        this.trainers = trainers;
        this.course = course;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        StringBuilder sb1 = new StringBuilder("Course: " + course.getStream().toUpperCase() + "\n").append("Trainers " + "\n" );
        for(Trainer s:trainers){
            sb1.append("Name: " + s.getfName() + " " + s.getlName() + "\n");
        }
        sb1.append("\n");

        return sb1.toString();
    }
    
}
