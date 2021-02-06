package control.actionListener.managePropertyActionListener;

import control.Mainprog;
import model.Property.Property;
import view.ViewProperty;
import view.ViewPropertyScullerPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewBtnActionListener implements ActionListener {
    private final Property property;

    public ViewBtnActionListener(Property property) {
        this.property = property;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Mainprog.mainFrame.setSize(675, 670);
        Mainprog.mainFrame.getContentPane().removeAll();
        Mainprog.mainFrame.repaint();
        Mainprog.mainFrame.setLocationRelativeTo(null);
        Mainprog.mainFrame.add(new ViewPropertyScullerPane(new ViewProperty(property)));

    }
}
