package control.actionListener.managePropertyActionListener;

import view.PropertyAd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageSliderActionListener implements ActionListener {
    PropertyAd propertyAd;

    public ImageSliderActionListener(PropertyAd propertyAd) {
        this.propertyAd = propertyAd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn.getText().equals("<<")) {
            if (propertyAd.getImageNo() > 0) {
                propertyAd.previousImage();
                propertyAd.getImageLabel().setIcon(propertyAd.getPropertyImageList().get(propertyAd.getImageNo()));

            } else {
                propertyAd.setImageNo(propertyAd.getPropertyImageList().size() - 1);
                propertyAd.getImageLabel().setIcon(propertyAd.getPropertyImageList().get(propertyAd.getImageNo()));
            }

        }

        if (btn.getText().equals(">>")) {
            if (propertyAd.getImageNo() < propertyAd.getPropertyImageList().size() - 1) {
                propertyAd.nextImage();
                propertyAd.getImageLabel().setIcon(propertyAd.getPropertyImageList().get(propertyAd.getImageNo()));

            } else {
                propertyAd.setImageNo(0);
                propertyAd.getImageLabel().setIcon(propertyAd.getPropertyImageList().get(propertyAd.getImageNo()));

            }
        }
    }

}
