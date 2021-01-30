package control.actionListener;

import control.Mainprog;
import view.AddProperty;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewPropertyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
            AddProperty addproperty=new AddProperty();
            Mainprog.main.setSize(540,710);
            Mainprog.main.getContentPane().removeAll();
            Mainprog.main.repaint();
            Mainprog.main.setLocationRelativeTo(null);
            Mainprog.main.add(addproperty);
            addproperty.setVisible(true);
    }
}
