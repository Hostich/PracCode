public class Employee{
    
      private int empNum;
      private String Fname;
      private String Lname;
      private String Dept;
      private String Position;


    public Employee(int emp, String fname, String lname, String dept, String position) {
        empNum = emp;
        Fname = fname;
        Lname = lname;
        Dept = dept;
        Position = position;
    }
      public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }
    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int emp) {
        empNum = emp;
    }
    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }
    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
    public String getPosition() {
        return Position;
    }
    public void setPosition(String position) {
        Position = position;
    }
    public void displayEmployee(){
        System.out.println("Employee Number: " + empNum);
        System.out.println("First Name: " + Fname);
        System.out.println("Last Name: " + Lname);
        System.out.println("Department: " + Dept);
        System.out.println("Position: " + Position);
    }
}