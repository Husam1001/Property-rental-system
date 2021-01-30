package control.actionListener;

import control.Mainprog;
import control.mouseListener.HomeMouseListener;
import file.PropertyOperation;
import view.ManagePropertyHomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagePropertyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ManagePropertyHomePage managePropertyHomePage=new ManagePropertyHomePage(PropertyOperation.getProperty());
        JButton homeBtn=new JButton("home");
        homeBtn.addActionListener( new HomeMouseListener());
        Mainprog.main.setSize(990,600);
        Mainprog.main.getContentPane().removeAll();
        Mainprog.main.repaint();
        Mainprog.main.setLocationRelativeTo(null);
        Mainprog.main.add(homeBtn,BorderLayout.PAGE_START);
        Mainprog.main.add(managePropertyHomePage);
        managePropertyHomePage.setVisible(true);
        System.out.println("works");
    }
}
