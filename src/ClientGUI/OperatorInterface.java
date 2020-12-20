package ClientGUI;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.*;

import Database.*;

class OperatorInterface extends JFrame {
	public Warehouse wh = new Warehouse();
	public CenterPanel cp = new CenterPanel(wh);
	public TopPanel tp = new TopPanel();
	public WestPanel wp = new WestPanel();
	public EastPanel ep = new EastPanel();
	public ListItemPanel[] order_form = new ListItemPanel[30];// �㵥�б�
	public double countPrice = 0.0;// �ܼ�
	public PurchaseCuisines pcc;// �ѹ����Ʒ����

	public OperatorInterface() {
		setBounds(180, 10, 1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("���");

		Container c = getContentPane();
		c.setLayout(new BorderLayout());// ��Ե����

		for (int i = 0; i < order_form.length; i++) {// ��Ӳ˵���Ʒ

			order_form[i] = new ListItemPanel("��", 0.0, "01");
			order_form[i].addNum.addActionListener(new ChangeNumberActionListener(i));
			order_form[i].delNum.addActionListener(new ChangeNumberActionListener(i));
			order_form[i].subNum.addActionListener(new ChangeNumberActionListener(i));

			ep.order_list.add(order_form[i]);// ��������ϵĵ����ѵ��Ʒ����뵽

		}
		ep.delAll.addActionListener(new DelActionListener(0));// ����0ʱ�����ȫ����ѡ��Ʒ

		Iterator<String> iter = wh.keySet().iterator();// ��ȡ��ϵ��
		String[] s = new String[10];
		for (int i = 0; i < wh.size(); i++) {
			s[i] = (String) iter.next();
		}

		Iterator<String> iter0 = wh.get(s[0]).keySet().iterator();// ��ȡ��ز�ϵ�Ĳ�Ʒid
		Iterator<String> iter1 = wh.get(s[1]).keySet().iterator();
		Iterator<String> iter2 = wh.get(s[2]).keySet().iterator();
		Iterator<String> iter3 = wh.get(s[3]).keySet().iterator();
		Iterator<String> iter4 = wh.get(s[4]).keySet().iterator();

		Cuisine cuisine;
		for (int i = 0; i < cp.j0.size; i++) {
			String j = (String) iter0.next();// ��ÿ����ϵҳ��ľ����Ʒ��չʾ��ť��Ӽ���
			cuisine = wh.get(s[0]).get(j);
			cp.j0.mip[i].imgBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
			cp.j0.mip[i].textBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
		}
		for (int i = 0; i < cp.j1.size; i++) {
			String j = (String) iter1.next();
			cuisine = wh.get(s[1]).get(j);
			cp.j1.mip[i].imgBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
			cp.j1.mip[i].textBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
		}
		for (int i = 0; i < cp.j2.size; i++) {
			String j = (String) iter2.next();
			cuisine = wh.get(s[2]).get(j);
			cp.j2.mip[i].textBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
			cp.j2.mip[i].imgBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
		}
		for (int i = 0; i < cp.j3.size; i++) {
			String j = (String) iter3.next();
			cuisine = wh.get(s[3]).get(j);
			cp.j3.mip[i].imgBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
			cp.j3.mip[i].textBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
		}
		for (int i = 0; i < cp.j4.size; i++) {
			String j = (String) iter4.next();
			cuisine = wh.get(s[4]).get(j);
			cp.j4.mip[i].imgBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
			cp.j4.mip[i].textBtn
					.addActionListener(new ImgAction(cuisine.getname(), cuisine.getprice(), cuisine.getID()));
		}
		for (int i = 0; i < wp.getComponentCount(); i++)// �������İ�ť��Ӷ�������
		{
			wp.btns[i].addActionListener(new MyTurnPageActionListener(cp.card, cp));
		}
		ep.account_btn.addActionListener(new DelActionListener(1));

		JScrollPane jsCP = new JScrollPane(cp);
		jsCP.setBorder(BorderFactory.createEmptyBorder());// ȥ��JscrollPanel�ı߿�
		c.add(jsCP, BorderLayout.CENTER);
		c.add(tp, BorderLayout.NORTH);
		c.add(wp, BorderLayout.WEST);
		c.add(ep, BorderLayout.EAST);

		setVisible(true);
	}

	class ImgAction implements ActionListener {
		// ���ͼƬʹ�µ�����Ӧ
		public String name;
		public double price;
		public String id;

		public ImgAction(String name, double price, String id) {
			this.name = name;
			this.price = price;
			this.id = id;
		}

		public void actionPerformed(ActionEvent e) {
			int i;
			for (i = 0;; i++) {
				if (order_form[i].isVisible() == false)
					break;
			}
			order_form[i].setVisible(true);
			order_form[i].setName(name);
			order_form[i].setPrice(price);
			order_form[i].setID(id);
			order_form[i].setNum(1);
			countPrice += order_form[i].getAmount();// ��̬�任
			ep.setCountPrice(countPrice);
		}
	}

	class ChangeNumberActionListener implements ActionListener {
		// ���Ե��Ʒ�ĵ�������ϵ���ɾ��
		public int i;// ���������

		public ChangeNumberActionListener(int i) {
			this.i = i;
		}

		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();

			if (btn.getText().equals("+1")) {
				order_form[i].num++;
				String Snum = Integer.toString(order_form[i].num);
				order_form[i].jnum.setText(Snum);
				countPrice += order_form[i].price;
			}
			if (btn.getText().equals("-1")) {
				order_form[i].num--;
				if (order_form[i].num < 1)
					order_form[i].num = 1;// �����������Ϊ1
				else// ����Ʒ�����ں���Χ��ʱ
				{
					String Snum = Integer.toString(order_form[i].num);
					order_form[i].jnum.setText(Snum);// �����������
					countPrice -= order_form[i].price;
				}
			}
			if (btn.getText().equals("ȡ ��")) {
				order_form[i].setNum(1);// ���ȡ��ʱʹ�����ָֻ�1
				order_form[i].setName("��");
				order_form[i].setPrice(0.0);
				order_form[i].id = "000";
				countPrice -= order_form[i].amount;
				order_form[i].amount = 0.0;
				// ���ȡ��ʱʹ�ò�Ʒ���ܼ۸�����
				/* ��� */order_form[i].setVisible(false);
			}
			ep.setCountPrice(countPrice);// ���ղ˵��۸�
		}
	}

