package ServerGUI;

import java.awt.*;
import javax.swing.*;
import Database.*;

public class TaskItemPanel extends JPanel {

    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JTextArea content = new JTextArea();
    JButton accept = new JButton();
    JButton refuse = new JButton();

    TaskItemPanel(PurchaseCuisines plist) {
        setLayout(new BorderLayout());

        String str = getStrContent(plist);

        content.setText(str);
        content.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 10));
        content.setBackground(new Color(230, 250, 250));

        left.add(content);
        add(left, BorderLayout.WEST);

        right.setLayout(new BorderLayout());

        accept.setText("½Óµ¥");
        accept.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 10));
        accept.setBorderPainted(true);
        accept.setBackground(new Color(0, 225, 127));
        accept.setPreferredSize(new Dimension(70, 70));
        right.add(accept, BorderLayout.NORTH);

        accept.setText("¾Ü¾ø");
        accept.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 10));
        accept.setBorderPainted(true);
        accept.setBackground(new Color(255, 69, 0));
        accept.setPreferredSize(new Dimension(70, 70));
        right.add(accept, BorderLayout.SOUTH);

        add(right, BorderLayout.EAST);
    }

    String getStrContent(PurchaseCuisines plist) {
        String s = new String();
        for (int i = 0; i < plist.size(); i++) {
            s += (plist.get(i).getname() + " " + plist.get(i).getprice() + "x" + plist.get(i).getnum() + " "
                    + plist.get(i).getAmountPrice()) + "\n";
        }
        return s;
    }
}
