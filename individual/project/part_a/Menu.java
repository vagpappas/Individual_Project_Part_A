/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individual.project.part_a;

import Registration.Registration;
import data.Data;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;
import models.Assignment;
import models.AssignmentsPerCourse;
import models.AssignmentsPerStudents;
import models.Course;
import models.Student;
import models.StudentsPerCourse;
import models.Trainer;
import models.TrainersPerCourse;

/**
 *
 * @author Vaggelis
 */
public class Menu {

    public void menu() {

        Registration registration = new Registration();
        registration.myRegistration();

        Data data = new Data();
        Boolean flag = true;

        while (flag) {
            System.out.println("\n");
            System.out.println("SYNTHETIC DATA/INFORMATIONS");
            System.out.println("Press 0 for registration");
            System.out.println("Press 1 for students");
            System.out.println("Press 2 for trainers");
            System.out.println("Press 3 for courses");
            System.out.println("Press 4 for assignments");
            System.out.println("Press 5 for students per courses");
            System.out.println("Press 6 for trainers per courses");
            System.out.println("Press 7 for assignments per courses");
            System.out.println("Press 8 for assignments per students");
            System.out.println("Press 9 for list of Students with two or more Courses");
            System.out.println("Press 10 to give a Date to find if there is any assignment on this week");
            System.out.println("Press Exit to terminate program");
            System.out.println("\n");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    ArrayList<Student> students = data.allStudents();
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i));
                    }
                    break;
                case "2":
                    ArrayList<Trainer> trainers = data.allTrainers();
                    for (int i = 0; i < trainers.size(); i++) {
                        System.out.println(trainers.get(i));
                    }
                    break;
                case "3":
                    ArrayList<Course> courses = data.allCourses();
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println(courses.get(i));
                    }
                    break;
                case "4":
                    ArrayList<Assignment> assignments = data.allAssignments();
                    for (int i = 0; i < assignments.size(); i++) {
                        System.out.println(assignments.get(i));
                    }
                    break;
                case "5":
                    ArrayList<StudentsPerCourse> studentsPerCourses = data.studentPerCourse();
                    for (int i = 0; i < studentsPerCourses.size(); i++) {
                        System.out.println(studentsPerCourses.get(i));
                    }
                    break;
                case "6":
                    ArrayList<TrainersPerCourse> trainersPerCourses = data.trainerPerCourse();
                    for (int i = 0; i < trainersPerCourses.size(); i++) {
                        System.out.println(trainersPerCourses.get(i));
                    }
                    break;
                case "7":
                    ArrayList<AssignmentsPerCourse> assignmentsPerCourses = data.assignmentPerCourse();
                    for (int i = 0; i < assignmentsPerCourses.size(); i++) {
                        System.out.println(assignmentsPerCourses.get(i));
                    }
                    break;
                case "8":
                    ArrayList<AssignmentsPerStudents> assignmentsPerStudents = data.assignmentPerStudent();
                    for (int i = 0; i < assignmentsPerStudents.size(); i++) {
                        System.out.println(assignmentsPerStudents.get(i));
                    }
                    break;
                case "9":
                    ArrayList<Student> sameStudents = data.doubleCourseStudent();
                    for (Student x : sameStudents) {
                        System.out.println(x + "\n");
                    }
                    break;
                case "10":
                    System.out.println("Give a date  (example: YYYY-MM-DD)");
                    Scanner scanner10 = new Scanner(System.in);
                    
                    try {
                        LocalDate date = LocalDate.parse(scanner10.nextLine());
                        ArrayList<Student> assStudents = data.assignmentDate(date);
                        if (assStudents != null) {
                            System.out.println("\n");
                            for (Student x : assStudents) {
                                System.out.println(x + "\n");
                            }
                        } else if (assStudents == null) {
                            System.out.println("No Students found");
                        }
                    } catch (java.time.format.DateTimeParseException e) {
                        System.out.println("\n * wrong input please try again * \n");
                    }
                    break;
                case "0":
                    registration.myRegistration();
                    break;
                case "EXIT":
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }

    }
}
