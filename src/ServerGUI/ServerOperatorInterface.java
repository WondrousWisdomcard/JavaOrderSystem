package ServerGUI;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.*;

import Database.*;

class ServerOperatorInterface extends JFrame {

	Warehouse wh = new Warehouse();
	CenterPanel cp = new CenterPanel(wh); // 中间显示所有菜
	TopPanel tp = new TopPanel();
	WestPanel wp = new WestPanel(); // 菜系列表
	EastPanel ep = new EastPanel(); // 客户订单接收

	ServerOperatorInterface() {
		setBounds(180, 10, 1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("后台管理");

		Container c = getContentPane();
		c.setLayout(new BorderLayout());// 边缘布局

		String[] s = new String[10];
		s[0] = "pot_bottom";
		s[1] = "meat";
		s[2] = "vegetable";
		s[3] = "snack";
		s[4] = "drink";
		s[5] = "staplefood";
		

		Iterator<String> iter0 = wh.get(s[0]).keySet().iterator();
		Iterator<String> iter1 = wh.get(s[1]).keySet().iterator();
		Iterator<String> iter2 = wh.get(s[2]).keySet().iterator();
		Iterator<String> iter3 = wh.get(s[3]).keySet().iterator();
		Iterator<String> iter4 = wh.get(s[4]).keySet().iterator();
		Iterator<String> iter5 = wh.get(s[5]).keySet().iterator();

		Cuisine cuisine;

		for (int i = 0; i < cp.j0.size; i++) {
			String j = (String) iter0.next();// 对每个菜系页面的具体菜品的展示按钮添加监听
			cuisine = wh.get(s[0]).get(j);
			// cp.j0.mip[i].textBtn.addActionListener(new
			// ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
		}
		for (int i = 0; i < cp.j1.size; i++) {
			String j = (String) iter1.next();
			cuisine = wh.get(s[1]).get(j);
			// cp.j1.mip[i].textBtn.addActionListener(new
			// ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
		}
		for (int i = 0; i < cp.j2.size; i++) {
			String j = (String) iter2.next();
			cuisine = wh.get(s[2]).get(j);
			// cp.j2.mip[i].textBtn.addActionListener(new
			// ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
		}
		for (int i = 0; i < cp.j3.size; i++) {
			String j = (String) iter3.next();
			cuisine = wh.get(s[3]).get(j);
			// cp.j3.mip[i].textBtn.addActionListener(new
			// ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
		}
		for (int i = 0; i < cp.j4.size; i++) {
			String j = (String) iter4.next();
			cuisine = wh.get(s[4]).get(j);
			// cp.j4.mip[i].textBtn.addActionListener(new
			// ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
		}
		for (int i = 0; i < cp.j5.size; i++) {
			String j = (String) iter5.next();
			cuisine = wh.get(s[5]).get(j);
			// cp.j2.mip[i].textBtn.addActionListener(new
			// ImgAction(cuisine.getname(),cuisine.getprice(),cuisine.getID()));
		}
		for (int i = 0; i < wp.getComponentCount(); i++)// 对左栏的按钮添加动作监听
		{
			wp.btns[i].addActionListener(new MyTurnPageActionListener(cp.card, cp));
		}

		
		

		JScrollPane jsCP = new JScrollPane(cp);
		jsCP.setBorder(BorderFactory.createEmptyBorder());
		c.add(jsCP, BorderLayout.CENTER);
		c.add(tp, BorderLayout.NORTH);
		c.add(wp, BorderLayout.WEST);
		c.add(ep, BorderLayout.EAST);
		setVisible(true);
	}

	class MyTurnPageActionListener implements ActionListener {

		CardLayout card;
		JPanel jp;

		MyTurnPageActionListener(CardLayout card, JPanel jp) {
			this.card = card;
			this.jp = jp;

		}

		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton) e.getSource();
			if (jb.getText().equals("   锅 底 类   "))
				card.show(jp, "a0");
			else if (jb.getText().equals("   荤 菜 类   "))
				card.show(jp, "a1");
			else if (jb.getText().equals("   素 菜 类   "))
				card.show(jp, "a2");
			else if (jb.getText().equals("   小 吃 类   "))
				card.show(jp, "a3");
			else if (jb.getText().equals("   酒 水 类   "))
				card.show(jp, "a4");
			else if (jb.getText().equals("   主 食 类   "))
				card.show(jp, "a5");
		}
	}

	public static void main(String[] args) {
		new ServerOperatorInterface();
	}
}
