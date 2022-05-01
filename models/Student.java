
package models;

import java.time.LocalDate;


public class Student {
     private String fName;
    private String lName;
    private LocalDate dateOfBirth;
    private double tuitionFees;

    public Student (){}

    public Student(String fName,String lName,LocalDate dateOfBirth,double tuitionFees){
this.fName = fName;
this.lName = lName;
this.dateOfBirth = dateOfBirth;
this.tuitionFees = tuitionFees;

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", tuitionFees=" + tuitionFees +
                '}';
    }
    
    
}
