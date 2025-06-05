import java.util.Scanner;
/**
 * Create a two dimensional menu selection
 * for the produce section of a grocery store.
 * Allow the user to select an item and get the
 * total price for all of the selected items.
 * 
 * @author Maria Kalusz
 * @version Week 1 Exercise 2 
 */
public class Menuthree {
	/**
	 * Total price of the selected items.
	 */
	private double total;
	
	/**
	 * Print the main menu.
	 */
	public void printMainMenu() {
		System.out.println("Produce Menu");
		System.out.println("\tF Fruit");
		System.out.println("\tV Vegetable");
		System.out.println("\tH Help");
		System.out.println("\tQ Quit");
		System.out.println("\tC Checkout");
		System.out.print("Select an item from the menu: ");
	}
	
	/**
	 * Print the vegetable menu.
	 */
	public void printVegMenu() {
		System.out.println("Vegetable Menu");
		System.out.println("\tK Kale");
		System.out.println("\tS Spinach");
		System.out.println("\tC Celery");
		System.out.println("\tX Previous Menu/Checkout");
		System.out.print("Select an item from the menu: ");
	}
	
	/**
	 * Print the fruit menu.
	 */
	public void printFruitMenu() {
		System.out.println("Fruit Menu");
		System.out.println("\tA Apple");
		System.out.println("\tB Banana");
		System.out.println("\tP Pear");
		System.out.println("\tX Previous Menu");
		System.out.print("Select an item from the menu: ");
	}
	
	/**
	 * Print the total price.
	 * @param total the total price
	 */
	public void printTotal(double total) {
		System.out.format("Your total is $%.2f.\n", total);
	}
	
	/**
	 * Print the user input to get the quantity.
	 */
	public void printQty() {
		System.out.print("Enter the amount you want: ");
	}
	
	/**
	 * Add the selected items to the cart and 
	 * get the price of them.
	 * 
	 * @param s the user input
	 * @param quantity the amount they want
	 * @return price the price of the item and quantity
	 */
	public double addToCart(String s, int quantity) {
		double price;
		if(s.equalsIgnoreCase("A")) {
			price = .5;
		} else if (s.equalsIgnoreCase("B")) {
			price = .3;
		} else if (s.equalsIgnoreCase("P")) {
			price = .75;
		} else if(s.equalsIgnoreCase("K")) {
			price = 2.5;
		} else if (s.equalsIgnoreCase("S")) {
			price = 3;
		} else if (s.equalsIgnoreCase("C")) {
			price = 2;
		} else {
			price = 0;
		}
		price*=quantity;
		return price;
	}
	
