package view;


import control.actionListener.managePropertyActionListener.RegisterNewAgent;

import javax.swing.*;

public class RegisterPanel extends JPanel {
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JButton registerButton;
    private JLabel mainLabel;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JLabel passwordLabel;
    private JLabel phoneLabel;
    private JTextField phoneTextField;
    private JLabel registerLabel;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JButton backButton;
    public RegisterPanel() {
        initComponents();
    }

                        
    private void initComponents() {

        mainLabel = new JLabel();
        nameTextField = new JTextField();
        nameLabel = new JLabel();
        usernameLabel = new JLabel();
        passwordLabel = new JLabel();
        emailLabel = new JLabel();
        phoneLabel = new JLabel();
        usernameTextField = new JTextField();
        passwordField = new JPasswordField();
        emailTextField = new JTextField();
        phoneTextField = new JTextField();
        registerLabel = new JLabel();
        registerButton = new JButton();
        backButton=new JButton();
        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        mainLabel.setText("Cyberjaya Online Rental Management System");
        add(mainLabel);
        mainLabel.setBounds(39, 12, 324, 15);
        add(nameTextField);
        nameTextField.setBounds(173, 85, 190, 25);

        nameLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nameLabel.setText("Name");
        add(nameLabel);
        nameLabel.setBounds(71, 87, 36, 15);

        usernameLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        usernameLabel.setText("UserName");
        add(usernameLabel);
        usernameLabel.setBounds(71, 124, 65, 15);

        passwordLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        passwordLabel.setText("Password");
        add(passwordLabel);
        passwordLabel.setBounds(71, 161, 60, 15);

        emailLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        emailLabel.setText("Email");
        add(emailLabel);
        emailLabel.setBounds(71, 198, 33, 15);

        phoneLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        phoneLabel.setText("Phone");
        add(phoneLabel);
        phoneLabel.setBounds(71, 235, 40, 25);
        add(usernameTextField);
        usernameTextField.setBounds(173, 122, 190, 25);
        add(passwordField);
        passwordField.setBounds(173, 159, 190, 25);
        add(emailTextField);
        emailTextField.setBounds(173, 196, 190, 25);
        add(phoneTextField);
        phoneTextField.setBounds(173, 233, 190, 25);

        registerLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(0, 102, 102));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setText("Register");
        registerLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(registerLabel);
        registerLabel.setBounds(12, 39, 403, 22);
        backButton.setBackground(new java.awt.Color(204, 204, 204));
        backButton.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(BorderFactory.createEtchedBorder());
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(backButton);
        backButton.setBounds(350, 30, 52, 21);
        backButton.addActionListener(null);
        registerButton.setBackground(new java.awt.Color(0, 255, 204));
        registerButton.setText("Register");
        registerButton.setBorder(BorderFactory.createEtchedBorder());
        registerButton.addActionListener(new RegisterNewAgent(this));
        add(registerButton);
        registerButton.setBounds(164, 290, 88, 29);
    }

    public JTextField getEmailTextField() {
        return emailTextField;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JTextField getPhoneTextField() {
        return phoneTextField;
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }
   public String verifyInput(){
if (getNameTextField().getText().isEmpty()){
    return "Name cannot be Empty";
}
if (getUsernameTextField().getText().isEmpty()){
    return "UserName cannot be Empty";
}
if (getPasswordField().getText().isEmpty()){
    return "Password cannot be Empty";
}
if (getEmailTextField().getText().isEmpty()){
    return "email cannot be Empty";
}
if (!emailisValid(getEmailTextField().getText())){
    return "Invalid email";
}
if (getPhoneTextField().getText().isEmpty()){
    return "Phone cannot be Empty";
}
        return null;
   }
    public boolean emailisValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
}
