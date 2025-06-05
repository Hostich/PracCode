public class spaService{
 
  private String serviceDescription;
  private double price;
  
  public spaService(){
     this("xxx", 0.0);  
   }
  public spaService(String desc, double pr){
    serviceDescription = desc;
    price = pr;
  }
  
  public void setServiceDescription(String service){
    serviceDescription = service;
  }
  public void setPrice(double servicePrice){
   price = servicePrice;
  }

  public String getServiceDescription(){
   return serviceDescription;
  }
  public double getPrice(){
   return price;
  }
}