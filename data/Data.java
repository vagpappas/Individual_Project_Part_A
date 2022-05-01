package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import models.Assignment;
import models.AssignmentsPerCourse;
import models.AssignmentsPerStudents;
import models.Course;
import models.Student;
import models.StudentsPerCourse;
import models.Trainer;
import models.TrainersPerCourse;

public class Data {

    public static Student s1 = new Student("Vaggelis", "Pappas", LocalDate.of(1990, Month.FEBRUARY, 25), 1000.0);
    public static Student s2 = new Student("Nikos", "Tseperkas", LocalDate.of(1990, Month.SEPTEMBER, 10), 1000.0);
    public static Student s3 = new Student("Giorgos", "Kokolakhs", LocalDate.of(1990, Month.SEPTEMBER, 7), 1000.0);
    public static Student s4 = new Student("Antonis", "Katsakos", LocalDate.of(1990, Month.DECEMBER, 5), 1000.0);
    public static Student s5 = new Student("Roman", "Hagos", LocalDate.of(1989, Month.MARCH, 13), 1000.0);
    public static Student s6 = new Student("Pantelis", "Logothetis", LocalDate.of(1990, Month.SEPTEMBER, 10), 1000.0);
    public static Student s7 = new Student("Efi", "Gavrielatou", LocalDate.of(1990, Month.JUNE, 28), 1000.0);
    public static Student s8 = new Student("Antreas", "Charouchas", LocalDate.of(1987, Month.AUGUST, 2), 1000.0);
    public static Student s9 = new Student("Giorgos", "Azakas", LocalDate.of(1990, Month.JANUARY, 13), 1000.0);
    public static Student s10 = new Student("Giorgos", "Karatzas", LocalDate.of(1990, Month.MAY, 16), 1000.0);
    public static Student s11 = new Student("Dimitris", "Seltsas", LocalDate.of(1989, Month.DECEMBER, 18), 1000.0);
    public static Student s12 = new Student("Dimitris", "Papadogiannakis", LocalDate.of(1990, Month.JULY, 24), 1000.0);
    public static Student s13 = new Student("klimis", "Xarachidis", LocalDate.of(1990, Month.FEBRUARY, 16), 1000.0);
    public static Student s14 = new Student("Nikos", "Petrakos", LocalDate.of(1990, Month.SEPTEMBER, 7), 1000.0);
    public static Student s15 = new Student("Eleni", "Bougioukou", LocalDate.of(1990, Month.JUNE, 17), 1000.0);
    public static Student s16 = new Student("Vasw", "Manou", LocalDate.of(1994, Month.SEPTEMBER, 5), 1000.0);
    public static Student s17 = new Student("Xristos", "Mpousmpouras", LocalDate.of(1990, Month.MAY, 12), 1000.0);
    public static Student s18 = new Student("Xristos", "Panos", LocalDate.of(1990, Month.JULY, 18), 1000.0);
    public static Student s19 = new Student("Xristos", "Stoukas", LocalDate.of(1990, Month.SEPTEMBER, 12), 1000.0);
    public static Student s20 = new Student("Spiros", "Pantos", LocalDate.of(1990, Month.SEPTEMBER, 7), 1000.0);

    public static Course course1 = new Course("CB8", "Java", "Full-Time", LocalDate.of(2022, Month.FEBRUARY, 28), LocalDate.of(2022, Month.SEPTEMBER, 30));
    public static Course course2 = new Course("CB8", "Java", "Part-Time", LocalDate.of(2022, Month.FEBRUARY, 1), LocalDate.of(2022, Month.APRIL, 30));
    public static Course course3 = new Course("CB8", "Python", "Full-Time", LocalDate.of(2022, Month.FEBRUARY, 28), LocalDate.of(2022, Month.SEPTEMBER, 30));
    public static Course course4 = new Course("CB8", "Python", "Part-Time", LocalDate.of(2022, Month.FEBRUARY, 1), LocalDate.of(2022, Month.APRIL, 30));
    public static Course course5 = new Course("CB8", "Javascript", "Full-Time", LocalDate.of(2022, Month.FEBRUARY, 28), LocalDate.of(2022, Month.SEPTEMBER, 30));
    public static Course course6 = new Course("CB8", "Javascript", "Part-Time", LocalDate.of(2022, Month.FEBRUARY, 1), LocalDate.of(2022, Month.APRIL, 30));
    public static Course course7 = new Course("CB8", "C#", "Full-Time", LocalDate.of(2022, Month.FEBRUARY, 28), LocalDate.of(2022, Month.SEPTEMBER, 30));
    public static Course course8 = new Course("CB8", "C#", "Part-Time", LocalDate.of(2022, Month.FEBRUARY, 1), LocalDate.of(2022, Month.APRIL, 30));

