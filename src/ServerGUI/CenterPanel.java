package ServerGUI;

import java.awt.*;
import java.util.Iterator;
import javax.swing.*;
import Database.*;

public class CenterPanel extends JPanel {

	AlterPanel j0;
	AlterPanel j1;
	AlterPanel j2;
	AlterPanel j3;
	AlterPanel j4;

	static CardLayout card = new CardLayout();

	public CenterPanel(Warehouse wh) {
		setLayout(card);
		Iterator<String> iter = wh.keySet().iterator();
		String s[] = new String[10];
		for (int i = 0; i < wh.size(); i++) {
			s[i] = (String) iter.next();
		}

		j0 = new AlterPanel(wh.get(s[0]).size(), wh.get(s[0]));
		j1 = new AlterPanel(wh.get(s[1]).size(), wh.get(s[1]));
		j2 = new AlterPanel(wh.get(s[2]).size(), wh.get(s[2]));
		j3 = new AlterPanel(wh.get(s[3]).size(), wh.get(s[3]));
		j4 = new AlterPanel(wh.get(s[4]).size(), wh.get(s[4]));

		add(j0, "a" + 0);
		add(j1, "a" + 1);
		add(j2, "a" + 2);
		add(j3, "a" + 3);
		add(j4, "a" + 4);
	}
}
