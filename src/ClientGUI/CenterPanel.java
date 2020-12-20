package ClientGUI;

import java.awt.*;
import java.util.Iterator;

import javax.swing.*;

import Database.*;

public class CenterPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public AlterPanel j0;
	public AlterPanel j1;
	public AlterPanel j2;
	public AlterPanel j3;
	public AlterPanel j4;
	public static CardLayout card = new CardLayout();

	public CenterPanel(Warehouse wh) {
		setLayout(card);
		setPreferredSize(new Dimension(250, 2000));// 强行设置面板大小
		Iterator<String> iter = wh.keySet().iterator();
		String s[] = new String[10];
		for (int i = 0; i < wh.size(); i++) {
			s[i] = (String) iter.next();
		}
		// 传入仓库的分类菜品库
		j0 = new AlterPanel(wh.get(s[0]).size(), wh.get(s[0]));
		j1 = new AlterPanel(wh.get(s[1]).size(), wh.get(s[1]));
		j2 = new AlterPanel(wh.get(s[2]).size(), wh.get(s[2]));
		j3 = new AlterPanel(wh.get(s[3]).size(), wh.get(s[3]));
		j4 = new AlterPanel(wh.get(s[4]).size(), wh.get(s[4]));

		// 添加组件并为组件命名
		add(j0, "a" + 0);
		add(j1, "a" + 1);
		add(j2, "a" + 2);
		add(j3, "a" + 3);
		add(j4, "a" + 4);
	}
}
