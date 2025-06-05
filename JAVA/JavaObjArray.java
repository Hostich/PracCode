import java.util.Scanner;
class Account{

    int a;
    int b;
    
    public void setData(int c, int d){
    
      a = c;
      b = d;   
    }
    public void showData(){
      System.out.println("Value of a: " + a);
      System.out.println("Value of b: " + b);
    }
}
 public class JavaObjArray{
   public static void main(String args []){
     Scanner in = new Scanner(System.in);
   
     Account obj[] = new Account[10];
     
      for(int i = 0; i < 10; i++){
      
         obj[i] = new Account();
               
         int a = i + 1;
         int b = i * 3;
         
         obj[i].setData(a,b);
        }
        
        for(int i = 0; i < 10; i++){ 
         obj[i].showData();
      
      }
 
   } 
 }