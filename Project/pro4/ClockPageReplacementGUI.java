import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ClockPageReplacementGUI extends JFrame {
    private JTextField framesField, pagesField;
    private JTextArea outputArea;
    private JButton executeButton;
    private JTable resultTable;
    private DefaultTableModel tableModel;

    public ClockPageReplacementGUI() {
        setTitle("Clock Page Replacement Algorithm");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Number of Frames:"));
        framesField = new JTextField();
        inputPanel.add(framesField);

        inputPanel.add(new JLabel("Page Reference String (space-separated):"));
        pagesField = new JTextField();
        inputPanel.add(pagesField);

        executeButton = new JButton("Execute");
        inputPanel.add(executeButton);

        // Table Setup
        String[] columnNames = {"Step", "Page Request", "Page Frame State", "Reference Bits", "Page Fault"};
        tableModel = new DefaultTableModel(columnNames, 0);
        resultTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(resultTable);

        // Add components to frame
        add(inputPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);

        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeAlgorithm();
            }
        });
    }

    private void executeAlgorithm() {
        try {
            int frames = Integer.parseInt(framesField.getText());
            String[] pageStrings = pagesField.getText().split(" ");
            int[] pages = Arrays.stream(pageStrings).mapToInt(Integer::parseInt).toArray();

            ClockPageReplacement clock = new ClockPageReplacement(frames, tableModel);
            int faults = clock.execute(pages);

            JOptionPane.showMessageDialog(this, "Total Page Faults: " + faults);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClockPageReplacementGUI().setVisible(true));
    }
}

// Clock Page Replacement algorithm class
class ClockPageReplacement {
    private int frames;
    private int[] pageFrame;
    private boolean[] referenceBit;
    private int pointer;
    private DefaultTableModel tableModel;

    public ClockPageReplacement(int frames, DefaultTableModel tableModel) {
        this.frames = frames;
        this.pageFrame = new int[frames];
        this.referenceBit = new boolean[frames];
        this.pointer = 0;
        this.tableModel = tableModel;
        Arrays.fill(pageFrame, -1); // Initialize frame with -1 (empty)
    }

    public int execute(int[] pages) {
        int pageFaults = 0;
        tableModel.setRowCount(0); // Clear previous table data

        for (int step = 0; step < pages.length; step++) {
            int page = pages[step];
            boolean pageFault = !isPageInFrame(page);
            if (pageFault) {
                pageFaults++;
                replacePage(page);
            }
            addTableRow(step + 1, page, pageFault);
        }
        return pageFaults;
    }

    private boolean isPageInFrame(int page) {
        for (int i = 0; i < frames; i++) {
            if (pageFrame[i] == page) {
                referenceBit[i] = true;
                return true;
            }
        }
        return false;
    }

    private void replacePage(int page) {
        while (true) {
            if (!referenceBit[pointer]) {
                pageFrame[pointer] = page;
                referenceBit[pointer] = true;
                pointer = (pointer + 1) % frames;
                break;
            } else {
                referenceBit[pointer] = false;
                pointer = (pointer + 1) % frames;
            }
        }
    }

    private void addTableRow(int step, int page, boolean pageFault) {
        String frameState = Arrays.toString(pageFrame);
        String refBits = Arrays.toString(referenceBit);
        tableModel.addRow(new Object[]{step, page, frameState, refBits, pageFault ? "Yes" : "No"});
    }
}