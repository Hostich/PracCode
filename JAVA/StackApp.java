

public class StackApp{
  private int arr[];
  private int top;
  
   
   public StackApp(int size){
    arr = new int[size];
    top = -1;
   }
   
   public void push(int num){
    if(top == arr.length -1){
     System.out.println("Stack is Full");
    }else{
     top++;
     arr[top] = num;
    }
   }
 
  public int pop(){
    if(top == -1){
     System.out.println("Stack Underflow");
     return -1;
    }
    else{
     int poppedElement  = arr[top];
     arr[top] = -998;
     top--;
     return poppedElement;
    }
  }

  public int peek(){
   if(top == -1){
    System.out.println("Stack is empty");
    return -1;
   }
   else{
    return arr[top];
   }
  }
  
   public boolean isEmpty(){
    return top == -1;
   }
   public void swapTwo(){
     int swap = arr[top];
     arr[top] = arr[top- 1];
     arr[top-1] = swap;
     display();
   }
   
   public void removeElement(int element){
    int index = -1;
    for(int i  = 0; i<= top; i++){
     if(arr[i] == element){
      index = i;
      break;
     }
    }
    if(index == -1){
       System.out.println("Elment not found in the stack");
    }else{
      for (int i = index; i <top; i++) {
            arr[i] = arr[i + 1];
        }
        arr[top] = - 998;
        top--;
      System.out.println("Element Removed Succesfully");
    }
   }
   
   public void display(){
     if(top == -1){
      System.out.println("Stack is Empty");
     }
     else{
      System.out.println("Stack Element: ");
      for(int i = top; i >= 0; i--){
        if(arr[i] != -998){
        System.out.println(arr[i] + " ");
      }
     }
       System.out.println();
     } 
   }
   public static void main(String args[]){
     System.out.println("Initialize a Stack: ");
     StackApp stack = new StackApp(5);
     System.out.println("Is the Stack Empty? " + stack.isEmpty());
     System.out.println("\nInput some elements on the stack: ");
     stack.push(10);
     stack.push(20);
     stack.push(30);
     stack.push(40);
     stack.push(50);
     stack.display();

     System.out.println("\nTop Element of the stack: " + stack.peek());
     System.out.println("\nRemove two element form the stack: ");
     stack.pop();
     stack.pop();
     stack.display();
     System.out.println("\nTop element of the stack after popping: " + stack.peek());
     System.out.println("\nIs the stack empty? " + stack.isEmpty());
     System.out.println("\nElement after Swap");
     stack.swapTwo();
     
     stack.removeElement(10);
     stack.display();

    
   }
}