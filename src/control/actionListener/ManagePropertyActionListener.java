package control.actionListener;

import control.Mainprog;
import control.mouseListener.HomeMouseListener;
import modle.fileOperation.PropertyOperation;
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
        Mainprog.mainFrame.setSize(990,600);
        Mainprog.mainFrame.getContentPane().removeAll();
        Mainprog.mainFrame.repaint();
        Mainprog.mainFrame.setLocationRelativeTo(null);
        Mainprog.mainFrame.add(homeBtn,BorderLayout.PAGE_START);
        Mainprog.mainFrame.add(managePropertyHomePage);
        managePropertyHomePage.setVisible(true);

    }
}
