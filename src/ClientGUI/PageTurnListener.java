package ClientGUI;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class PageTurnListener implements ActionListener {

    public CardLayout card;
    public JPanel jp;

    public PageTurnListener(CardLayout card, JPanel jp) {
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