import java.util.Scanner;
import java.util.ArrayList;
public class EatAllUwantTwo{
 public static void main(String [] args){
      
      Scanner in = new Scanner(System.in);
      ArrayList<MenuTwo> orderedFood = new ArrayList<>(); 
      int num = 0;
      String name;
      
      
      orderedFood.add(new MenuTwo("Adobo", 30));
      orderedFood.add(new MenuTwo("Chicken", 35));
      orderedFood.add(new MenuTwo("Rice", 10));
      orderedFood.add(new MenuTwo("Lumpia", 5));            
      
      
      while(true){
      
        System.out.println("Input Order: ");
         name = in.next();
              
         boolean found = false;
         for(MenuTwo food : orderedFood){
            if(food.getName().equalsIgnoreCase(name)){
             System.out.println("Price: " + food.Price);
              num +=food.getPrice();
             found = true;
             break;
           }
         }
         if(name.equalsIgnoreCase("Done")){
           break;
         }
         
       }
        
        System.out.println("PRICE: " + num);
  }      
}