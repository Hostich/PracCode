public class  BaseBallPlayer{
  private static int CountOfPlayers = 0;
  private int number;
  private double battingAvarages;
  private final int DATE_OF_ENTER;
  
  public BaseBallPlayer(int id, double avg, int date){
   number = id;
   battingAvarages = avg;
   CountOfPlayers = CountOfPlayers + 1;
   DATE_OF_ENTER = date;
  }
  
  public void ShowPlayer(){
   System.out.println("PLayer#: " + number + " Batting Average: " + battingAvarages + " there are " + CountOfPlayers + " players" + " Date Of Player Entering the Club: " + DATE_OF_ENTER);
  
  }

}