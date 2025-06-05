import javax.swing.JOptionPane;
 public class YummyMotto{
  public static void main(String [] args){  
    
    double hours = 25;
    double rate = 30;
    double yourHoursWorked = 37.5;
    calculateGross(20,20);
    calculateGross(hours,rate);
    calculateGross(yourHoursWorked,hours);
    twoDeclaration();
    calculateInterest(1000.0, 4);
  }
  public static void calculateGross(double hours ,double rate){
   double gross;
   gross = hours * rate;
   System.out.println(hours +"Hours at " + rate + " per hour is " + gross);
  
  }
  public static void twoDeclaration(){
  
   int num1 = 5;
   int num4 = 6;
   int num5 = num1 + num4;
   {
     int num2 = 6;
     num1 = 1;
     System.out.println(" " + num1 + " " + num2);
    }
   System.out.println(num5);
   }
   public static void calculateInterest(double bal, double rate){
    double interest;
    interest = bal * rate;
    System.out.println("interest" + bal + "rate" + rate + "the interest is " + interest);
   }
   public static void calculateInterest(double bal, int rate){
     double interest, percentage;
     percentage = rate/100.0;
     interest = percentage * bal;
     System.out.println("interest" + bal + "rate" + rate + "the interest is " + interest);    
   }
   
}