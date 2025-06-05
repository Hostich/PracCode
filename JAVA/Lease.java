public class Lease{

    private String TenantsName;
    private int AptNumber;
    private double MonthlyRent;
    private int Term;
    
    
    public Lease(){
       TenantsName = "XXX";
       AptNumber = 0;
       MonthlyRent = 1000.0;
       Term = 12;
    }
    
    public void setName(String name){
      TenantsName = name;
    }
    public void setNumber(int number){
     AptNumber = number;
    }
    public void setRent(double rent){
     MonthlyRent = rent;
    }
    public void setTerm(int term){
     Term = term;
    }
    public String getName(){
     return TenantsName;
    }
    public int getNumber(){
     return AptNumber;
    }
    public double getRent(){
     return MonthlyRent;
    }
    public int getTerm(){
     return Term;
    }
    
    public void addPetFee(){
     MonthlyRent += 10;
    }
    public static void explanationFee(){
     System.out.println("Additional Fee $10 for pet");
    }
    
    public void showValue(){
      System.out.println("Tenants Name: " + TenantsName);
      System.out.println("Apartment Number: " + AptNumber);
      System.out.println("Monthly Rent: " + MonthlyRent);
      System.out.println("Term of the Lease: " + Term);
    }
}