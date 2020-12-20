package ClientGUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LoginInterface extends JFrame {
	public LoginInterface() {
		setTitle("��½");
		setBounds(450, 300, 580, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(new Color(255, 202, 24));// ������ɫ
		c.setLayout(null);// ���þ��Բ���

		JLabel topImg = new JLabel();// ���ͼƬ��ǩ

		Icon icon = new ImageIcon("src/image/login.jpg/");
		topImg.setIcon(icon);
		topImg.setBounds(0, -95, 580, 250);

		JLabel text = new JLabel("�˺� ");
		text.setFont(new Font("����", Font.BOLD, 16));// �����˺ű�ǩ����
		text.setBounds(135, 85, 80, 20);

		JTextField inText = new JTextField(20);
		inText.setFont(new Font("MS Gothic", Font.BOLD, 16));
		inText.setText("admin");
		inText.setBorder(BorderFactory.createLineBorder(new Color(255, 202, 24)));// ���ú�ɫ�߿�
		inText.setBounds(180, 85, 200, 20);

		JLabel psw = new JLabel("����  ");
		psw.setFont(new Font("����", Font.BOLD, 16));// ���������ǩ����
		psw.setBounds(135, 115, 80, 20);

		JPasswordField inPsw = new JPasswordField();
		inPsw.setColumns(20);
		inPsw.setFont(new Font("MS Gothic", Font.BOLD, 16));
		inPsw.setEchoChar('*');// ����������ʾ�ַ�
		inPsw.setBorder(BorderFactory.createLineBorder(new Color(255, 202, 24)));// ���ú�ɫ�߿�
		inPsw.setBounds(180, 115, 200, 20);

		JButton submit = new JButton("��½");
		submit.setFont(new Font("����", Font.BOLD, 24));// ���������ǩ����
		submit.setBorderPainted(false);
		submit.setBackground(new Color(255, 202, 24));
		submit.setBounds(230, 160, 100, 40);
		c.add(topImg);
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
					new OperatorInterface();
				} else
					inPsw.setText("");// ������������
				inPsw.requestFocus();// ʹ������������ͷ
			}
		});
	}

	public static void main(String[] args) {
		new LoginInterface();
	}
}
