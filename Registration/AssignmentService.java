/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import data.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import models.Assignment;

/**
 *
 * @author Vaggelis
 */
public class AssignmentService {

    static ArrayList<Assignment> assignmentList = new ArrayList<>();

    public Assignment addAssignment() {

        Data data = new Data();
        Assignment assignment = new Assignment();
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Give assignment's title");
            String title = scanner.nextLine();
            System.out.println("Give description");
            String description = scanner.nextLine();
            System.out.println("Give date (example: YYYY-MM-DD)");
            LocalDate subDate = LocalDate.parse(scanner.nextLine());
            LocalDateTime subDateTime = subDate.atStartOfDay();
            System.out.println("Give assignment's oral mark");
            float oralMark = scanner.nextInt();
            System.out.println("Give assignment's total mark");
            float totalMark = scanner.nextInt();
            assignment.setTitle(title);
            assignment.setDescription(description);
            assignment.setSubDateTime(subDateTime);
            assignment.setOralMark(oralMark);

            assignment.setTotalMark(totalMark);

            assignmentList.add(assignment);
            data.addAssignment(assignment);
            System.out.println(assignmentList);
        } catch (Exception e) {
            System.out.println("Wrong Input");
        }

        return assignment;

    }

}
