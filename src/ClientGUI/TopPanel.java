package ClientGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel {
	public TopPanel() {
		setLayout(new FlowLayout());// top设置为流式布局

		// JLabel topImg=new JLabel();
		// Icon icon=new ImageIcon("src/internalFrame/top.png/");
		// topImg.setIcon(icon);

		setBackground(new Color(255, 202, 24));

		JLabel topC = new JLabel("潮汕火锅点餐系统");
		topC.setFont(new Font("宋体", Font.BOLD, 40));
		topC.setForeground(Color.red);

		add(topC);
		// add(topE);
		// add(topImg);
	}
}
