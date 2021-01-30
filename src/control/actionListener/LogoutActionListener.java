package control.actionListener;

import control.Mainprog;
import control.Session;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogoutActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       if( Session.destroy()){
        JOptionPane.showMessageDialog(Mainprog.main,"Thank you , See YOU again.");
        Mainprog.main.dispose();
    }
    }

}
