public class Lining {
      private int line[];
      private int top;

        public Lining(int size){
            line = new int[size];
            top = -1;
        }

        public void push(String name){
            if(top == line.length -1){
                System.out.println("Stack is Full");
            }else{
              top++;
             line[top] = name.length();
            }
        }

        public int pop(){
            if(top == -1){
                System.out.println("Stack is Empty");
                return -1;
            }
            else{
                int popped = line[top];
                top--;
                return popped; 
            }
        }
        public int peek(){
            if(top == -1){
                System.out.println("Stack is Empty");
                return-1;
            }else{
                return line[top];
            }
        
        }
        public boolean isEmpty(){
            return top == -1;
        }
        public String toString(){
            if(top == -1){
                System.out.println("Stack is Empty");
            }
            else{
                System.out.println("Stack Elements are:");
                for(int i = 0; i<= top; i++){
                    System.out.println(line[i] + "");
                }
            }
            System.out.println();
           return "";
        }
}
