package ServerGUI;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.*;

import Database.*;

public class ServerOperatorInterface extends JFrame {

	Warehouse wh = new Warehouse();
	CenterPanel cp = new CenterPanel(wh); // 中间显示所有菜
	TopPanel tp = new TopPanel();
	WestPanel wp = new WestPanel(); // 菜系列表
	EastPanel ep = new EastPanel(); // 客户订单接收
	public TaskItemPanel[] orderForm = new TaskItemPanel[30];

	public void newTask(PurchaseCuisines plist) {

		orderForm[0] = new TaskItemPanel(plist);
		ep.order_list.add(orderForm[0]);// 将任务加入右框
		
		orderForm[0].refuse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				ep.order_list.setVisible(false);

				JDialog result = new JDialog();
				result.setBounds(600, 400, 350, 100);
				result.setLayout(new FlowLayout(1));
				JLabel k = new JLabel();
				k.setFont(new Font("宋体", Font.BOLD, 20));
				k.setText("拒绝成功！");
				result.add(k);
				result.setVisible(true);
				
			}
		});
		orderForm[0].accept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				ep.order_list.setVisible(false);

				for(int k = 0; k < plist.size(); k++){
					String name = plist.get(k).getname();
					int num = plist.get(k).getnum();
					
					Iterator<String> iter0 = wh.get("pot_bottom").keySet().iterator();
					Iterator<String> iter1 = wh.get("meat").keySet().iterator();
					Iterator<String> iter2 = wh.get("vegetable").keySet().iterator();
					Iterator<String> iter3 = wh.get("snack").keySet().iterator();
					Iterator<String> iter4 = wh.get("drink").keySet().iterator();
					Iterator<String> iter5 = wh.get("staplefood").keySet().iterator();

					Cuisine cuisine;
					JDialog result2 = new JDialog();
					result2.setBounds(600, 400, 350, 100);
					result2.setLayout(new FlowLayout(1));
					JLabel k2 = new JLabel();
					k2.setFont(new Font("宋体", Font.BOLD, 20));
					k2.setText(name + "库存不足");
					result2.add(k2);
					result2.setVisible(false);

						for (int i = 0; i < cp.j0.size; i++) {
							String j = (String) iter0.next();
							cuisine = wh.get("pot_bottom").get(j);
							if(cuisine.getname() == name){
								int n = cp.j0.mip[i].capacity - num;
								if(n >= 0){
									cp.j0.mip[i].capacity = n;
									cp.j0.mip[i].capacityTxt.setText(n + "");
								}
								else{
									result2.setVisible(true);
								}
							}
						}
						for (int i = 0; i < cp.j1.size; i++) {
							String j = (String) iter1.next();
							cuisine = wh.get("meat").get(j);
							if(cuisine.getname() == name){
								int n = cp.j1.mip[i].capacity - num;
								if(n >= 0){
									cp.j1.mip[i].capacity = n;
									cp.j1.mip[i].capacityTxt.setText(n + "");
								}
								else{
									result2.setVisible(true);
								}
							}
						}
						for (int i = 0; i < cp.j2.size; i++) {
							String j = (String) iter2.next();
							cuisine = wh.get("vegetable").get(j);
							if(cuisine.getname() == name){
								int n = cp.j2.mip[i].capacity - num;
								if(n >= 0){
									cp.j2.mip[i].capacity = n;
									cp.j2.mip[i].capacityTxt.setText(n + "");
								}
								else{
									result2.setVisible(true);
								}
							}
						}
						for (int i = 0; i < cp.j3.size; i++) {
							String j = (String) iter3.next();
							cuisine = wh.get("snack").get(j);
							if(cuisine.getname() == name){
								int n = cp.j3.mip[i].capacity - num;
								if(n >= 0){
									cp.j3.mip[i].capacity = n;
									cp.j3.mip[i].capacityTxt.setText(n + "");
								}
								else{
									result2.setVisible(true);
								}
							}
						}
						for (int i = 0; i < cp.j4.size; i++) {
							String j = (String) iter4.next();
							cuisine = wh.get("drink").get(j);
							if(cuisine.getname() == name){
								int n = cp.j4.mip[i].capacity - num;
								if(n >= 0){
									cp.j4.mip[i].capacity = n;
									cp.j4.mip[i].capacityTxt.setText(n + "");
								}
								else{
									result2.setVisible(true);
								}
							}
						}
						for (int i = 0; i < cp.j5.size; i++) {
							String j = (String) iter5.next();
							cuisine = wh.get("staplefood").get(j);
							if(cuisine.getname() == name){
								int n = cp.j5.mip[i].capacity - num;
								if(n >= 0){
									cp.j5.mip[i].capacity = n;
									cp.j5.mip[i].capacityTxt.setText(n + "");
								}
								else{
									result2.setVisible(true);
								}
							}
						} 	
				}

				JDialog result = new JDialog();
				result.setBounds(600, 400, 350, 100);
				result.setLayout(new FlowLayout(1));
				JLabel k = new JLabel();
				k.setFont(new Font("宋体", Font.BOLD, 20));
				k.setText("接单成功！");
				result.add(k);
				result.setVisible(true);
				
			}
		});
	}
	
	public ServerOperatorInterface() {
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
		}
		for (int i = 0; i < cp.j1.size; i++) {
			String j = (String) iter1.next();
			cuisine = wh.get(s[1]).get(j);
		}
		for (int i = 0; i < cp.j2.size; i++) {
			String j = (String) iter2.next();
			cuisine = wh.get(s[2]).get(j);
		}
		for (int i = 0; i < cp.j3.size; i++) {
			String j = (String) iter3.next();
			cuisine = wh.get(s[3]).get(j);
		}
		for (int i = 0; i < cp.j4.size; i++) {
			String j = (String) iter4.next();
			cuisine = wh.get(s[4]).get(j);
		}
		for (int i = 0; i < cp.j5.size; i++) {
			String j = (String) iter5.next();
			cuisine = wh.get(s[5]).get(j);
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
		ServerOperatorInterface a = new ServerOperatorInterface();
	}
}