    public static Trainer t1 = new Trainer("Georgios", "Pasparakis", "Java");
    public static Trainer t2 = new Trainer("Antonis", "Thodos", "Python");
    public static Trainer t3 = new Trainer("Georgios", "Iraklidis", "Java");
    public static Trainer t4 = new Trainer("Ioannis", "Mantoudis", "Javascript");
    public static Trainer t5 = new Trainer("Nikos", "Papadopoulos", "C#");
    public static Trainer t6 = new Trainer("Rafaella", "Kwnstantinou", "Python");
    public static Trainer t7 = new Trainer("Maria", "Polukreth", "C#");
    public static Trainer t8 = new Trainer("Xrhstos", "Iwannou", "Javascript");

    public static Assignment assignment1 = new Assignment("Assignment 1", "Forms with validations", LocalDateTime.of(2022, Month.APRIL, 11, 23, 59), 20, 100);
    public static Assignment individualProject = new Assignment("Individual Project-Part A", "Design with implementation of a private school structure", LocalDateTime.of(2022, Month.MAY, 2, 23, 59), 20, 100);
    public static Assignment individualProject2 = new Assignment("Individual Project-Part B", "ERD and database", LocalDateTime.of(2022, Month.JUNE, 8, 23, 59), 20, 100);
    public static Assignment assignment2 = new Assignment("Assignment 2", "MVC methologies", LocalDateTime.of(2022, Month.JULY, 5, 23, 59), 20, 100);
    public static Assignment assignment3 = new Assignment("Assignment 3", "Brief", LocalDateTime.of(2022, Month.JULY, 19, 23, 59), 20, 100);
    public static Assignment assignment4 = new Assignment("Assignment 4", "Brief", LocalDateTime.of(2022, Month.JULY, 19, 23, 59), 20, 100);
    public static Assignment assignment5 = new Assignment("Assignment 5", "Build dynamically a page", LocalDateTime.of(2022, Month.SEPTEMBER, 9, 23, 59), 20, 100);
    public static Assignment groupProject = new Assignment("Group Project", "Team", LocalDateTime.of(2022, Month.SEPTEMBER, 23, 23, 59), 20, 100);

