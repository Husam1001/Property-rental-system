package view;

import modle.Property.Property;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ManagePropertyHomePage extends JScrollPane {
   private ArrayList<Property> propertyList;
  public ManagePropertyHomePage(ArrayList <Property>propertyList){
     this.propertyList=propertyList;
     showProperty();
  }
 public void showProperty(){
     JPanel panel=new JPanel();
     FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
     layout.setHgap(20);
     layout.setVgap(20);
     panel.setLayout(layout);

     PropertyAd property=null;
     for (int i = 0; i <propertyList.size(); i++) {
         property=new PropertyAd(propertyList.get(i));
         panel.add(property);
     }
     panel.setPreferredSize(new Dimension(960,(280*15)/2));
     setViewportView(panel);
 }

}
