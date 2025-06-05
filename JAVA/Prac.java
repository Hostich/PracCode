import java.util.Scanner;
public class Prac{
  public static void main(String [] args){
  
     Scanner scan = new Scanner(System.in);

     Food f1 = new Food();
     //Food f2 = new Food();
     
 
     
     
     System.out.print("Name of The Food: ");
     f1.setType(scan.nextLine());
     System.out.print("Price: ");
     f1.setPay(scan.nextInt());
     
     System.out.println();
          
     
     System.out.println("Food: " + f1.getType());
     System.out.println("Price: " + f1.getPrice());
    System.out.println("Discount: " + f1.getDc());
  
     System.out.println();
     
     //System.out.println("Food: " + f2.getType());
    //System.out.println("Price: " + f2.getPrice());
   // System.out.println("Discount: " + f2.getDc());
     
      
     
     
  }
}
