import java.util.Scanner;
  public class EmployeeMnt {
    public static void main(String[] args) {
        Employee [] employees = new Employee[100];
       Scanner scan = new Scanner(System.in);
       int empnum = 0;

       while(true){

         System.out.println("\nMENU");
         System.out.println("1. Add Employee");
         System.out.println("2. Display Employee");
         System.out.println("3. Display Employee Reverse");
         System.out.println("0. Exit Program");
         System.out.print("Enter your choice: ");
         int num = scan.nextInt();

          switch (num) {
            case 1:
              if(empnum < 100){
                System.out.print("Enter Employee Number: ");
                int empNum = scan.nextInt();
                System.out.print("Enter First Name: ");
                String Fname = scan.next();
                System.out.print("Enter Last Name: ");
                String Lname = scan.next();
                System.out.print("Enter Department: ");
                String Dept = scan.next();
                System.out.print("Enter Position: ");
                String Position = scan.next();
                employees[empnum] = new Employee(empNum, Fname, Lname, Dept, Position);
                empnum++;
                System.out.println("Employee added successfully!");
                }else{
                    System.out.println("Employee limit reached!");
                }
                break;
            case 2:
                if(empnum == 0){
                  System.out.println("No Employee to display!");
                }else{
                    for(int i = 0; i < empnum; i++){
                        employees[i].displayEmployee();
                    }
                }
                break;
                case 3:
                if(empnum == 0){
                  System.out.println("No Employee to display!");
                }else{
                    for(int i = empnum-1; i >= 0; i--){
                        employees[i].displayEmployee();
                    }
                }
                break;
            default:
                System.out.println("Program terminated!");
                break;
          }
           if (num == 0) {
             break;
           }

       }

    }
}
