package view;

import model.Property.Property;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ManagePropertyHomePage extends JScrollPane {
  // private ArrayList<Property> propertyList;
    private JPanel panel;
  public ManagePropertyHomePage(ArrayList <Property>propertyList){
     //this.propertyList=propertyList;
     showProperty(propertyList);
  }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public void showProperty(ArrayList <Property>propertyList){
      panel=new JPanel();
     FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
     layout.setHgap(20);
     layout.setVgap(20);
     panel.setLayout(layout);


     for (int i = propertyList.size()-1; i >=0; i--) {

         panel.add(new PropertyDetailsWidget(propertyList.get(i)));
     }
     panel.setPreferredSize(new Dimension(960,(330* propertyList.size())/2));
     setViewportView(panel);
 }

}
