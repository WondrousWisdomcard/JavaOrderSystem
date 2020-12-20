package Server;

import java.awt.*;
import javax.swing.*;

public class MenuItemPanel extends JPanel {

    JButton textBtn = new JButton();
    JPanel Inner2 = new JPanel();
    JButton unSetBtn = new JButton();
    JTextField capacityTxt = new JTextField(4);
    
	MenuItemPanel(String id,String name,int capacity){
        setLayout(new GridLayout(1,2));
        Inner2.setLayout(new GridLayout(1,2));

		textBtn.setText(id + "  " + name + "   " + " £”‡:");
		textBtn.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 15));
		textBtn.setBorderPainted(false);
        textBtn.setBackground(Color.white);
        
        capacityTxt.setText(capacity+ " ");
        capacityTxt.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 15));

        unSetBtn.setText("Õ£ €");
        unSetBtn.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 15));

        Inner2.add(capacityTxt);
        Inner2.add(unSetBtn);
        add(textBtn);
        add(Inner2);
	}
}

