package control.actionListener.managePropertyActionListener;

import control.Mainprog;
import model.Property.Property;
import view.UpdatePropertyView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateBtnActionListener implements ActionListener {
    private final Property property;
    public UpdateBtnActionListener(Property property){
        this.property=property;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Update Btn");
        UpdatePropertyView updateProperty=new UpdatePropertyView(property);
        Mainprog.mainFrame.setSize(550,700);
        Mainprog.mainFrame.getContentPane().removeAll();
        Mainprog.mainFrame.repaint();
        Mainprog.mainFrame.setLocationRelativeTo(null);
        Mainprog.mainFrame.add(updateProperty);
        updateProperty.setVisible(true);

    }
}
