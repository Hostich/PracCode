import java.util.Scanner;
 class Calcu{
   public static void main(String args[]){
   
     Scanner scan = new Scanner(System.in);
         
     System.out.println("Enter First Number");
     int fnum = scan.nextInt();
 
     System.out.println("Choose An Operator");
     System.out.println("1. +");
     System.out.println("2. -");
     System.out.println("3. *");
     System.out.println("4. /");
     System.out.println("Input: ");
     int op = scan.nextInt();
       
     System.out.println("Enter Last Number");
     int lnum = scan.nextInt(); 
     
     int result =0;
     
     switch(op){
       case 1:
        result = fnum + lnum;
        break;
       case 2:
        result = fnum - lnum;
        break;
       case 3:
        result = fnum * lnum;
        break;
       case 4:
       result = fnum / lnum;
       break;
     }
     
     System.out.println("Result: " + result);

     
   
   
   }

}