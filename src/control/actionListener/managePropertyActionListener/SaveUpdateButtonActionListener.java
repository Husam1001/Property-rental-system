package control.actionListener.managePropertyActionListener;

import control.Mainprog;
import control.actionListener.ManagePropertyActionListener;
import model.fileOperation.PropertyOperation;
import model.Property.Address;
import model.Property.Property;
import view.UpdatePropertyView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveUpdateButtonActionListener implements ActionListener {
    private final UpdatePropertyView propertyView;
    public SaveUpdateButtonActionListener(UpdatePropertyView propertyView){
        this.propertyView=propertyView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if (propertyView.inputValidation()==null){
        Property property=propertyView.getProperty();
//        title, type, size, roomNo, bathRoomNo,price, description, address, city, postCode, image
        Property tempProperty=new Property(propertyView.getProperty().getId(),
                                            propertyView.getTitleTextField().getText(),
                                            propertyView.getPrpertyTypeComboBox().getSelectedItem().toString(),
                                            Double.parseDouble(propertyView.getPriceTextField().getText()),
                                            Integer.parseInt(  propertyView.getRoomNoSpinner().getValue().toString()),
                                            Integer.parseInt(propertyView.getBathroomNoSpinner().getValue().toString()),
                                            propertyView.getPropertySizeTextField().getText(),
                                            propertyView.getDescriptionTextArea().getText(),
                                            new Address(propertyView.getCityComboBox().getSelectedItem().toString(),propertyView.getAddressTextField().getText(),Integer.parseInt(propertyView.getPostCodeTextField().getText())),
                                            property.getPropertyImages());

        if (!property.compare(tempProperty)){
            PropertyOperation.updateProperty(tempProperty);
            JOptionPane.showMessageDialog(Mainprog.mainFrame,"Property Updated successfully");
            new ManagePropertyActionListener().actionPerformed(null);

        }else {
            JOptionPane.showMessageDialog(Mainprog.mainFrame,"No changes has been made!");
            new ManagePropertyActionListener().actionPerformed(null);
        }

    }else {
        JOptionPane.showMessageDialog(Mainprog.mainFrame,propertyView.inputValidation());
    }
    }

}
