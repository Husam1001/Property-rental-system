package control.actionListener.managePropertyActionListener;

import control.Mainprog;
import modle.Property.Property;
import view.ViewProperty;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewBtnActionListener implements ActionListener {
    private Property property;

    public ViewBtnActionListener(Property property) {
        this.property = property;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Mainprog.main.setSize(670, 960);
        Mainprog.main.getContentPane().removeAll();
        Mainprog.main.repaint();
        Mainprog.main.setLocationRelativeTo(null);
        Mainprog.main.add(new ViewProperty(property));

    }
}
