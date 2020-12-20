package ClientGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public TopPanel() {
		setLayout(new FlowLayout());
		setBackground(new Color(255, 215, 0));

		JLabel topC = new JLabel("潮汕火锅点餐系统");
		topC.setFont(new Font("宋体", Font.BOLD, 40));
		topC.setForeground(new Color(139, 0, 0));

		add(topC);
		// add(topE);
		// add(topImg);
	}
}
