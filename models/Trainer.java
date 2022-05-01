
package models;


public class Trainer {
    private String fName;
    private String lName;
    public String subject;
    
      public Trainer() {
    }

    
    public Trainer (String fName,String lName,String subject){
    this.fName = fName;
    this.lName = lName;
    this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer{" + "fName=" + fName + ", lName=" + lName + ", subject=" + subject + '}';
    }

   
  
    
}
