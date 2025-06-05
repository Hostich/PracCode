class Node{
   int data;
   Node next;
   
   Node(int data){
     this.data = data;
     this.next = null;
   }
}

class LinkedListTwo{
   Node head;
   
   LinkedListTwo(){
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
