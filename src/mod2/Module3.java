package mod2;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Module3 {

    public static void main(String[] args) {

        // Main window
        JFrame frame = new JFrame("Module 3 Critical Thinking - UI");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main layout
        JPanel root = new JPanel(new BorderLayout());
        root.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        frame.setContentPane(root);

        // Text box (center)
        JTextArea textBox = new JTextArea();
        textBox.setLineWrap(true);
        textBox.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textBox);
        root.add(scrollPane, BorderLayout.CENTER);

        // Menu bar (top)
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem dateTimeItem = new JMenuItem("Print Date and Time");
        JMenuItem writeToFileItem = new JMenuItem("Save to log.txt");
        JMenuItem changeColorItem = new JMenuItem("Change Window Color to Random Green Color");
        JMenuItem exitItem = new JMenuItem("Exit Program");

        menu.add(dateTimeItem);
        menu.add(writeToFileItem);
        menu.add(changeColorItem);
        menu.add(exitItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // 1. Print date/time
        dateTimeItem.addActionListener(e -> {
            LocalDateTime now = LocalDateTime.now();
            String formatted = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
            textBox.append("Current Date and Time: " + formatted + "\n");
        });

     // 2. Save text box contents to log.txt
        writeToFileItem.addActionListener(e -> {
            try (FileWriter writer = new FileWriter("log.txt", true)) {
                writer.write(textBox.getText() + "\n");
                textBox.append("Saved to log.txt\n");
                textBox.append("Log file path: " + new java.io.File("log.txt").getAbsolutePath() + "\n");
            } catch (IOException ex) {
                textBox.append("Error writing to file.\n");
            }
        });


        // 3. Change background to random green hue
        changeColorItem.addActionListener(e -> {
            Random rand = new Random();
            float hue = (float) ((90 + rand.nextDouble() * 50) / 360.0);
            Color randomGreen = Color.getHSBColor(hue, 0.8f, 0.8f);

            root.setBackground(randomGreen);
            textBox.append("Background changed to hue: " + (hue * 360) + "\n");
        });

        // 4. Exit program
        exitItem.addActionListener(e -> frame.dispose());

        frame.setVisible(true);
    }
}
