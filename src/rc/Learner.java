/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author RC_Student_lab
 */
public class Learner {
     //create attributes/instance variable
    private String fullName;
    private String subject;
    private int assignmentMark;
    private int testMark;
    private int examMark;
    
    
    //create the constructors - to set default values to the attributes
    public Learner() {
     this.fullName = "";
     this.subject = "";
     this.assignmentMark = 0;
     this.testMark = 0;
     this.examMark = 0; 
        
    }
    //create the getters/ accessor methods
    public String getfullName(){
      return this.fullName;
    }
    public String getsubject() {
    return this.subject;
    }
    public int getassignmentMark() {
    return this.assignmentMark; 
    }
    public int gettestMark(){
    return this.testMark;    
    }
    public int getexamMark() {
    return this.examMark;
    }
    
    //create the setters/ mutator methods
    public void setfullName(String fullName) {
    this.fullName = fullName;
    }
    public void setsubject( String subject) {
     this.subject = subject;
    }
    public void setassignmentMark(int assignmentMark) {
    this.assignmentMark = assignmentMark;
    }
    public void settestMark(int testMark) {
    this.testMark =  testMark;
    }
    public void setexamMark(int examMark) {
    this.examMark = examMark;
    }
    
    //a method to calculate the final mark
    public int finalMark() {
     return (getassignmentMark() + gettestMark() + getexamMark())/3; //(return this assignment Mark + get test mark + exam mark)/3
    }
    
}
