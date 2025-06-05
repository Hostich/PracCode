public class Card{

    private final int rank;
    private final int suit;
    
    
     public Card(int rank, int suit){
     
       this.rank = rank;
       this.suit = suit;
     }
          
     public int getRank(){
      return rank;
     }
     public int getSuit(){
      return rank;
     }
     
     public String toString(){
      return  "Rank: " + rank + ", Suit: "+ suit ;
   }
     
   public static void main(String ars []){
   
      Card [] cards = new Card[52];
            
      int index = 0;
      for(int suit = 0; suit <= 3; suit++){
        for(int rank = 1; rank <= 13; rank++){
        
          cards[index] = new Card(rank, suit);
          index++;
        
        }      
      }
      
       for (Card card : cards) {
            System.out.println(card);
        }
   
      
    
      
   }

}