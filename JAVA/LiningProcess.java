import java.util.Scanner;

public class LiningProcess {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Lining Line = new Lining(30);
    Line.push("John");
    Line.push("Doe");
    Line.push("Jane");
    Line.push("Joe");
   
    System.out.println("Menu: ");
    System.out.println("1. Add Member");
    System.out.println("2. Remove Member");
    System.out.println("3. Display Member");
    System.out.println("4. Exit");
    System.out.println("Enter Choice: ");
    int choice = sc.nextInt();
    
    switch (choice) {
        case 1:
          while(true){
            System.out.println("Enter Member: ");
             String name = sc.next();
              System.out.println("Type 'NO' to Exit ");
             if(name.equals("Yes")){
                continue;
             }else if(name.equals("No")){
                break;
             }
              Line.push(name);
          }
         break;
         case 2:
          System.out.println("Enter Member to Remove: ");
          String name = sc.next();
          Line.pop();
          break;
         case 3:
          Line.toString();
          break;   
        
     }
  }
}

