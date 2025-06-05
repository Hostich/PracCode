import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

   private String Name;
   private int Price;
      

 public Menu(String name, int price){
        foodName = name;
        Price = price;
     }
      public String getName(){
      return foodName;
     }
      public double getPrice(){
      return Price;
     }
}


public class MenuLabel extends JPanel implements ActionListener{
 
     private ArrayList<Menu> orderdFood = new ArrayList<>();
     private JButton[] fooButton;
     
  
     public MenuLabel(){
  
       setLayout(null);
       setPreferredSize(new Dimension(500,500));
       
       String[] foodName = {};
       int[] Price = {};
       
       FButton = new JButton[foodName.length];
       int x, y = 0;
       
       for(int i = 0; i < foodName.length; i++){
       
           FButton[i] = new JButton();
           FButton[i].setFocusable(false);
           FButton[i].set
           FButton[i] 
       }
     }
  }   
       
     
     
  }
  
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == AdoboButton){  
         Adobo.setVisible(true);          
       }
       if(e.getSource() == SinigangButton){
         Sinigang.setVisible(true);
       }
        if(e.getSource() == KareKareButton){
         KareKare.setVisible(true);
       }
       if(e.getSource() == BicolExpressButton){
         BicolExpress.setVisible(true);
       }
        if(e.getSource() == TinolaButton){
          Tinola.setVisible(true);
       }
       if(e.getSource() == LaingButton){
        Laing.setVisible(true);
     }
     if(e.getSource() == PinakbetButton){
        Pinakbet.setVisible(true);
     }
     if(e.getSource() == RiceButton){
        Rice.setVisible(true);
     }
   } 
 }  