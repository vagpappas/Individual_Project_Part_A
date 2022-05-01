/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import data.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import models.Student;

/**
 *
 * @author Vaggelis
 */
public class StudentService {

    static ArrayList<Student> studentsList = new ArrayList<>();

    public Student addStudent() {

        Data data = new Data();
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Give first name");
            String fName = scanner.nextLine();
            System.out.println("Give last name");
            String lName = scanner.nextLine();
            System.out.println("Give date of birth (example: YYYY-MM-DD)");
            LocalDate dateOBirth = LocalDate.parse(scanner.nextLine());
            System.out.println("Give tuition fees");
            double tuitionFees = scanner.nextDouble();
            student.setfName(fName);
            student.setlName(lName);
            student.setDateOfBirth(dateOBirth);
            student.setTuitionFees(tuitionFees);

            studentsList.add(student);
            data.addStudent(student);

            System.out.println(studentsList);
        } catch (Exception e) {
            System.out.println("WRONG INPUT");
        }
        return student;
    }

}
