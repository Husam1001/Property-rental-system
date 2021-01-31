package control.actionListener.managePropertyActionListener;

import view.PropertyDetailsWidget;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageSliderActionListener implements ActionListener {
    PropertyDetailsWidget propertyDetailsWidget;

    public ImageSliderActionListener(PropertyDetailsWidget propertyDetailsWidget) {
        this.propertyDetailsWidget = propertyDetailsWidget;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn.getText().equals("<<")) {
            if (propertyDetailsWidget.getImageNo() > 0) {
                propertyDetailsWidget.previousImage();
                propertyDetailsWidget.getImageLabel().setIcon(propertyDetailsWidget.getPropertyImageList().get(propertyDetailsWidget.getImageNo()));

            } else {
                propertyDetailsWidget.setImageNo(propertyDetailsWidget.getPropertyImageList().size() - 1);
                propertyDetailsWidget.getImageLabel().setIcon(propertyDetailsWidget.getPropertyImageList().get(propertyDetailsWidget.getImageNo()));
            }

        }

        if (btn.getText().equals(">>")) {
            if (propertyDetailsWidget.getImageNo() < propertyDetailsWidget.getPropertyImageList().size() - 1) {
                propertyDetailsWidget.nextImage();
                propertyDetailsWidget.getImageLabel().setIcon(propertyDetailsWidget.getPropertyImageList().get(propertyDetailsWidget.getImageNo()));

            } else {
                propertyDetailsWidget.setImageNo(0);
                propertyDetailsWidget.getImageLabel().setIcon(propertyDetailsWidget.getPropertyImageList().get(propertyDetailsWidget.getImageNo()));

            }
        }
    }

}
