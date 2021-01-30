package control.actionListener.managePropertyActionListener;

import control.Mainprog;
import modle.Property.Property;
import view.AddProperty;
import view.UpdatePropertyView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateBtnActionListener implements ActionListener {
    private Property property;
    public UpdateBtnActionListener(Property property){
        this.property=property;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Update Btn");
        UpdatePropertyView updateProperty=new UpdatePropertyView(property);
        Mainprog.main.setSize(550,700);
        Mainprog.main.getContentPane().removeAll();
        Mainprog.main.repaint();
        Mainprog.main.setLocationRelativeTo(null);
        Mainprog.main.add(updateProperty);
        updateProperty.setVisible(true);

    }
}
