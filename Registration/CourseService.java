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
import models.Course;

/**
 *
 * @author Vaggelis
 */
public class CourseService {
    
    
    static ArrayList<Course> courseList = new ArrayList<>();

    public Course addCourse(){

         Data data = new Data();
           Course course = new Course();

        Scanner scanner = new Scanner(System.in);
        
        try{
             System.out.println("Give course's title");
        String title = scanner.nextLine();
        System.out.println("Give course's stream");
        String stream = scanner.nextLine();
        System.out.println("Give course's type");
        String type = scanner.nextLine();
        System.out.println("Give course's start date (example: YYYY-MM-DD)");
        LocalDate start_date = LocalDate.parse(scanner.nextLine());
        System.out.println("Give course's end date (example: YYYY-MM-DD)");
        LocalDate end_date = LocalDate.parse(scanner.nextLine());
        
        course.setEnd_date(end_date);
        course.setStart_date(start_date);
        course.setStream(stream);
        course.setTitle(title);
        course.setType(type);

      
        courseList.add(course);
        data.addCourse(course);
        System.out.println(courseList);
            
        }catch(Exception e){
            System.out.println("Wrong Input");
        }
        
       
        return course;
    }
    
}
