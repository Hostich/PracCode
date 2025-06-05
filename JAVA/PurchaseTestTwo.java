import java.util.Scanner;

public class PurchaseTestTwo {

    public static void main(String ars[]) {
        Scanner in = new Scanner(System.in);

        // Create an array of PurchaseTwo objects
        PurchaseTwo[] purchase = new PurchaseTwo[5];

        // Loop to input details for each purchase
        for (int p = 0; p < 5; p++) {
            int inNumber;
            double sale, tax;

            do {
                System.out.println("Enter Invoice Number (800-1000): ");
                inNumber = in.nextInt();
                System.out.println("Enter amount of sale: ");
                sale = in.nextDouble();
                System.out.println("Enter Sale Tax: ");
                tax = in.nextDouble();
            } while (inNumber < 800 || inNumber > 1000 || sale < 0);

            purchase[p] = new PurchaseTwo(inNumber, sale, tax);
        }

        // Display the purchase details
        System.out.println("Purchase Details:");
        for (PurchaseTwo p : purchase)
            p.display();

        in.close();
    }
}

class PurchaseTwo {
    private int inNumber;
    private double Sale, STax;

    // Constructor to initialize the purchase details
    public PurchaseTwo(int num, double sale, double stax) {
        inNumber = num;
        Sale = sale;
        STax = stax;
    }

    // Setter methods
    public void setNum(int num) {
        inNumber = num;
    }

    public void setSale(double sale) {
        Sale = sale;
    }

    public void setTax(double stax) {
        STax = stax;
    }

    // Getter methods
    public int getNum() {
        return inNumber;
    }

    public double getSale() {
        return Sale;
    }

    public double getTax() {
        return STax;
    }

    // Method to display purchase details
    public void display() {
        System.out.println("Invoice Number: " + inNumber);
        System.out.println("Sale: " + Sale);
        System.out.println("Sale Tax: " + STax);
    }
}
