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
        Mainprog.mainFrame.setSize(670, 960);
        Mainprog.mainFrame.getContentPane().removeAll();
        Mainprog.mainFrame.repaint();
        Mainprog.mainFrame.setLocationRelativeTo(null);
        Mainprog.mainFrame.add(new ViewProperty(property));

    }
}
