public class Menu{
  public static void main(String [] args){
  
    Sandwich s1;
    
     
    s1 = new Sandwich();
    s1.setIngredient("Burger");
    s1.setType("Bun");
    s1.setPrice(59.0);
   
   
    System.out.println("Food: " + s1.getIngredient());
    System.out.println("Bread: " + s1.getType());
    System.out.println("Pay: " + s1.getPrice());
    
    System.out.println();
    
    Sandwich s2 = s1;
    s1.setIngredient("Pasta");
    s1.setType("Spag");
    s1.setPrice(60.0);

    
    System.out.println("Food: " + s2.getIngredient());
    System.out.println("Bread: " + s2.getType());
    System.out.println("Pay: " + s2.getPrice());
    
    System.out.println();
    
    Sandwich s3 = s1;
    
    s3.setIngredient("Salad");
    s3.setType("Wrap");
    s3.setPrice(50.0);
    
     System.out.println("Food: " + s3.getIngredient());
    System.out.println("Bread: " + s3.getType());
    System.out.println("Pay: " + s3.getPrice());




  
  
  }
}