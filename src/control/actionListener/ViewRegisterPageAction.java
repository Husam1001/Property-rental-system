package control.actionListener;

import com.sun.tools.javac.Main;
import control.Mainprog;
import view.RegisterPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewRegisterPageAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Mainprog.mainFrame.getContentPane().removeAll();
        Mainprog.mainFrame.setSize(415,378);
        Mainprog.mainFrame.repaint();
        Mainprog.mainFrame.setLocationRelativeTo(null);
        Mainprog.mainFrame.add(new RegisterPanel());
        Mainprog.mainFrame.setVisible(true);
    }
}
