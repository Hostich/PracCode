import java.util.Scanner;
class Node {
   int data;
   Node next;
   
   Node(int data){
     this.data = data;
     this.next = null;
   }
}

class LinkedList{
   Node head;
   
   LinkedList(){
     this.head = null; 
   }
   public void insertAtBeginning(int data){
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
   }
   public void deleteBeginning(){
     if(head == null){
       return;
     }
     head = head.next; 
   }
  public void search(int target){
    Node current = head;
    while(current != null){
      if(current.data == target){
        System.out.println("Search Found " + target);
        return;
      }
      current = current.next;
     }
  }
   public void display(){
     Node current = head;
     if(current != null){
     while(current != null){
         System.out.print(current.data + "-> ");
       current = current.next;
      }
     }else{
      System.out.println("None");
   }
 }

  public void delete(int position){
    if (head == null) {
        System.out.println("List is empty");
    }

    if (position == 0) {
        head = head.next;
        return;
    }

    Node current = head;
    for (int i = 0; i < position-1; i++) {
        if (current.next == null) {
            System.out.println("Position out of range");
        }
        current = current.next;
    }

    if (current.next == null) {
        System.out.println("Position out of range");
    }

    current.next = current.next.next;
  
   }
 }

 public class LinkedListOperation{
  public static void main(String [] args){
 
    Scanner scan = new Scanner(System.in);
    LinkedList link = new LinkedList();
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
