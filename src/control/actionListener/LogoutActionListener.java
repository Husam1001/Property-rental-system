package control.actionListener;

import control.Mainprog;
import control.Session;
import view.LoginPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogoutActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       if( Session.destroy()){
        JOptionPane.showMessageDialog(Mainprog.mainFrame,"Thank you , See YOU again.");
           Mainprog.mainFrame.getContentPane().removeAll();
           Mainprog.mainFrame.repaint();
           Mainprog.mainFrame.setSize(340, 340);
           Mainprog.mainFrame.setLocationRelativeTo(null);
           Mainprog.mainFrame.setResizable(false);
           Mainprog.mainFrame.add(new LoginPage());
           Mainprog.mainFrame.setVisible(true);
    }
    }

}
