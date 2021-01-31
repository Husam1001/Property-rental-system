package view;

import modle.Property.Property;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ManagePropertyHomePage extends JScrollPane {
  // private ArrayList<Property> propertyList;
    JPanel panel;
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

     PropertyDetailsWidget property=null;
     for (int i = 0; i <propertyList.size(); i++) {
         property=new PropertyDetailsWidget(propertyList.get(i));
         panel.add(property);
     }
     panel.setPreferredSize(new Dimension(960,(280*15)/2));
     setViewportView(panel);
 }

}
