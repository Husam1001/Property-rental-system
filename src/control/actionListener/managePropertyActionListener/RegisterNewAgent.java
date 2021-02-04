package control.actionListener.managePropertyActionListener;

import control.Mainprog;
import model.fileOperation.FileOperation;
import view.LoginPage;
import view.RegisterPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterNewAgent implements ActionListener {
    RegisterPanel registerPanel;

    public RegisterNewAgent(RegisterPanel registerPanel) {
        this.registerPanel = registerPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (registerPanel.verifyInput()==null){
            FileOperation.registerNewAgent(
                    registerPanel.getUsernameTextField().getText(),
                    registerPanel.getPasswordField().getText(),
                    registerPanel.getNameTextField().getText(),
                    registerPanel.getPhoneTextField().getText(),
                    registerPanel.getEmailTextField().getText()
            );
            JOptionPane.showMessageDialog(Mainprog.mainFrame,"Registered successfully ");
            Mainprog.mainFrame.getContentPane().removeAll();
            Mainprog.mainFrame.repaint();
            Mainprog.mainFrame.setSize(340, 340);
            Mainprog.mainFrame.setLocationRelativeTo(null);
            Mainprog.mainFrame.setResizable(false);
            LoginPage loginPage = new LoginPage();
            Mainprog.mainFrame.add(loginPage);
        }else
            JOptionPane.showMessageDialog(Mainprog.mainFrame,registerPanel.verifyInput());


    }
}
