package ClientGUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ListItemPanel extends JPanel {
	public JLabel jname;
	public JLabel jprice;
	public JTextField jnum;
	public String id;
	public String name;
	public double price;
	public double amount = 0.0;
	public JButton addNum = new JButton("+1"), subNum = new JButton("-1"), delNum = new JButton("撤销"),
			remark = new JButton("备注");
	public int num = 1;

	public ListItemPanel(String name, double price, String id) {
		this.id = id;
		this.name = name;
		this.price = price;
		JPanel item_name = new JPanel();
		JPanel item_operation = new JPanel();

		setLayout(new BorderLayout());

		item_name.setLayout(new BorderLayout());
		jname = new JLabel("宋体", JLabel.CENTER);

		jname.setText("   " + name);
		jname.setFont(new Font("宋体", Font.BOLD, 14));
		item_name.add(jname, BorderLayout.WEST);
		item_name.setBackground(Color.white);

		item_operation.setLayout(new FlowLayout());
		item_operation.setBackground(Color.white);

		addNum.setFont(new Font("宋体", Font.BOLD, 14));
		addNum.setBorderPainted(false);
		addNum.setBackground(new Color(255, 202, 24));

		subNum.setFont(new Font("宋体", Font.BOLD, 14));
		subNum.setBorderPainted(false);
		subNum.setBackground(new Color(255, 202, 24));

		delNum.setFont(new Font("宋体", Font.BOLD, 14));
		delNum.setBorderPainted(false);
		delNum.setForeground(new Color(226, 32, 24));
		delNum.setBackground(Color.white);
		// delNum.addActionListener(new DelAction());

		remark.setFont(new Font("宋体", Font.BOLD, 14));
		remark.setBorderPainted(false);
		remark.setForeground(new Color(201, 201, 201));
		remark.setBackground(Color.white);
		remark.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new RemarkFrame();
			}
		});
		String Sprice = Double.toString(price);
		String Snum = Integer.toString(num);

		jprice = new JLabel(" " + Sprice + "  元 ");
		jprice.setFont(new Font("宋体", Font.BOLD, 14));
		jnum = new JTextField(Snum, 2);
		jnum.setFont(new Font("宋体", Font.BOLD, 14));

		setVisible(false);

		item_operation.add(jprice);
		item_operation.add(jnum);
		item_operation.add(addNum);
		item_operation.add(subNum);
		item_operation.add(delNum);
		item_name.add(remark, BorderLayout.EAST);

		add(item_name, BorderLayout.NORTH);
		add(item_operation, BorderLayout.CENTER);
	}

	public void setID(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
		jname.setText(name);
	}

	public void setPrice(double price) {
		this.price = price;
		String Sprice = Double.toString(price);
		jprice.setText(Sprice);
	}

	public void setNum(int num) {
		this.num = num;
		String Snum = Integer.toString(num);
		jnum.setText(Snum);
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public String getID() {
		return this.id;
	}

	public double getAmount() {
		double amount = getPrice() * Integer.valueOf(jnum.getText());
		this.amount = amount;
		return amount;
	}
}
