public class Purchase{
     
      private int inNumber;
      private double Sale, STax;
      
      public Purchase(int num, double sale, double stax){
      
        inNumber = num;
        Sale = sale;
        STax = stax;
      }
      
      public void setNum(int num){
       inNumber = num;
      }
      public void setSale(double sale){
       Sale = sale;
      }
      public void setTax(double stax){
       STax = stax;
      }
      public int getNum(){
       return inNumber;
      }
      public double getSale(){
       return Sale;
      }
      public double getTax(){
       return STax;
      }
      
      public String toString(){
      return "Invoice Number: " + inNumber + ", Sale: " + Sale + ", Sale Tax: " + STax;
      }
}