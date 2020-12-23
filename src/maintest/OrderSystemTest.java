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

    OperatorInterface t2 = new OperatorInterface();

    ServerOperatorInterface t = new ServerOperatorInterface();

    t2.ep.confirm_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        
        PurchaseCuisines plist = t2.getMessage();
        t.newTask(plist);

				JDialog result = new JDialog(t2, "下单反馈", true);
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
