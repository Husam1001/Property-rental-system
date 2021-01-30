
package control.actionListener;

import control.Mainprog;
import file.TestFile;
import view.AddProperty;
import view.AgentHomePage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class NewPropertySaveButtonActionListener implements ActionListener {
    AddProperty property;

    public NewPropertySaveButtonActionListener(AddProperty property) {
        this.property = property;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       //extract the data and pass it to the method addNewProperty() ->write the data to a text file

        if (property.inputValidation()!=null){
            JOptionPane.showMessageDialog(Mainprog.main,property.inputValidation());
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

            if (TestFile.addNewProperty(title, type, size, roomNo, bathRoomNo,price, description, address, city, postCode, image)) {
                JOptionPane.showMessageDialog(Mainprog.main, "Property has been add successfully ");
                Mainprog.main.setSize(800, 442);
                AgentHomePage agentHomePage = new AgentHomePage();
                Mainprog.main.getContentPane().removeAll();
                Mainprog.main.repaint();
                Mainprog.main.add(agentHomePage);
                agentHomePage.setVisible(true);
            }
        }
    }
}