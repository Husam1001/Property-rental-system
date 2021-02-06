package view;

import control.actionListener.AddNewPropertyActionListener;
import control.actionListener.LogoutActionListener;
import control.actionListener.ManagePropertyActionListener;

import javax.swing.*;
import java.awt.*;

public class AgentHomePage extends JPanel {
    private JButton logoutButton;
    private JButton managePropertyButton;
    private JButton addNewPropertyButton;
    private JLabel addNewPropertyLabel;
    private JLabel logoutLabel;
    private JLabel managePropertyLabel;

    public AgentHomePage() {
        initComponents();
    }
    
    private void initComponents() {

        addNewPropertyButton = new JButton();
        managePropertyButton = new JButton();
        logoutButton = new JButton();
        logoutLabel = new JLabel();
        managePropertyLabel = new JLabel();
        addNewPropertyLabel = new JLabel();

        setBackground(new Color(255, 255, 255));
        setLayout(null);
        addNewPropertyButton.addActionListener(new AddNewPropertyActionListener());
        managePropertyButton.addActionListener(new ManagePropertyActionListener());
        logoutButton.addActionListener(new LogoutActionListener());
        addNewPropertyButton.setBackground(new Color(255, 255, 255));
        addNewPropertyButton.setIcon(new ImageIcon(getClass().getResource("/assets/images/house.png")));
        addNewPropertyButton.setBorder(null);
        add(addNewPropertyButton);
        addNewPropertyButton.setBounds(120, 127, 128, 128);

        managePropertyButton.setBackground(new Color(255, 255, 255));
        managePropertyButton.setIcon(new ImageIcon(getClass().getResource("/assets/images/update.png")));
        managePropertyButton.setBorder(null);

        add(managePropertyButton);
        managePropertyButton.setBounds(350, 127, 128, 128);

        logoutButton.setBackground(new Color(255, 255, 255));
        logoutButton.setIcon(new ImageIcon(getClass().getResource("/assets/images/logout.png")));
        logoutButton.setBorder(null);

        add(logoutButton);
        logoutButton.setBounds(578, 127, 128, 128);

        logoutLabel.setFont(new Font("Dialog", 1, 18)); // NOI18N
        logoutLabel.setForeground(new Color(10, 72, 194));
        logoutLabel.setLabelFor(logoutButton);
        logoutLabel.setText("Logout");
        add(logoutLabel);
        logoutLabel.setBounds(599, 283, 70, 23);

        managePropertyLabel.setFont(new Font("Dialog", 1, 14)); // NOI18N
        managePropertyLabel.setForeground(new Color(255, 51, 102));
        managePropertyLabel.setLabelFor(managePropertyButton);
        managePropertyLabel.setText("Manage Property");
        add(managePropertyLabel);
        managePropertyLabel.setBounds(350, 287, 140, 17);

        addNewPropertyLabel.setFont(new Font("Dialog", 1, 14)); // NOI18N
        addNewPropertyLabel.setForeground(new Color(255, 102, 102));
        addNewPropertyLabel.setLabelFor(addNewPropertyLabel);
        addNewPropertyLabel.setText("Add new property");
        add(addNewPropertyLabel);
        addNewPropertyLabel.setBounds(120, 287, 150, 17);
    }


}