import java.util.Scanner;
 public class CreateSpaService{
   public static void main(String [] args){

     spaService firstService = new spaService();
     //spaService secondService = new spaService();
     spaService thirdService = new spaService("facila",22.99);
     
     firstService = getData(firstService);
     //secondService = getData(secondService);
    
     
     System.out.println("First Service details: ");
     System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
     
     System.out.println("Third Service details: ");
     System.out.println(thirdService.getServiceDescription() + " $" + thirdService.getPrice());

     }
    
     
   public static spaService getData(spaService service){  
    
     Scanner keyboard = new Scanner(System.in);
     double price;
     String serviceDescription;
     
     System.out.println("Enter Service >> ");
     serviceDescription = keyboard.next();
     System.out.println("Enter Price >> ");
     price = keyboard.nextDouble();
     service.setServiceDescription(serviceDescription);
     service.setPrice(price);
      return service;
     }    
}