package ServerGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel {
	TopPanel() {

		setLayout(new FlowLayout());// top设置为流式布局

		setBackground(new Color(255, 202, 24));

		JLabel top = new JLabel("菜单管理系统", JLabel.CENTER);
		top.setFont(new Font("微软雅黑", Font.BOLD, 40));
		top.setForeground(Color.red);

		add(top);
	}
}
