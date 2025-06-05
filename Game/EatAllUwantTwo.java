import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class MenuLabel extends JPanel implements ActionListener {
    private ArrayList<MenuItem> orderedFood = new ArrayList<>();
    private JLabel totalLabel;
    private JButton[] foodButtons;

    public MenuLabel() {
        setLayout(null);
        setPreferredSize(new Dimension(440, 500));
        
        String[] foodNames = {"Adobo", "Sinigang", "Kare-Kare", "Tinola", "Bicol Express", "Laing", "Pinakbet", "Rice"};
        int[] prices = {30, 35, 40, 25, 50, 30, 20, 10};
        
        foodButtons = new JButton[foodNames.length];
        
        int x = 0, y = 0;
        for (int i = 0; i < foodNames.length; i++) {
            JLabel foodLabel = new JLabel(foodNames[i], SwingConstants.CENTER);
            foodLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            foodLabel.setBounds(x, y, 100, 50);
            add(foodLabel);
            
            foodButtons[i] = new JButton("Order");
            foodButtons[i].setBounds(x, y + 50, 100, 30);
            foodButtons[i].addActionListener(this);
            foodButtons[i].setActionCommand(foodNames[i] + "," + prices[i]);
            foodButtons[i].setFocusable(false);
            add(foodButtons[i]);
            
            x += 110;
            if (x >= 440) {
                x = 0;
                y += 90;
            }
        }
        
        JButton doneButton = new JButton("Done");
        doneButton.setBounds(170, 400, 100, 30);
        doneButton.addActionListener(this);
        doneButton.setActionCommand("Done");
        doneButton.setFocusable(false);
        add(doneButton);
        
        totalLabel = new JLabel("Total: 0", SwingConstants.CENTER);
        totalLabel.setBounds(150, 450, 140, 30);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 14));
        totalLabel.setFocusable(false);
        add(totalLabel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.equals("Done")) {
            int total = orderedFood.stream().mapToInt(MenuItem::getPrice).sum();
            JOptionPane.showMessageDialog(this, "Total Price: " + total, "ORDER", JOptionPane.INFORMATION_MESSAGE);
            resetOrder();
        } else {
            String[] parts = command.split(",");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            orderedFood.add(new MenuItem(name, price));
            updateTotal();
        }
    }
    
    private void updateTotal() {
        int total = orderedFood.stream().mapToInt(MenuItem::getPrice).sum();
        totalLabel.setText("Total: " + total);
    }
    
    private void resetOrder() {
        orderedFood.clear();
        updateTotal();
    }
}

class MenuFrame extends JFrame {
    public MenuFrame() {
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(460, 550);
        setResizable(false);
        
        MenuLabel menuPanel = new MenuLabel();
        add(menuPanel);
        
        setVisible(true);
    }
}

public class EatAllUwantTwo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuFrame::new);
    }
}