	/**
	 * The the sequence of the menu via the
	 * user input.
	 */
	public void runMenu() {
		Scanner scan = new Scanner(System.in);
		String s;
		char c;
		double price;
		
	    printMainMenu();
	    
	    s = scan.next();
	    c = s.charAt(0);	
	    if (Character.isDigit(c)) {
	    		scan.close();
	    		throw new IllegalArgumentException("Input cannot be a number.");
	    }
	    total = 0;
		price = 0;
		int quantity;
		do {
			switch (c) {
				case 'F': System.out.println("You selected the fruit menu.");
						  printFruitMenu();
						  s = scan.next();		
						
						  do {
							  Scanner scanQ = new Scanner(System.in);
							  
							  if (s.equalsIgnoreCase("A")) {
								  System.out.println("You selected an apple -- $.50/each");							   
							  } else if (s.equalsIgnoreCase("B")) {
								  System.out.println("You selected a banana -- $.30/each");								 
							  } else if (s.equalsIgnoreCase("P")) {
								  System.out.println("You selected a pear -- $.75/each");								 
							  } else if (s.equalsIgnoreCase("X")) {
								  break;
							  } else {
								  System.out.println("Invalid input. Please enter an item from "
								  		           + "the menu.");
								  printFruitMenu();
								  s = scan.next(); 
								  while(!s.equalsIgnoreCase("A") && !s.equalsIgnoreCase("B") && 
										!s.equalsIgnoreCase("P") && !s.equalsIgnoreCase("X")) {
									  System.out.println("Invalid input. Please enter an item from "
							  		                   + "the menu.");
									  printFruitMenu();
									  s = scan.next();
								  }
							  }
							  printQty();
							  try {
								  quantity = scanQ.nextInt();
							  } catch(java.util.InputMismatchException e) {
								  System.out.println("Entry must be a whole number. Try again.");
								  quantity = 0;
							  }
							  price = addToCart(s, quantity);	
						      total+=price;
						      printTotal(total);	  
							  
							  printFruitMenu();
							  s = scan.next();
							  
						  } while (!s.equalsIgnoreCase("X"));
						  System.out.println("Welcome back to the main menu.");
						  printMainMenu();
						  break;
				case 'V': System.out.println("You selected the vegatable menu.");
				  		  printVegMenu();
				  		  s = scan.next();		
				  		  do {
				  			  Scanner scanQ = new Scanner(System.in);
					  
				  			  if (s.equalsIgnoreCase("K")) {
				  				  System.out.println("You selected kale -- $2.50/bunch");							   
				  			  } else if (s.equalsIgnoreCase("S")) {
				  				  System.out.println("You selected spinach -- $3.00/bunch");								 
				  			  } else if (s.equalsIgnoreCase("C")) {
				  				  System.out.println("You selected celery -- $2.00/bunch");								 
				  			  } else if (s.equalsIgnoreCase("X")) {
				  				  break;
				  			  } else {
				  				  System.out.println("Invalid input. Please enter an item from "
						  		           + "the menu.");
				  				  printVegMenu();
				  				  s = scan.next(); 
				  				  while(!s.equalsIgnoreCase("K") && !s.equalsIgnoreCase("S") && 
				  						!s.equalsIgnoreCase("C") && !s.equalsIgnoreCase("X")) {
				  					  		System.out.println("Invalid input. Please enter an item from "
					  		                   		 		 + "the menu.");
				  					  		printVegMenu();
				  					  		s = scan.next();
				  				  }
				  			  }
				  			  printQty();
				  			  try {
				  				  quantity = scanQ.nextInt();
				  			  } catch(java.util.InputMismatchException e) {
				  				  System.out.println("Entry must be a whole number. Try again.");
				  				  quantity = 0;
				  			  }
				  			  price = addToCart(s, quantity);	
				  			  total+=price;
				  			  printTotal(total);	  
					  
				  			  printVegMenu();
				  			  s = scan.next();
					  
				  		  } while (!s.equalsIgnoreCase("X"));
				  		  System.out.println("Welcome back to the main menu.");
				  		  printMainMenu();
				  		  break;
				case 'H': System.out.println("Help Menu");
						  System.out.println("Enter the letter of the "
						  				   + "item you desire in the menu below.");
						  printMainMenu();
				  		  break;
				case 'C': printTotal(total);
						  System.out.println("Thank you for your purchase. Goodbye.");
						  break;
						  
				case 'Q': System.out.println("Thank you for visiting. Goodbye.");
						  break;
						 
				
				default: System.out.println("Invalid entry. Please select an item on the menu."
										  + " Entry must be in caps.");
						 printMainMenu();
						 break;
			}
			s = scan.next();
			c = s.charAt(0);
			if (Character.isDigit(c)) {
	    			scan.close();
	    			throw new IllegalArgumentException("Input cannot be a number.");
			}
		} while (c != 'Q' && c != 'C');
		
		if (c == 'Q') {
			System.out.println("Thank you for visiting. Goodbye.");
		} else if (c == 'C') {
			printTotal(total);
			System.out.println("Thank you for your purchase. Goodbye.");
		}
		
		scan.close();
	}
	
	/**
	 * Create a class object to run the program.
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Menuthree go = new Menuthree();
		go.runMenu();
	}
	
}