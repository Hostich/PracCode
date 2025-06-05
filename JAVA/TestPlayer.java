public class TestPlayer{
  public static void main(String args[]){
  
   BaseBallPlayer  aCatcher = new BaseBallPlayer(12, .218, 2004);
   aCatcher.ShowPlayer();
  
   BaseBallPlayer anOut = new BaseBallPlayer(44, .511, 2006);
   anOut.ShowPlayer();
   aCatcher.ShowPlayer();
   
   BaseBallPlayer shortStop = new BaseBallPlayer(31, .215, 1924);
     shortStop.ShowPlayer();
      anOut.ShowPlayer(); 

     
  
  }
}