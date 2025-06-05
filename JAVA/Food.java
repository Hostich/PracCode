public class Food{
   
    private double discount;
    private String name;
    private int price;
    
    
    
      public Food(){
        
         name = "tinola";
         price = 100;
         discount = 5.4; 
        
       }
      
      public Food(String type, int pay, double Dc){
          name = type;
          price = pay;
          discount = Dc;
           }
     public void setType(String type){
          name = type;
      }
      public void setPay(int pay){
         price = pay;
      }
      public void setDc(double Dc){
        discount = Dc;
      }
       public String getType(){
        return name;
      }
      public int getPrice(){
        return price;
      }
      public double getDc(){
        return discount;
      }
}