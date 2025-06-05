import java.util.Scanner;
import java.util.ArrayList;
public class EatAllUwant{
 public static void main(String [] args){
      
      Scanner in = new Scanner(System.in);
      ArrayList<Menu> orderedFood = new ArrayList<>(); 
      int num = 0;
      String name;
      
      
      orderedFood.add(new Menu("Adobo", 30));
      orderedFood.add(new Menu("Chicken", 35));
      orderedFood.add(new Menu("Rice", 10));
      orderedFood.add(new Menu("Lumpia", 5));            
      
      
      while(true){
      
        System.out.println("Input Order: ");
         name = in.next();
              
         boolean found = false;
         for(Menu food : orderedFood){
            if(food.getName().equalsIgnoreCase(name)){
             System.out.println("Price: " + food.Price);
              num +=food.getPrice();
             found = true;
             break;
           }
           System.out.println("ORDERED FOOD: " + food.getName());
         }
         if(name.equalsIgnoreCase("Done")){
           break;
         }
         
       }
        
        System.out.println("PRICE: " + num);
        
      

  }      
}