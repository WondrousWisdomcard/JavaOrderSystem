package ClientGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuItemPanel extends JPanel {
	JButton imgBtn = new JButton();
	JButton textBtn = new JButton();

	MenuItemPanel(String id, String name, double price, String address) {
		setLayout(new BorderLayout());

		Icon icon = new ImageIcon(address);
		imgBtn.setIcon(icon);
		imgBtn.setBorderPainted(false);
		imgBtn.setBackground(Color.white);

		textBtn.setText(id + "    " + name + "    " + price + "  Ôª");
		textBtn.setFont(new Font("ËÎÌå", Font.BOLD, 14));
		textBtn.setBorderPainted(false);
		textBtn.setBackground(Color.white);

		add(imgBtn, BorderLayout.NORTH);
		add(textBtn, BorderLayout.CENTER);
	}
}
