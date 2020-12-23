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

    Client.ep.confirm_btn.addActionListener(new ActionListener() { //确认订单Button的监听器
			public void actionPerformed(ActionEvent e) {

        ///////////
        PurchaseCuisines plist = Client.getMessage(); //获得用户界面的点菜反馈
        Server.newTask(plist); //在服务端界面显示
        //////////
        
				JDialog result = new JDialog(Client, "下单反馈", true);
				result.setBounds(600, 400, 200, 100);
				result.setLayout(new FlowLayout(1));
				JLabel j = new JLabel("下单成功!");
				j.setFont(new Font("宋体", Font.BOLD, 20));
				result.add(j);
        result.setVisible(true);

			}
		});
    

	}// end main
}
