package ClientGUI;

import java.awt.*;

import javax.swing.*;

public class EastPanel extends JPanel {

	public JPanel topTital;// ��������
	public JPanel order_list;// ��ѡ����
	public JPanel confirm;// ȷ���������Ϊ��Ե����
	public JLabel count;// ��ʾ�ܼ�
	public JButton confirm_btn;// ���ȷ�ϵ㵥
	public JButton account_btn;// ����
	public JButton delAll;// ȡ��ȫ��
	public JTextField jpnum;// ����

	public JComboBox<String> combobox;// ѡ��
	public double countPrice;

	public EastPanel() {
		setLayout(new BorderLayout());
		topTital = new JPanel();
		topTital.setLayout(new BorderLayout());

		JPanel j1 = new JPanel();// ѡ���������

		String item[] = { "1����", "2����", "3����", "4����", "5����", "6����", "7����", "8����" };

		combobox = new JComboBox<String>(item);
		combobox.setFont(new Font("����", Font.BOLD, 15));
		combobox.setForeground(new Color(243, 88, 27));
		combobox.setPreferredSize(new Dimension(100, 20));// ǿ����������С
		combobox.setEditable(true);

		JLabel pnum = new JLabel("����");// �ò�����
		pnum.setFont(new Font("����", Font.BOLD, 20));
		pnum.setForeground(new Color(243, 88, 27));
		pnum.setBounds(60, 70, 100, 20);

		jpnum = new JTextField(2);// ���2�ַ�
		jpnum.setFont(new Font("����", Font.BOLD, 14));
		jpnum.setText("0");

		delAll = new JButton("ȡ��");
		delAll.setFont(new Font("����", Font.BOLD, 15));
		delAll.setForeground(Color.white);
		delAll.setBackground(new Color(255, 0, 0));
		delAll.setBorderPainted(false);// ȡ���߿�

		j1.add(combobox);
		j1.add(pnum);
		j1.add(jpnum);
		j1.add(delAll);

		JLabel j2 = new JLabel("             �� �� �� Ʒ         ");
		j2.setFont(new Font("����", Font.BOLD, 20));
		j2.setBounds(60, 70, 100, 20);
		topTital.setBackground(Color.white);
		topTital.add(j1, BorderLayout.NORTH);
		topTital.add(j2, BorderLayout.SOUTH);

		order_list = new JPanel();
		order_list.setLayout(new FlowLayout());
		order_list.setPreferredSize(new Dimension(130, 1000));

		JScrollPane js = new JScrollPane(order_list);// ��ӹ�����
		js.setBorder(BorderFactory.createEmptyBorder());// ȥ��JscrollPanel�ı߿�

		confirm = new JPanel();
		confirm.setLayout(new BorderLayout());
		count = new JLabel("            " + "�� ��   :  " + countPrice);
		count.setFont(new Font("����", Font.BOLD, 22));

		account_btn = new JButton("         ����           ");
		account_btn.setFont(new Font("����", Font.BOLD, 22));
		account_btn.setForeground(Color.white);
		account_btn.setBackground(new Color(255, 0, 0));
		account_btn.setBorderPainted(false);// ȡ���߿�

		confirm_btn = new JButton("         ȷ �� �� ��           ");
		confirm_btn.setFont(new Font("����", Font.BOLD, 22));
		confirm_btn.setForeground(Color.white);
		confirm_btn.setBackground(new Color(255, 202, 24));
		confirm_btn.setBorderPainted(false);// ȡ���߿�

		confirm.add(count, BorderLayout.NORTH);
		confirm.add(confirm_btn, BorderLayout.SOUTH);
		confirm.add(account_btn, BorderLayout.CENTER);

		add(topTital, BorderLayout.NORTH);
		add(confirm, BorderLayout.SOUTH);
		add(js, BorderLayout.CENTER);
	}

	public void setCountPrice(double countPrice) {
		this.countPrice = countPrice;
		count.setText("            " + "�� ��   :  " + countPrice);
	}

}
