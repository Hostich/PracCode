import javax.swing.*;

 public class MenuFrame extends JFrame{
  
  MenuFrame(){
   MenuLabel menu = new MenuLabel();
    
   JFrame frame = new JFrame();
   frame.setTitle("MENU");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setVisible(true);
   frame.setSize(440,440);
   frame.setResizable(false);
   frame.setLayout(null);
   frame.add(menu.Adobo);
   frame.add(menu.AdoboButton);
   frame.add(menu.Sinigang);
   frame.add(menu.SinigangButton);
   frame.add(menu.KareKare);
   frame.add(menu.KareKareButton);
   frame.add(menu.Tinola);
   frame.add(menu.TinolaButton);
   frame.add(menu.BicolExpress);
   frame.add(menu.BicolExpressButton);
   frame.add(menu.Laing);
   frame.add(menu.LaingButton);
   frame.add(menu.Pinakbet);
   frame.add(menu.PinakbetButton);
   frame.add(menu.Rice);
   frame.add(menu.RiceButton);
   frame.add(menu.DoneButton);
 }
}
