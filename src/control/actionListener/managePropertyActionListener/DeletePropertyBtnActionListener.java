package control.actionListener.managePropertyActionListener;

import control.Mainprog;
import modle.fileOperation.FileOperation;
import modle.fileOperation.PropertyOperation;
import view.ManagePropertyHomePage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeletePropertyBtnActionListener implements ActionListener {
    private final int id;
    public DeletePropertyBtnActionListener(int id){
        this.id=id;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (JOptionPane.showConfirmDialog(Mainprog.mainFrame,"Yes/No")==0){
            FileOperation.removeProperty(id);
            Mainprog.mainFrame.setSize(990,600);
            ManagePropertyHomePage scrollPane=(ManagePropertyHomePage) Mainprog.mainFrame.getContentPane().getComponent(1);
            scrollPane.setVisible(false);
            scrollPane. setPanel(null);
            scrollPane.showProperty(PropertyOperation.getProperty());
            scrollPane.setVisible(true);
              Mainprog.mainFrame.repaint();

        }
    }
}
