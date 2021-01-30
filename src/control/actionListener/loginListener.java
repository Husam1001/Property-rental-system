package control.actionListener;

import control.LoginController;
import control.Mainprog;
import control.Session;
import view.AddProperty;
import view.AgentHomePage;
import view.LoginPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginListener implements ActionListener {
    private LoginPage loginPageInstance;
    public loginListener(LoginPage loginPageInstance){
        this.loginPageInstance =loginPageInstance;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //set the session user if login our set user to null
        Session.setUser(LoginController.login(loginPageInstance));
        if (loginPageInstance.getUserNameTextField().getText().isEmpty()||loginPageInstance.getPasswordfild().getText().isEmpty()){
            JOptionPane.showMessageDialog(Mainprog.main,"Warning, UserName / Password Cannot Be Empty.");
        }
        else if (!Session.isEmpty()) {
            loginPageInstance.getjPanel1().setVisible(false);
            Mainprog.main.setSize(800,442);
            AgentHomePage agentHomePage=new AgentHomePage();
            Mainprog.main.add(agentHomePage);
            Mainprog.main.setLocationRelativeTo(null);
            agentHomePage.setVisible(true);
    }else {
            JOptionPane.showMessageDialog(Mainprog.main,"Error,Invalid UserName / Password .");
            // make the input fields empty
            loginPageInstance.getUserNameTextField().setText("");
            loginPageInstance.getPasswordfild().setText("");
        }
}
}
