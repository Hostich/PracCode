import javax.swing.JOptionPane;

 public class Prac{
   public static void main(String args[]){
   
     
     String wageString, dependentsString;
     double wages, weeklypay;
     int dependents;
     final double HOURS_IN_WEEK = 37.5;
     
     wageString = JOptionPane.showInputDialog(null,
     "Enter employee's hourly wage","Salary Dialog 1", JOptionPane.INFORMATION_MESSAGE);
     weeklypay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
     
     dependentsString = JOptionPane.showInputDialog(null,
     "How many dependents?", JOptionPane.QUESTION_MESSAGE);
     dependents = Integer.parseInt(dependentsString);
     JOptionPane.showMessageDialog(null,"Weekly Salary is $" + weeklypay + "\nDeduction will be made for " + dependents + " dependents");
     
     int selection;
     boolean isYes;
     
     selection = JOptionPane.showConfirmDialog(null,"Do you want to quit");
     isYes =(selection == JOptionPane.YES_OPTION);
     JOptionPane.showMessageDialog(null, "Your respond" + isYes);
   
   
   }
 }