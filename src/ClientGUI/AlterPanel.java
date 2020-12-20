package ClientGUI;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import Database.*;

public class AlterPanel extends JPanel {
	public int size = 0;// private �ᱨ��
	public MenuItemPanel[] mip = new MenuItemPanel[30];

	public AlterPanel(int n, HashMap<String, Cuisine> Menu)// nΪ�����Ʒ��
	{
		this.size = n;
		setLayout(new FlowLayout(0));// �����
		setBackground(Color.white);
		Iterator<String> iter = Menu.keySet().iterator();// �Բ�Ʒ��id��Ϊkey������map�����е�key
		setPreferredSize(new Dimension(250, 2000));// ǿ����������С
		for (int i = 0; i < n; i++) {
			String id = (String) iter.next();
			mip[i] = new MenuItemPanel(id, Menu.get(id).getname(), Menu.get(id).getprice(), Menu.get(id).geticon());
			add(mip[i]);
		}
	}
}
