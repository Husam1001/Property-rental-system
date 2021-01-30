package view;


import control.actionListener.managePropertyActionListener.DeletePropertyBtnActionListener;
import control.actionListener.managePropertyActionListener.ImageSliderActionListener;
import control.actionListener.managePropertyActionListener.UpdateBtnActionListener;
import control.actionListener.managePropertyActionListener.ViewBtnActionListener;
import modle.Property.Property;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * @author husam
 */
public class PropertyAd extends javax.swing.JPanel {

    // Variables declaration - do not modify
    private ArrayList<ImageIcon> propertyImageList;
    private javax.swing.JLabel bathroomNoLabel;
    private javax.swing.JLabel bedroomNoLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton leftImageButton;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel propertyTypeLabel;
    private javax.swing.JButton rightImageButton;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    private int imageNo = 0;
    private Property property;
    /**
     * Creates new form Property
     */
    public PropertyAd(Property property) {
        this.property=property;
        initComponents();
        setData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        propertyImageList = new ArrayList<>();
        imageLabel = new javax.swing.JLabel();
        leftImageButton = new javax.swing.JButton();
        rightImageButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        propertyTypeLabel = new javax.swing.JLabel();
        bedroomNoLabel = new javax.swing.JLabel();
        sizeLabel = new javax.swing.JLabel();
        bathroomNoLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/house.png"))); // NOI18N
        imageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        leftImageButton.setBackground(new java.awt.Color(255, 255, 255));
        leftImageButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        leftImageButton.setForeground(new java.awt.Color(102, 102, 102));
        leftImageButton.setText("<<");
        leftImageButton.setBorder(null);
        leftImageButton.addActionListener(new ImageSliderActionListener(this));

        rightImageButton.setBackground(new java.awt.Color(255, 255, 255));
        rightImageButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rightImageButton.setForeground(new java.awt.Color(102, 102, 102));
        rightImageButton.setText(">>");
        rightImageButton.setBorder(null);
        rightImageButton.addActionListener(new ImageSliderActionListener(this));

        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        // titleLabel.setText("property Info....................");

        priceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(204, 0, 0));
        // priceLabel.setText("RM 1000");

        propertyTypeLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        propertyTypeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/propertyIcon.png"))); // NOI18N
        //  propertyTypeLabel.setText("Apartment");

        bedroomNoLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bedroomNoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bedroomIcon.png"))); // NOI18N
        // bedroomNoLabel.setText("2 Bedrooms");

        sizeLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/propertySizeIcon.png"))); // NOI18N
        // sizeLabel.setText("1097 sq.ft.");

        bathroomNoLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bathroomNoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bathroomIcon.png"))); // NOI18N
        //  bathroomNoLabel.setText("2 Bathrooms");

        locationLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        locationLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/locationIcon.png"))); // NOI18N
        // locationLabel.setText("Kuala Lumpur");

        viewButton.setBackground(new java.awt.Color(255, 204, 204));
        viewButton.setText("View");
        viewButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewButton.addActionListener(new ViewBtnActionListener(property));

        updateButton.setBackground(new java.awt.Color(204, 255, 204));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.setMaximumSize(new java.awt.Dimension(56, 19));
        updateButton.addActionListener(new UpdateBtnActionListener(property));

        deleteButton.setBackground(new java.awt.Color(255, 153, 153));
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new DeletePropertyBtnActionListener(property.getId()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(leftImageButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rightImageButton)
                                                .addGap(12, 12, 12))
                                        .addComponent(imageLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(propertyTypeLabel)
                                                        .addComponent(bedroomNoLabel)
                                                        .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(locationLabel)
                                                        .addComponent(bathroomNoLabel)
                                                        .addComponent(sizeLabel))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(imageLabel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(locationLabel)
                                                        .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(propertyTypeLabel)
                                                        .addComponent(sizeLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bedroomNoLabel)
                                                        .addComponent(bathroomNoLabel))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rightImageButton)
                                        .addComponent(leftImageButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void setData() {
        titleLabel.setText(property.getTitle());
        priceLabel.setText("RM " + property.getPrice());
        propertyTypeLabel.setText(property.getPropertyType());
        bathroomNoLabel.setText(property.getNumberOfBathroom() + " Bathrooms");
        bedroomNoLabel.setText(property.getNumberOfRoom() + " Bedrooms");
        sizeLabel.setText(property.getSize() + " sq.ft.");
        locationLabel.setText(property.getPropertyLocation().getCity());
        ImageIcon imageIcon = new ImageIcon(property.getPropertyImages().get(0));
        ImageIcon scaledImage = new ImageIcon(getScaledImage(imageIcon.getImage(), 140, 140));
        imageLabel.setIcon(scaledImage);
        for (int i = 0; i < property.getPropertyImages().size(); i++) {
            imageIcon = new ImageIcon(property.getPropertyImages().get(i));
            scaledImage = new ImageIcon(getScaledImage(imageIcon.getImage(), 140, 140));
            propertyImageList.add(scaledImage);
        }
    }

    private Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }

    public ArrayList<ImageIcon> getPropertyImageList() {
        return propertyImageList;
    }

    public JLabel getImageLabel() {
        return imageLabel;
    }

    public int getImageNo() {
        return imageNo;
    }

    public void setImageNo(int imageNo) {
        this.imageNo = imageNo;
    }

    public void nextImage() {
        imageNo++;
    }

    public void previousImage() {
        imageNo--;
    }
    // End of variables declaration
}
