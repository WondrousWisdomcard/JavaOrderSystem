package ServerGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel {
	TopPanel() {

		setLayout(new FlowLayout());// top����Ϊ��ʽ����

		setBackground(new Color(255, 202, 24));

		JLabel top = new JLabel("�˵�����ϵͳ", JLabel.CENTER);
		top.setFont(new Font("΢���ź�", Font.BOLD, 40));
		top.setForeground(Color.red);

		add(top);
	}
}
