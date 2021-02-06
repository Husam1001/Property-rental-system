package control.actionListener;

import control.Mainprog;
import view.AddPropertyPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewPropertyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
            AddPropertyPanel addproperty=new AddPropertyPanel();
            Mainprog.mainFrame.setSize(540,710);
            Mainprog.mainFrame.getContentPane().removeAll();
            Mainprog.mainFrame.repaint();
            Mainprog.mainFrame.setLocationRelativeTo(null);
            Mainprog.mainFrame.add(addproperty);
            addproperty.setVisible(true);
    }
}
