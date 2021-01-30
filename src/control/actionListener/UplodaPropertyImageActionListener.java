package control.actionListener;

import view.AddProperty;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class UplodaPropertyImageActionListener  implements ActionListener {
    AddProperty property;

    public UplodaPropertyImageActionListener(AddProperty property) {
        this.property = property;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //if the user click on save in Jfilechooser
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            //add image to the list
            property.getImages().add(selectedFile);
            if(property.getImages().size()>0){
                property.getImageNoLabel().setText(String.valueOf(property.getImages().size()));
                property.getRemoveImageButton().setVisible(true);
                property.getImageNoLabel().setVisible(true);
            }
        }
        //if the user click on save in Jfilechooser
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Select");
        }
    }
}
