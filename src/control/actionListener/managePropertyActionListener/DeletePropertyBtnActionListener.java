package control.actionListener.managePropertyActionListener;

import control.Mainprog;
import control.actionListener.ManagePropertyActionListener;
import control.mouseListener.HomeMouseListener;
import file.FileOperation;
import file.PropertyOperation;
import view.ManagePropertyHomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeletePropertyBtnActionListener implements ActionListener {
    private final int id;
    public DeletePropertyBtnActionListener(int id){
        this.id=id;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (JOptionPane.showConfirmDialog(Mainprog.main,"Yes/No")==0){
            FileOperation.removeProperty(id);
            Mainprog.main.setSize(990,600);
            ManagePropertyHomePage scrollPane=(ManagePropertyHomePage) Mainprog.main.getContentPane().getComponent(1);
            scrollPane.setVisible(false);
            scrollPane. setPanel(null);
            scrollPane.showProperty(PropertyOperation.getProperty());
            scrollPane.setVisible(true);
              Mainprog.main.repaint();

        }
    }
}
