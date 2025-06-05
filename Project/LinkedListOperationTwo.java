import java.util.Scanner;
public class LinkedListOperationTwo{
  public static void main(String [] args){
 
    Scanner scan = new Scanner(System.in);
    LinkedListTwo link = new LinkedListTwo();
    int choice = 0;

    
    while(true){
    System.out.println();
    System.out.println("LinkedList Operation");
    System.out.println("1. Insert an Element(Beginning)");
    System.out.println("2. Delete an Element(Beginning)");
    System.out.println("3. Display All Element");
    System.out.println("4. Search an Element");
    System.out.println("5. Delete an Element");
    System.out.println("0. Terminate the Program");
    System.out.println("Input your Choice: ");
    choice = scan.nextInt();     

    switch(choice){
       case 1:
        System.out.println("Insert an Element: ");
        link.insertAtBeginning(scan.nextInt());
         System.out.println();
        break;
      case 2:
        System.out.println("Delete an Element(Beginning)");
        link.deleteBeginning();
        link.display();
         System.out.println();
      break;
      case 3:
       System.out.println("Elements: ");
       link.display();
        System.out.println();
       break;
      case 4:
       System.out.println("Search: ");
       link.search(scan.nextInt());
        System.out.println();
       break;
      case 5:
      System.out.println("Delete from position: ");
      link.delete(scan.nextInt());
      link.display();
      System.out.println();
      break;
      default:
        System.out.println("System Terminated");
       break;

      }
       if(choice == 0){
       break;
     }
    }
    
  
   }      
}
