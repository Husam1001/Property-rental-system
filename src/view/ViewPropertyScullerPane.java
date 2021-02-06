package view;


import javax.swing.*;
import java.awt.*;

public class ViewPropertyScullerPane extends JScrollPane {
    private ViewProperty propertyView;
   public ViewPropertyScullerPane(ViewProperty propertyView){
    this.propertyView=propertyView;
    viewProperty();
}
    public void viewProperty(){
        JPanel panel=propertyView;
        panel.setPreferredSize(new Dimension(670,970));
        setViewportView(panel);
    }


}
