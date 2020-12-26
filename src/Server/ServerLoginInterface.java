package Server;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class ServerLoginInterface extends JFrame {

	private ServerLoginInterface() {
		setTitle("登陆界面");
		setBounds(450, 300, 580, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(new Color(192, 192, 192));
		c.setLayout(null);

		JLabel top = new JLabel("后台管理系统", JLabel.CENTER);
		top.setFont(new Font("宋体", Font.BOLD, 36));
		top.setBounds(0, -95, 580, 250);

		JLabel text = new JLabel("账号");
		text.setFont(new Font("宋体", Font.BOLD, 16));
		text.setBounds(135, 85, 80, 20);

		JTextField inText = new JTextField(20);
		inText.setFont(new Font("宋体", Font.BOLD, 16));
		inText.setText("admin");
		inText.setBorder(BorderFactory.createLineBorder(new Color(255, 202, 24)));
		inText.setBounds(180, 85, 200, 20);

		JLabel psw = new JLabel("密码");
		psw.setFont(new Font("宋体", Font.BOLD, 16));
		psw.setBounds(135, 115, 80, 20);

		JPasswordField inPsw = new JPasswordField();
		inPsw.setColumns(20);
		inPsw.setFont(new Font("宋体", Font.BOLD, 16));
		inPsw.setEchoChar('*');
		inPsw.setBorder(BorderFactory.createLineBorder(new Color(255, 202, 24)));
		inPsw.setBounds(180, 115, 200, 20);

		JButton submit = new JButton("登录");
		submit.setFont(new Font("宋体", Font.BOLD, 20));
		submit.setBorderPainted(false);
		submit.setBackground(new Color(255, 250, 250));
		submit.setBounds(230, 160, 80, 20);

		c.add(top);
		c.add(text);
		c.add(inText);
		c.add(psw);
		c.add(inPsw);
		c.add(submit);
		setResizable(false);
		setVisible(true);

		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inPsw.getText().equals("admin")) {
					setVisible(false);
					ServerOperatorInterface a = new ServerOperatorInterface();
					try {
						a.start();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(c, "密码错误");
					inPsw.setText("");
					inPsw.requestFocus();
				}
			}
		});
	}

	public static void main(String[] args) {
		new ServerLoginInterface();
	}
}
