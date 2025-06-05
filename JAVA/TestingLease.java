import java.util.Scanner;
public class TestingLease{

       public static void getData(Lease lease, Scanner scan, Scanner scan2){
     
          System.out.println("Input Tenants Name: ");
          lease.setName(scan2.nextLine());
          System.out.println("Input Apartment Number: ");
          lease.setNumber(scan.nextInt());
          System.out.println("Input Montly Rent: ");
          lease.setRent(scan.nextDouble());
          System.out.println("Input Term: ");
          lease.setTerm(scan.nextInt());
     }
   
   public static void main(String args []){
   
      Scanner scan = new Scanner(System.in);
      Scanner scan2 = new Scanner(System.in);
      
      Lease lease1 = new Lease();
      Lease lease2 = new Lease();
      Lease lease3 = new Lease();
      Lease lease4 = new Lease();
      
      
      System.out.println("Input Info for L1");
      getData(lease1, scan, scan2);
      System.out.println();
      System.out.println("Input Info for L2");
      getData(lease2, scan, scan2);
      System.out.println();
      System.out.println("Input Info for L3");
      getData(lease3, scan, scan2);
      System.out.println();
      
      
      System.out.println("Lease 1 Info: ");
      lease1.addPetFee();
      lease1.explanationFee();
      lease1.showValue();
      System.out.println();
      System.out.println("Lease 2 Info: ");
      lease2.showValue();
      System.out.println();
      System.out.println("Lease 3 Info: ");
      lease3.showValue();
      System.out.println();
      System.out.println("Lease 4 Info: ");
      lease4.showValue();
      System.out.println();



   }     

}