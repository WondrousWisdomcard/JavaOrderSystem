package maintest;

import ServerGUI.*;
import Database.*;
import ClientGUI.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import javax.swing.*;

public class OrderSystemTest {

    public static void main(String[] args) {

    OperatorInterface Client = new OperatorInterface();

    ServerOperatorInterface Server  = new ServerOperatorInterface();

    Client.ep.confirm_btn.addActionListener(new ActionListener() { //ȷ�϶���Button�ļ�����
			public void actionPerformed(ActionEvent e) {

        ///////////
        PurchaseCuisines plist = Client.getMessage(); //����û�����ĵ�˷���
        Server.newTask(plist); //�ڷ���˽�����ʾ
        //////////
        
				JDialog result = new JDialog(Client, "�µ�����", true);
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