    public static ArrayList<Student> studentsView = new ArrayList<Student>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20));
    public static ArrayList<Trainer> trainersView = new ArrayList<Trainer>(Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8));
    public static ArrayList<Course> coursesView = new ArrayList<Course>(Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8));
    public static ArrayList<Assignment> assignmentsView = new ArrayList<Assignment>(Arrays.asList(assignment1, individualProject, individualProject2, assignment2, assignment3, assignment4, assignment5, groupProject));

    public void addStudent(Student student) {
        studentsView.add(student);
    }

    public ArrayList<Student> allStudents() {
        return studentsView;
    }

    public void addTrainer(Trainer trainer) {
        trainersView.add(trainer);
    }

    public ArrayList<Trainer> allTrainers() {
        return trainersView;
    }

    public void addCourse(Course course) {
        coursesView.add(course);
    }

    public ArrayList<Course> allCourses() {
        return coursesView;
    }

    public void addAssignment(Assignment assignment) {
        assignmentsView.add(assignment);
    }

    public ArrayList<Assignment> allAssignments() {
        return assignmentsView;
    }

    public ArrayList<StudentsPerCourse> studentPerCourse() {

        ArrayList<StudentsPerCourse> studentPerCourseList = new ArrayList<>();
        ArrayList<Student> studentJava = new ArrayList<>();
        studentJava.add(s1);
        studentJava.add(s2);
        studentJava.add(s9);
        studentJava.add(s10);
        studentJava.add(s11);
        studentJava.add(s14);

        ArrayList<Student> studentPython = new ArrayList<>();
        studentPython.add(s3);
        studentPython.add(s4);
        studentPython.add(s12);
        studentPython.add(s13);
        studentPython.add(s14);
        studentPython.add(s10);

        ArrayList<Student> studentJavascript = new ArrayList<>();
        studentJavascript.add(s5);
        studentJavascript.add(s6);
        studentJavascript.add(s15);
        studentJavascript.add(s16);
        studentJavascript.add(s17);
        studentJavascript.add(s18);

        ArrayList<Student> studentCsharp = new ArrayList<>();
        studentCsharp.add(s7);
        studentCsharp.add(s8);
        studentCsharp.add(s18);
        studentCsharp.add(s19);
        studentCsharp.add(s20);
        studentCsharp.add(s5);

        StudentsPerCourse scjava = new StudentsPerCourse(studentJava, course1);
        StudentsPerCourse scPython = new StudentsPerCourse(studentPython, course3);
        StudentsPerCourse scJavascript = new StudentsPerCourse(studentJavascript, course5);
        StudentsPerCourse scCsharp = new StudentsPerCourse(studentCsharp, course7);

        studentPerCourseList.add(scPython);
        studentPerCourseList.add(scjava);
        studentPerCourseList.add(scJavascript);
        studentPerCourseList.add(scCsharp);

        return studentPerCourseList;
    }

    public ArrayList<TrainersPerCourse> trainerPerCourse() {

        ArrayList<TrainersPerCourse> trainerPerCourseList = new ArrayList<>();

        ArrayList<Trainer> trainerJava = new ArrayList<>();
        trainerJava.add(t1);
        trainerJava.add(t3);

        ArrayList<Trainer> trainerPython = new ArrayList<>();
        trainerPython.add(t2);
        trainerPython.add(t6);

        ArrayList<Trainer> trainerJavascript = new ArrayList<>();
        trainerJavascript.add(t4);
        trainerJavascript.add(t8);

        ArrayList<Trainer> trainerCsharp = new ArrayList<>();
        trainerCsharp.add(t5);
        trainerCsharp.add(t7);

        TrainersPerCourse sc1java = new TrainersPerCourse(trainerJava, course1);
        TrainersPerCourse sc1Python = new TrainersPerCourse(trainerPython, course3);
        TrainersPerCourse sc1Javascript = new TrainersPerCourse(trainerJavascript, course5);
        TrainersPerCourse sc1Csharp = new TrainersPerCourse(trainerCsharp, course7);

        trainerPerCourseList.add(sc1java);
        trainerPerCourseList.add(sc1Python);
        trainerPerCourseList.add(sc1Javascript);
        trainerPerCourseList.add(sc1Csharp);

        return trainerPerCourseList;
    }

    public ArrayList<AssignmentsPerCourse> assignmentPerCourse() {

        ArrayList<AssignmentsPerCourse> assignmentPerCourseList = new ArrayList<>();

        ArrayList<Assignment> assignmentJava = new ArrayList<>();
        assignmentJava.add(assignment1);
        assignmentJava.add(individualProject);
        assignmentJava.add(individualProject2);
        assignmentJava.add(assignment2);
        assignmentJava.add(assignment3);
        assignmentJava.add(assignment4);
        assignmentJava.add(assignment5);
        assignmentJava.add(groupProject);

        ArrayList<Assignment> assignmentPython = new ArrayList<>();
        assignmentPython.add(assignment1);
        assignmentPython.add(individualProject);
        assignmentPython.add(individualProject2);
        assignmentPython.add(assignment2);
        assignmentPython.add(assignment3);
        assignmentPython.add(assignment4);
        assignmentPython.add(assignment5);
        assignmentPython.add(groupProject);

        ArrayList<Assignment> assignmentJavascript = new ArrayList<>();
        assignmentJavascript.add(assignment1);
        assignmentJavascript.add(individualProject);
        assignmentJavascript.add(individualProject2);
        assignmentJavascript.add(assignment2);
        assignmentJavascript.add(assignment3);
        assignmentJavascript.add(assignment4);
        assignmentJavascript.add(assignment5);
        assignmentJavascript.add(groupProject);

        ArrayList<Assignment> assignmentCsharp = new ArrayList<>();
        assignmentCsharp.add(assignment1);
        assignmentCsharp.add(individualProject);
        assignmentCsharp.add(individualProject2);
        assignmentCsharp.add(assignment2);
        assignmentCsharp.add(assignment3);
        assignmentCsharp.add(assignment4);
        assignmentCsharp.add(assignment5);
        assignmentCsharp.add(groupProject);

        AssignmentsPerCourse sc2java = new AssignmentsPerCourse(assignmentJava, course1);
        AssignmentsPerCourse sc2Python = new AssignmentsPerCourse(assignmentPython, course3);
        AssignmentsPerCourse sc2Javascript = new AssignmentsPerCourse(assignmentJavascript, course5);
        AssignmentsPerCourse sc2Csharp = new AssignmentsPerCourse(assignmentCsharp, course7);

        assignmentPerCourseList.add(sc2java);
        assignmentPerCourseList.add(sc2Python);
        assignmentPerCourseList.add(sc2Javascript);
        assignmentPerCourseList.add(sc2Csharp);

        return assignmentPerCourseList;
    }

    public ArrayList<AssignmentsPerStudents> assignmentPerStudent() {

        ArrayList<AssignmentsPerStudents> assignmentPerStudentList = new ArrayList<>();

        ArrayList<Assignment> st1 = new ArrayList<>();
        st1.add(assignment1);
        st1.add(individualProject);
        st1.add(individualProject2);
        st1.add(assignment2);
        st1.add(assignment3);
        st1.add(assignment4);
        st1.add(assignment5);
        st1.add(groupProject);

        ArrayList<Assignment> st2 = new ArrayList<>();
        st2.add(assignment1);
        st2.add(individualProject);
        st2.add(individualProject2);
        st2.add(assignment2);
        st2.add(assignment3);
        st2.add(assignment4);
        st2.add(assignment5);
        st2.add(groupProject);

        ArrayList<Assignment> st3 = new ArrayList<>();
        st3.add(assignment1);
        st3.add(individualProject);
        st3.add(individualProject2);
        st3.add(assignment2);
        st3.add(assignment3);
        st3.add(assignment4);
        st3.add(assignment5);
        st3.add(groupProject);

        ArrayList<Assignment> st4 = new ArrayList<>();
        st4.add(assignment1);
        st4.add(individualProject);
        st4.add(individualProject2);
        st4.add(assignment2);
        st4.add(assignment3);
        st4.add(assignment4);
        st4.add(assignment5);
        st4.add(groupProject);

        ArrayList<Assignment> st5 = new ArrayList<>();
        st5.add(assignment1);
        st5.add(individualProject);
        st5.add(individualProject2);
        st5.add(assignment2);
        st5.add(assignment3);
        st5.add(assignment4);
        st5.add(assignment5);
        st5.add(groupProject);

        ArrayList<Assignment> st6 = new ArrayList<>();
        st6.add(assignment1);
        st6.add(individualProject);
        st6.add(individualProject2);
        st6.add(assignment2);
        st6.add(assignment3);
        st6.add(assignment4);
        st6.add(assignment5);
        st6.add(groupProject);

        ArrayList<Assignment> st7 = new ArrayList<>();
        st7.add(assignment1);
        st7.add(individualProject);
        st7.add(individualProject2);
        st7.add(assignment2);
        st7.add(assignment3);
        st7.add(assignment4);
        st7.add(assignment5);
        st7.add(groupProject);

        ArrayList<Assignment> st8 = new ArrayList<>();
        st8.add(assignment1);
        st8.add(individualProject);
        st8.add(individualProject2);
        st8.add(assignment2);
        st8.add(assignment3);
        st8.add(assignment4);
        st8.add(assignment5);
        st8.add(groupProject);

        ArrayList<Assignment> st9 = new ArrayList<>();
        st9.add(assignment1);
        st9.add(individualProject);
        st9.add(individualProject2);
        st9.add(assignment2);
        st9.add(assignment3);
        st9.add(assignment4);
        st9.add(assignment5);
        st9.add(groupProject);

        ArrayList<Assignment> st10 = new ArrayList<>();
        st10.add(assignment1);
        st10.add(individualProject);
        st10.add(individualProject2);
        st10.add(assignment2);
        st10.add(assignment3);
        st10.add(assignment4);
        st10.add(assignment5);
        st10.add(groupProject);

        ArrayList<Assignment> st11 = new ArrayList<>();
        st11.add(assignment1);
        st11.add(individualProject);
        st11.add(individualProject2);
        st11.add(assignment2);
        st11.add(assignment3);
        st11.add(assignment4);
        st11.add(assignment5);
        st11.add(groupProject);

        ArrayList<Assignment> st12 = new ArrayList<>();
        st12.add(assignment1);
        st12.add(individualProject);
        st12.add(individualProject2);
        st12.add(assignment2);
        st12.add(assignment3);
        st12.add(assignment4);
        st12.add(assignment5);
        st12.add(groupProject);

        ArrayList<Assignment> st13 = new ArrayList<>();
        st13.add(assignment1);
        st13.add(individualProject);
        st13.add(individualProject2);
        st13.add(assignment2);
        st13.add(assignment3);
        st13.add(assignment4);
        st13.add(assignment5);
        st13.add(groupProject);

        ArrayList<Assignment> st14 = new ArrayList<>();
        st14.add(assignment1);
        st14.add(individualProject);
        st14.add(individualProject2);
        st14.add(assignment2);
        st14.add(assignment3);
        st14.add(assignment4);
        st14.add(assignment5);
        st14.add(groupProject);

        ArrayList<Assignment> st15 = new ArrayList<>();
        st15.add(assignment1);
        st15.add(individualProject);
        st15.add(individualProject2);
        st15.add(assignment2);
        st15.add(assignment3);
        st15.add(assignment4);
        st15.add(assignment5);
        st15.add(groupProject);

        ArrayList<Assignment> st16 = new ArrayList<>();
        st16.add(assignment1);
        st16.add(individualProject);
        st16.add(individualProject2);
        st16.add(assignment2);
        st16.add(assignment3);
        st16.add(assignment4);
        st16.add(assignment5);
        st16.add(groupProject);

        ArrayList<Assignment> st17 = new ArrayList<>();
        st17.add(assignment1);
        st17.add(individualProject);
        st17.add(individualProject2);
        st17.add(assignment2);
        st17.add(assignment3);
        st17.add(assignment4);
        st17.add(assignment5);
        st17.add(groupProject);

        ArrayList<Assignment> st18 = new ArrayList<>();
        st18.add(assignment1);
        st18.add(individualProject);
        st18.add(individualProject2);
        st18.add(assignment2);
        st18.add(assignment3);
        st18.add(assignment4);
        st18.add(assignment5);
        st18.add(groupProject);

        ArrayList<Assignment> st19 = new ArrayList<>();
        st19.add(assignment1);
        st19.add(individualProject);
        st19.add(individualProject2);
        st19.add(assignment2);
        st19.add(assignment3);
        st19.add(assignment4);
        st19.add(assignment5);
        st19.add(groupProject);

        ArrayList<Assignment> st20 = new ArrayList<>();
        st20.add(assignment1);
        st20.add(individualProject);
        st20.add(individualProject2);
        st20.add(assignment2);
        st20.add(assignment3);
        st20.add(assignment4);
        st20.add(assignment5);
        st20.add(groupProject);

        AssignmentsPerStudents student1 = new AssignmentsPerStudents(st1, s1);
        AssignmentsPerStudents student2 = new AssignmentsPerStudents(st2, s2);
        AssignmentsPerStudents student3 = new AssignmentsPerStudents(st3, s3);
        AssignmentsPerStudents student4 = new AssignmentsPerStudents(st4, s4);
        AssignmentsPerStudents student5 = new AssignmentsPerStudents(st5, s5);
        AssignmentsPerStudents student6 = new AssignmentsPerStudents(st6, s6);
        AssignmentsPerStudents student7 = new AssignmentsPerStudents(st7, s7);
        AssignmentsPerStudents student8 = new AssignmentsPerStudents(st8, s8);
        AssignmentsPerStudents student9 = new AssignmentsPerStudents(st9, s9);
        AssignmentsPerStudents student10 = new AssignmentsPerStudents(st10, s10);
        AssignmentsPerStudents student11 = new AssignmentsPerStudents(st11, s11);
        AssignmentsPerStudents student12 = new AssignmentsPerStudents(st12, s12);
        AssignmentsPerStudents student13 = new AssignmentsPerStudents(st13, s13);
        AssignmentsPerStudents student14 = new AssignmentsPerStudents(st14, s14);
        AssignmentsPerStudents student15 = new AssignmentsPerStudents(st15, s15);
        AssignmentsPerStudents student16 = new AssignmentsPerStudents(st16, s16);
        AssignmentsPerStudents student17 = new AssignmentsPerStudents(st17, s17);
        AssignmentsPerStudents student18 = new AssignmentsPerStudents(st19, s18);
        AssignmentsPerStudents student19 = new AssignmentsPerStudents(st19, s19);
        AssignmentsPerStudents student20 = new AssignmentsPerStudents(st20, s20);

        assignmentPerStudentList.add(student1);
        assignmentPerStudentList.add(student2);
        assignmentPerStudentList.add(student3);
        assignmentPerStudentList.add(student4);
        assignmentPerStudentList.add(student5);
        assignmentPerStudentList.add(student6);
        assignmentPerStudentList.add(student7);
        assignmentPerStudentList.add(student8);
        assignmentPerStudentList.add(student9);
        assignmentPerStudentList.add(student10);
        assignmentPerStudentList.add(student11);
        assignmentPerStudentList.add(student12);
        assignmentPerStudentList.add(student13);
        assignmentPerStudentList.add(student14);
        assignmentPerStudentList.add(student15);
        assignmentPerStudentList.add(student16);
        assignmentPerStudentList.add(student17);
        assignmentPerStudentList.add(student18);
        assignmentPerStudentList.add(student19);
        assignmentPerStudentList.add(student20);

        return assignmentPerStudentList;
    }

    public ArrayList<Student> doubleCourseStudent() {

        ArrayList<StudentsPerCourse> allStudentPerCourse = studentPerCourse();
        ArrayList<Student> students = allStudents();
        ArrayList<Student> studentsRet = new ArrayList<>();

        for (Student s : students) {
            int step = 0;
            for (StudentsPerCourse studentPerCourse : allStudentPerCourse) {
                switch (studentPerCourse.getCourse().getStream()) {
                    case "Java":
                        for (Student st : studentPerCourse.getStudents()) {
                            if (st.equals(s)) {
                                step = step + 1;
                            }
                        }
                        break;
                    case "C#":
                        for (Student st : studentPerCourse.getStudents()) {
                            if (st.equals(s)) {
                                step = step + 1;
                            }
                        }
                        break;
                    case "Javascript":
                        for (Student st : studentPerCourse.getStudents()) {
                            if (st.equals(s)) {
                                step = step + 1;
                            }
                        }
                        break;
                    case "Python":
                        for (Student st : studentPerCourse.getStudents()) {
                            if (st.equals(s)) {
                                step = step + 1;
                            }
                        }
                        break;
                }
            }

            if (step > 1) {
                studentsRet.add(s);
            }
        }

        return studentsRet;
    }

    public ArrayList<Student> assignmentDate(LocalDate dateInput) {

        ArrayList<AssignmentsPerStudents> assPerStudent = assignmentPerStudent();
        ArrayList<Student> studentsRet = new ArrayList<>();

        TemporalField woyInput = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
        int weekNumberInput = dateInput.get(woyInput);

        for (AssignmentsPerStudents s : assPerStudent) {
            int step = 0;
            for (Assignment ass : s.getAssignments()) {
                LocalDate localDateStudent = ass.getSubDateTime().toLocalDate();
                TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
                int weekNumberStudent = localDateStudent.get(woy);

                if (weekNumberInput == weekNumberStudent) {
                    step = step + 1;
                }
            }

            if (step > 0) {
                studentsRet.add(s.getStudent());
            }
        }

        return studentsRet;
    }

}
