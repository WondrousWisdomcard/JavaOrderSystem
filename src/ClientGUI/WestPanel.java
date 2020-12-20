package ClientGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class WestPanel extends JPanel {
	public JButton b1 = new JButton();
	public JButton b2 = new JButton();
	public JButton b3 = new JButton();
	public JButton b4 = new JButton();
	public JButton b5 = new JButton();
	public JButton[] btns = { b1, b2, b3, b4, b5 };

	public WestPanel() {
		setLayout(new GridLayout(9, 1, 5, 5));
		setBackground(new Color(244, 244, 244));

		b1.setText("   锅 底 类   ");
		b1.setFont(new Font("宋体", Font.BOLD, 25));
		b1.setBorderPainted(true);
		b1.setBackground(new Color(238, 238, 238));
		b1.addFocusListener(new MenuBarAction());

		b2.setText("   小 吃 类   ");
		b2.setFont(new Font("宋体", Font.BOLD, 25));
		b2.setBorderPainted(true);
		b2.setBackground(new Color(238, 238, 238));
		b2.addFocusListener(new MenuBarAction());

		b3.setText("   荤 菜 类   ");
		b3.setFont(new Font("宋体", Font.BOLD, 25));
		b3.setBorderPainted(true);
		b3.setBackground(new Color(238, 238, 238));
		b3.addFocusListener(new MenuBarAction());

		b4.setText("   素 菜 类   ");
		b4.setFont(new Font("宋体", Font.BOLD, 25));
		b4.setBorderPainted(true);
		b4.setBackground(new Color(238, 238, 238));
		b4.addFocusListener(new MenuBarAction());

		b5.setText("   酒 水 类   ");
		b5.setFont(new Font("宋体", Font.BOLD, 25));
		b5.setBorderPainted(true);
		b5.setBackground(new Color(238, 238, 238));
		b5.addFocusListener(new MenuBarAction());

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}// end constructor
}
