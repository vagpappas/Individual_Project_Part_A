/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.util.Scanner;

/**
 *
 * @author Vaggelis
 */
public class Registration {
    
      public Registration myRegistration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to make a new registration " + "/"/*2 for using synthetic data," */ +
                " Press 0 for Menu");
        int button1 = sc.nextInt();
        while ((button1 != 1) && /*(button1 != 2) &&*/ (button1 != 0)) {
            System.out.println("Wrong input!!! Press 1 for new registration," /*2 for using synthetic data, "*/ +
                    " and 0 for Menu");
            button1 = sc.nextInt();

        }

        Boolean flag = true;

        while(flag) {
            do {
                if (button1 == 1) {
                    System.out.println("Press 3 for adding new student, "
                            + "4 for adding new trainer, 5 for adding new assignment"
                            + " 6 for adding new course "
                            + "and 0 for Menu");
                    int button2 = sc.nextInt();
                    while ((button2 != 3) && (button2 != 4) && (button2 != 5) && (button2 != 6) && (button2 != 0)) {
                        System.out.println("Wrong input!!! Press 3 for adding new student, "
                                + "4 adding new trainer, 5 for adding new assignment"
                                + "6 for adding new course"
                                + " and 0 for Menu");
                        button2 = sc.nextInt();
                    }
                    switch (button2) {
                        case 0:
                            flag = false;
                            break;
                        case 3:
                            System.out.println("Student");
                            StudentService addStudent = new StudentService();
                            addStudent.addStudent();
                            break;
                        case 4:
                            System.out.println("Trainer");
                            TrainerService addTrainer = new TrainerService();
                            addTrainer.addTrainer();
                            break;
                        case 5:
                            System.out.println("Assignment");
                            AssignmentService addAssignment = new AssignmentService();
                            addAssignment.addAssignment();
                            break;
                        case 6:
                            System.out.println("Course");
                            CourseService addCourse = new CourseService();
                            addCourse.addCourse();
                    }
                } else if (button1 == 2) {
                    System.out.println("Give 7 for all student's list, "
                            + " 8 for all trainer's list, 9 for all course's list "
                            + " 10 for all assignment's list "
                            + " and 0 to terminate the programm");
                    int button3 = sc.nextInt();
                    while ((button3 != 7) && (button3 != 8) && (button3 != 9) && (button3 != 10) && (button3 != 0)) {
                        System.out.println("Wrong input!!! Give 7 for all student's list, "
                                + " 8 for all trainer's list, 9 for all course's list, "
                                + " 10 for all assignment's list "
                                + " and 0 to terminate the programm");
                        button3 = sc.nextInt();
                    }

                    break;

                } else if(button1 == 0) {
                    flag = false;
                    System.out.println("");
                }

            } while (button1 != 0 && flag);
            System.out.println("");
        }


        Registration registration = new Registration();
        return registration;
    }

    
}
