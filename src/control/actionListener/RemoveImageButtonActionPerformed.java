package control.actionListener;

import view.AddProperty;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveImageButtonActionPerformed implements ActionListener {
    private AddProperty property;

    public RemoveImageButtonActionPerformed(AddProperty property) {
        this.property = property;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        property.getImages().remove(property.getImages().size()-1);
        property.getImageNoLabel().setText(String.valueOf(property.getImages().size()));
        if(property.getImages().size()<=0){
            property.getRemoveImageButton().setVisible(false);
            property.getImageNoLabel().setVisible(false);
        }
    }
}
