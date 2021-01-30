package control.actionListener.managePropertyActionListener;

import view.ViewProperty;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewPropertyImageSliderActionListener implements ActionListener {
    ViewProperty viewProperty;

    public ViewPropertyImageSliderActionListener(ViewProperty viewProperty) {
        this.viewProperty = viewProperty;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn=(JButton) e.getSource();
        if (btn.getText().equals("<<")) {
            if (viewProperty.getImageNo() > 0) {
                viewProperty.previousImage();
                viewProperty.getImageLabel().setIcon(viewProperty.getPropertyImage().get(viewProperty.getImageNo()));

            } else {
                viewProperty.setImageNo(viewProperty.getPropertyImage().size() - 1);
                viewProperty.getImageLabel().setIcon(viewProperty.getPropertyImage().get(viewProperty.getImageNo()));
            }

        }

        if (btn.getText().equals(">>")) {
            if (viewProperty.getImageNo() < viewProperty.getPropertyImage().size() - 1) {
                viewProperty.nextImage();
                viewProperty.getImageLabel().setIcon(viewProperty.getPropertyImage().get(viewProperty.getImageNo()));

            } else {
                viewProperty.setImageNo(0);
                viewProperty.getImageLabel().setIcon(viewProperty.getPropertyImage().get(viewProperty.getImageNo()));

            }
        } }
    }

