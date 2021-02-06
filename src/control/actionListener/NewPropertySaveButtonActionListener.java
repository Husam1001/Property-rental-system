
package control.actionListener;

import control.Mainprog;
import model.fileOperation.FileOperation;
import view.AddPropertyPanel;
import view.AgentHomePage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class NewPropertySaveButtonActionListener implements ActionListener {
    AddPropertyPanel property;

    public NewPropertySaveButtonActionListener(AddPropertyPanel property) {
        this.property = property;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       //extract the data and pass it to the method addNewProperty() ->write the data to a text modle.file

        if (property.inputValidation()!=null){
            JOptionPane.showMessageDialog(Mainprog.mainFrame,property.inputValidation());
        }else {
            String title=property.getTitleTextField().getText();
            String type=property.getPrpertyTypeComboBox().getSelectedItem().toString();
            String size=property.getPropertySizeTextField().getText();
            int roomNo=(int)property.getRoomNoSpinner().getValue();
            double price=Double.parseDouble( property.getPriceTextField().getText());
            int bathRoomNo=(int)property.getBathroomNoSpinner().getValue();
            String description=property.getDescriptionTextArea().getText();
            String address=property.getAddressTextField().getText();
            String city=property.getCityComboBox().getSelectedItem().toString();
            int postCode=Integer.parseInt(property.getPostCodeTextField().getText());
            ArrayList<File> image=property.getImages();

            if (FileOperation.addNewProperty(title, type, size, roomNo, bathRoomNo,price, description, address, city, postCode, image)) {
                JOptionPane.showMessageDialog(Mainprog.mainFrame, "Property has been add successfully ");
                Mainprog.mainFrame.setSize(800, 442);
                AgentHomePage agentHomePage = new AgentHomePage();
                Mainprog.mainFrame.getContentPane().removeAll();
                Mainprog.mainFrame.repaint();
                Mainprog.mainFrame.add(agentHomePage);
                agentHomePage.setVisible(true);
            }
        }
    }
}
