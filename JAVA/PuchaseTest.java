import java.util.Scanner;
 public class PuchaseTest{

   public static void main(String ars []){
   
     Scanner in = new Scanner(System.in);
     
       Purchase[] purchase = new Purchase[5];
       
       for (int p = 0; p < 5; p++) {
            int inNumber;
            double Sale, STax;

            do {
                System.out.println(p);
                System.out.println("------------------");
                System.out.println("Enter Invoice Number(800-1000): ");
                inNumber = in.nextInt();
                System.out.println("------------------");
                System.out.println("Enter amount of sale: ");
                Sale = in.nextDouble();
                System.out.println("------------------");
                System.out.println("Enter Sale Tax: ");
                STax = in.nextDouble();
                System.out.println("------------------");
            } while (inNumber < 800 || inNumber > 1000 || Sale < 0);

            purchase[p] = new Purchase(inNumber, Sale, STax);
        }
       System.out.println();      
       System.out.println("Purchase:");
      for(Purchase p : purchase)
       System.out.println(p);
   
   }
 }