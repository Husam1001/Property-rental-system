package control.actionListener;

import view.AddPropertyPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveImageButtonActionPerformed implements ActionListener {
    private final AddPropertyPanel property;

    public RemoveImageButtonActionPerformed(AddPropertyPanel property) {
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
