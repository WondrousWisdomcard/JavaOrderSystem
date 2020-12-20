package ClientGUI;

import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.*;

import Database.*;

public class CenterPanel extends JPanel {

	public AlterPanel j0;
	public AlterPanel j1;
	public AlterPanel j2;
	public AlterPanel j3;
	public AlterPanel j4;
	public static CardLayout card = new CardLayout();

	public CenterPanel(Warehouse wh) {
		setLayout(card);
		setPreferredSize(new Dimension(250, 2000));// ǿ����������С
		Iterator<String> iter = wh.keySet().iterator();
		String s[] = new String[10];
		for (int i = 0; i < wh.size(); i++) {
			s[i] = (String) iter.next();
		}
		j0 = new AlterPanel(wh.get(s[0]).size(), wh.get(s[0]));// ����ֿ�ķ����Ʒ��
		j1 = new AlterPanel(wh.get(s[1]).size(), wh.get(s[1]));// ����ֿ�ķ����Ʒ��
		j2 = new AlterPanel(wh.get(s[2]).size(), wh.get(s[2]));// ����ֿ�ķ����Ʒ��
		j3 = new AlterPanel(wh.get(s[3]).size(), wh.get(s[3]));// ����ֿ�ķ����Ʒ��
		j4 = new AlterPanel(wh.get(s[4]).size(), wh.get(s[4]));// ����ֿ�ķ����Ʒ��
		add(j0, "a" + 0);// ��������Ϊ�������
		add(j1, "a" + 1);// ��������Ϊ�������
		add(j2, "a" + 2);// ��������Ϊ�������
		add(j3, "a" + 3);// ��������Ϊ�������
		add(j4, "a" + 4);// ��������Ϊ�������
	}
}
