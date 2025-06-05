public class NumbersDemo{
  
   public static void displayTwiceTheNumber(int a, int b){
     a =  a * 2;
     b = b * 2;
      System.out.println("A: " + a + " B: " + b);
   }
   public static void displayNumberPlusFive(int c, int d){
     c = c + 5;
     d = d + 5;
     System.out.println("C: " + c + " D: " + d);
   
   }
   public static void displayNumberSquared(int e, int f){
      e = e * e;
      f = f * f;
      System.out.println("E: " + e + " F: " + f);
   }
   
   public static void main(String [] args){
     BookstoreCredit book = new BookstoreCredit(); 
      
      displayTwiceTheNumber(5,5);
      displayNumberPlusFive(10,10);
      displayNumberSquared(20,20);
      book.studentDisplay("Cayao", 3.2);
   
   }
}