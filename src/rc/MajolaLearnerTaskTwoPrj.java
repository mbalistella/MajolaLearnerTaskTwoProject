/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class MajolaLearnerTaskTwoPrj {

 // Create the learner object = instantiation/instatiate
   static Learner objLearner = new Learner();
   
    public static void main(String[] args) {
     //call method to get user input 
     getLearnerInput();
     
     //call method to display final mark
     displayfinalMark();
    }  
    // Call a method to prompt the user for students details
        public static void getLearnerInput() {
            objLearner.setfullName(JOptionPane.showInputDialog( "please enter your full name"));
            objLearner.setsubject(JOptionPane.showInputDialog("please enter the name of the subject you are currently studying "));
            objLearner.setassignmentMark(Integer.parseInt(JOptionPane.showInputDialog("Please enter your assignment mark")));
            objLearner.settestMark(Integer.parseInt(JOptionPane.showInputDialog("please enter your test mark")));
            objLearner.setexamMark(Integer.parseInt(JOptionPane.showInputDialog("please enter your exam mark")));
            
        
        
        
        }
        
        //Create a method to display final mark 
         
        public static void displayfinalMark(){
          double finalMark = objLearner.finalMark();
          JOptionPane.showInternalMessageDialog(null, "your final markis:"+ finalMark);
        
        
    }
    
}
