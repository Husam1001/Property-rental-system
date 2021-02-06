package view;


import control.actionListener.ViewRegisterPageAction;
import control.actionListener.loginListener;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JPanel {
    private JButton loginButton;
    private JLabel loginLabel;
    private JPasswordField passwordfild;
    private JButton registerButton;
    private JTextField userNameTextField;

    public LoginPage() {
        LookAndFeel.getLookAndFeel();
        initComponents();
    }

    public JPasswordField getPasswordField() {
        return passwordfild;
    }

    public JTextField getUserNameTextField() {
        return userNameTextField;
    }

    public JPanel getPanel() {
        return this;
    }
    private void initComponents() {
        loginLabel = new JLabel();
        userNameTextField = new JTextField();
        passwordfild = new JPasswordField();
        loginButton = new JButton();
        registerButton = new JButton();
        setLayout(null);

        loginLabel.setFont(new Font("Dialog", 1, 18)); 
        loginLabel.setForeground(new Color(172, 198, 94));
        loginLabel.setText("Login");
        loginButton.addActionListener(new loginListener(this));
        add(loginLabel);
        loginLabel.setBounds(140, 20, 63, 25);

        add(userNameTextField);
        userNameTextField.setBounds(80, 70, 180, 30);
        add(passwordfild);
        passwordfild.setBounds(80, 120, 180, 29);

        loginButton.setText("Login");
        add(loginButton);
        loginButton.setBounds(130, 170, 73, 25);

        registerButton.setBackground(new Color(255, 255, 255));
        registerButton.setFont(new Font("Dialog", 0, 10)); 
        registerButton.setText("Register");
        registerButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerButton.addActionListener(new ViewRegisterPageAction());
        add(registerButton);
        registerButton.setBounds(140, 220, 50, 21);
    }

    }
