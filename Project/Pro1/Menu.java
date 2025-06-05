public class Menu{

   private String foodName;
   int Price;
   
     public Menu(){
      
       foodName = "XXX";
       Price = 1000;
     }
     
   
      public Menu(String name, int price){
        foodName = name;
        Price = price;
     }
     
     public void setName(String name){
      foodName = name;
     }
      public void setPrice(int price){
      Price = price;
     }
     public String getName(){
      return foodName;
     }
      public double getPrice(){
      return Price;
     }
}