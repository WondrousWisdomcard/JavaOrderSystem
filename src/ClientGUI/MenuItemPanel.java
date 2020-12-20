package ClientGUI;

import java.awt.*;
import javax.swing.*;

public class MenuItemPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	JButton imgBtn = new JButton();
	JButton textBtn = new JButton();

	MenuItemPanel(String id, String name, double price, String address) {
		setLayout(new BorderLayout());

		Icon icon = new ImageIcon(address);
		imgBtn.setIcon(icon);
		imgBtn.setBorderPainted(false);
		imgBtn.setBackground(Color.white);

		textBtn.setText(id + "    " + name + "    " + price + "Ԫ");
		textBtn.setFont(new Font("����", Font.BOLD, 15));
		textBtn.setBorderPainted(false);
		textBtn.setBackground(Color.white);

		add(imgBtn, BorderLayout.NORTH);
		add(textBtn, BorderLayout.CENTER);
	}
}