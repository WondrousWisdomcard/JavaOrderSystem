package ClientGUI;

import java.awt.*;

import javax.swing.*;

public class TopPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public TopPanel() {
		setLayout(new BorderLayout());
		setBackground(new Color(240,230,140));
		setPreferredSize(new Dimension(1000,100));
		JLabel top = new JLabel("���ǻ�����ϵͳ",JLabel.CENTER);
		top.setFont(new Font("����", Font.BOLD, 55));
		top.setForeground(new Color(139, 0, 0));

		add(top,BorderLayout.CENTER);
	}
}