	class DelActionListener implements ActionListener {
		// ȡ�����е㵥,���������Ϊ1ʱ ����
		public int i;

		public DelActionListener(int i) {
			this.i = i;
			pcc = new PurchaseCuisines();
		}

		public void actionPerformed(ActionEvent e) {
			// countPrice=0.0;
			if (i == 1) {
				int j;
				for (j = 0; j < order_form.length; j++) {
					if (order_form[j].isVisible() == false)
						break;
					pcc.add(new HasCuisine(order_form[j].name, order_form[j].num, order_form[j].price));
				}
				JDialog result = new JDialog();
				result.setBounds(600, 400, 350, 100);
				result.setLayout(new FlowLayout(1));
				JLabel k = new JLabel();
				k.setFont(new Font("����", Font.BOLD, 20));
				result.add(k);
				result.setVisible(true);

				char a = ep.jpnum.getText().charAt(0);
				try {
					if (j == 0 || Integer.valueOf(ep.jpnum.getText()) == 0 || Character.isDigit(a) == false)// ��δ��ͣ�����δ��д����д�쳣ʱ�׳��쳣
					{
						throw new Exception();
					} else {
						k.setText("�򵥳ɹ���");
						pcc.printFile(Integer.valueOf(ep.jpnum.getText()), countPrice);
						for (int i = 0; i < order_form.length; i++) {
							order_form[i].setVisible(false);
							order_form[i].id = "000";
							order_form[i].setPrice(0.0);
							order_form[i].setName("��");
							order_form[i].setNum(1);
						}
						ep.setCountPrice(0.0);
						ep.jpnum.setText("0");
					}
				} catch (Exception r) {
					k.setText("����δ�㵥," + '\n' + "���ò�������д�쳣��");
				}
			} else {
				for (int i = 0; i < order_form.length; i++) {
					order_form[i].setVisible(false);
					order_form[i].id = "000";
					order_form[i].setPrice(0.0);
					order_form[i].setName("��");
					order_form[i].setNum(1);
				}
				ep.setCountPrice(0.0);
			}
		}// end if
	}// end ActionPerformed

	class MyTurnPageActionListener implements ActionListener {

		public CardLayout card;
		public JPanel jp;

		public MyTurnPageActionListener(CardLayout card, JPanel jp) {
			this.card = card;
			this.jp = jp;
		}

		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton) e.getSource();
			if (jb.getText().equals("   �� �� ��   "))
				card.show(jp, "a0");
			if (jb.getText().equals("   С �� ��   "))
				card.show(jp, "a1");
			if (jb.getText().equals("   �� �� ��   "))
				card.show(jp, "a2");
			if (jb.getText().equals("   �� �� ��   "))
				card.show(jp, "a3");
			if (jb.getText().equals("   �� ˮ ��   "))
				card.show(jp, "a4");
		}

	}

	public static void main(String[] args) {
		OperatorInterface a = new OperatorInterface();
		a.ep.confirm_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog result = new JDialog(a, "�µ�����", true);
				result.setBounds(600, 400, 200, 100);
				result.setLayout(new FlowLayout(1));
				JLabel j = new JLabel("�µ��ɹ�!");
				j.setFont(new Font("����", Font.BOLD, 20));
				result.add(j);
				result.setVisible(true);
			}
		});
	}// end main

}
