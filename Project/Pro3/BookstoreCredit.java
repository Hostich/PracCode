public class BookstoreCredit{

   public static void studentDisplay(String name, double grade){
   
      double Credit = grade * 10;
      System.out.println("Name: " + name + " Grade: " + grade + " Credit : " + Credit);
   }
   public static void main(String [] args){
   
   
     studentDisplay("Cayao", 3.2);
   
   }

}