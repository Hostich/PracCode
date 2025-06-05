public class Sandwich{
    private String mainIngredient;
    private String breadType;
    private double Price;
    
     //Default Constructor
      public Sandwich(){
      }
        
    //Setters and getters
     public void setIngredient(String main){
       mainIngredient = main;
     }
     public void setType(String bread){
       breadType = bread;
     }
     public void setPrice(double pay){
       Price = pay;
     }
     
     public String getIngredient(){
      return mainIngredient;
     }
     public String getType(){
      return breadType;
     }
     public double getPrice(){
      return Price;
     }
}