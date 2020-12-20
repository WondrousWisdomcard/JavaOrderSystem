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

		textBtn.setText(id + "  " + name + "   " + "ʣ��:");
		textBtn.setFont(new Font("΢���ź�", Font.BOLD, 15));
		textBtn.setBorderPainted(false);
        textBtn.setBackground(Color.white);
        
        capacityTxt.setText(capacity+ " ");
        capacityTxt.setFont(new Font("΢���ź�", Font.BOLD, 15));

        unSetBtn.setText("ͣ��");
        unSetBtn.setFont(new Font("΢���ź�", Font.BOLD, 15));

        Inner2.add(capacityTxt);
        Inner2.add(unSetBtn);
        add(textBtn);
        add(Inner2);
	}
}

