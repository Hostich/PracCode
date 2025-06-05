public class MenuTwo{

    String foodName;
    int Price;
   
     public MenuTwo(){
      
       foodName = "XXX";
       Price = 1000;
     }

   
      public MenuTwo(String name, int price){
        foodName = name;
        Price = price;
     }
     
     public void setName(String name){
      foodName = name;
     }
      public void setPrice(int price){
      Price = price;
     }
     public String getName(){
      return foodName;
     }
      public double getPrice(){
      return Price;
     }
}

 JButton AdoboButton = new JButton();
    JButton SinigangButton = new JButton();
    JButton KareKareButton = new JButton();
    JButton TinolaButton = new JButton();
    JButton BicolExpressButton = new JButton();
    JButton LaingButton = new JButton();
    JButton PinakbetButton = new JButton();
    JButton RiceButton = new JButton();
    JLabel Adobo = new JLabel();
    JLabel Sinigang = new JLabel();
    JLabel KareKare = new JLabel();
    JLabel Tinola = new JLabel();
    JLabel BicolExpress = new JLabel();
    JLabel Laing = new JLabel();
    JLabel Pinakbet = new JLabel();
    JLabel Rice = new JLabel();
    JButton DoneButton = new JButton();

    MenuLabel() {
    Adobo.setText("Adobo");
    Adobo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    Adobo.setHorizontalAlignment(JLabel.CENTER);
    Adobo.setBounds(0,0,100,100);

    AdoboButton = new JButton("Adobo");
    AdoboButton.setBounds(0,100,100,30);
    AdoboButton.setFocusable(false);
    AdoboButton.addActionListener(this);


    Sinigang.setText("Sinigang");
    Sinigang.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    Sinigang.setHorizontalAlignment(JLabel.CENTER);
    Sinigang.setBounds(105,0,100,100);

    SinigangButton.setText("Sinigang");
    SinigangButton.setBounds(105,100,100,30);
    SinigangButton.setFocusable(false);
    SinigangButton.addActionListener(this);

   
   
    KareKare.setText("Kare-Kare");
    KareKare.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    KareKare.setHorizontalAlignment(JLabel.CENTER);
    KareKare.setBounds(210,0,100,100);

    KareKareButton.setText("Kare-Kare");
    KareKareButton.setFocusable(false);
    KareKareButton.setHorizontalAlignment(JLabel.CENTER);
    KareKareButton.setBounds(210,100,100,30);

  
    Tinola.setText("Tinola");
    Tinola.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    Tinola.setHorizontalAlignment(JLabel.CENTER);
    Tinola.setBounds(315,0,100,100);

    TinolaButton.setText("Tinola");
    TinolaButton.setFocusable(false);
    TinolaButton.setHorizontalAlignment(JLabel.CENTER);
    TinolaButton.setBounds(315, 100, 100, 30);

  
    BicolExpress.setText("Bicol Express");
    BicolExpress.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    BicolExpress.setHorizontalAlignment(JLabel.CENTER);  
    BicolExpress.setBounds(0,200,100,100);
  
    BicolExpressButton.setText("BIcol Express");
    BicolExpressButton.setFocusable(false);
    BicolExpressButton.setHorizontalAlignment(JLabel.CENTER);
    BicolExpressButton.setBounds(0,300,100,30);
  
    Laing.setText("Laing");
    Laing.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    Laing.setHorizontalAlignment(JLabel.CENTER);
    Laing.setBounds(105,200,100,100);

    LaingButton.setText("Lain");
    LaingButton.setFocusable(false);
    LaingButton.setHorizontalAlignment(JLabel.CENTER);
    LaingButton.setBounds(105,300,100,30);

    Pinakbet.setText("Pinakbet");
    Pinakbet.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    Pinakbet.setHorizontalAlignment(JLabel.CENTER);
    Pinakbet.setBounds(210,200,100,100);
     
    PinakbetButton.setText("PinakBet");
    PinakbetButton.setFocusable(false);
    PinakbetButton.setHorizontalAlignment(JLabel.CENTER);
    PinakbetButton.setBounds(210,300,100,30);

    Rice.setText("Rice");
    Rice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    Rice.setHorizontalAlignment(JLabel.CENTER);
    Rice.setBounds(315,200,100,100);

    RiceButton.setText("Rice");
    RiceButton.setFocusable(false);
    RiceButton.setHorizontalAlignment(JLabel.CENTER);
    RiceButton.setBounds(315,300,100,30);
    
    DoneButton.setText("Done");
    DoneButton.setFocusable(false);
    DoneButton.setHorizontalAlignment(JLabel.CENTER);
    DoneButton.setBounds(350, 400, 100, 30);
