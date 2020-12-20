package ServerGUI;

import java.awt.*;
import javax.swing.*;

public class MenuItemPanel extends JPanel {

    JButton textBtn = new JButton();
    JPanel Inner2 = new JPanel();
    JButton unSetBtn = new JButton();
    JTextField capacityTxt = new JTextField(4);

    MenuItemPanel(String id, String name, int capacity) {

        setLayout(new BorderLayout());
        Inner2.setLayout(new GridLayout(1, 2));
        textBtn.setText(id + " " + name + "  £”‡:");
        textBtn.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 15));
        textBtn.setBorderPainted(false);
        textBtn.setBackground(new Color(230, 250, 250));
        textBtn.setPreferredSize(new Dimension(210, 70));

        capacityTxt.setText(capacity + "");
        capacityTxt.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 15));

        unSetBtn.setText("Õ£ €");
        unSetBtn.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 15));

        Inner2.add(capacityTxt);
        Inner2.add(unSetBtn);
        Inner2.setPreferredSize(new Dimension(180, 70));
        add(textBtn, BorderLayout.WEST);
        add(Inner2, BorderLayout.EAST);

    }
}
