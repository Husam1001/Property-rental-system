package view;


import control.actionListener.managePropertyActionListener.DeletePropertyBtnActionListener;
import control.actionListener.managePropertyActionListener.ImageSliderActionListener;
import control.actionListener.managePropertyActionListener.UpdateBtnActionListener;
import control.actionListener.managePropertyActionListener.ViewBtnActionListener;
import model.Property.Property;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * @author husam
 */
public class PropertyDetailsWidget extends JPanel {

    private final Property property;
    // Variables declaration - do not modify
    private ArrayList<ImageIcon> propertyImageList;
    private JLabel bathroomNoLabel;
    private JLabel bedroomNoLabel;
    private JButton deleteButton;
    private JLabel imageLabel;
    private JSeparator jSeparator1;
    private JButton leftImageButton;
    private JLabel locationLabel;
    private JLabel priceLabel;
    private JLabel propertyTypeLabel;
    private JButton rightImageButton;
    private JLabel sizeLabel;
    private JLabel titleLabel;
    private JButton updateButton;
    private JButton viewButton;
    private int imageNo = 0;


    public PropertyDetailsWidget(Property property) {
        this.property = property;
        initComponents();
        setData();
    }


    private void initComponents() {
        propertyImageList = new ArrayList<>();
        imageLabel = new JLabel();
        leftImageButton = new JButton();
        rightImageButton = new JButton();
        titleLabel = new JLabel();
        priceLabel = new JLabel();
        propertyTypeLabel = new JLabel();
        bedroomNoLabel = new JLabel();
        sizeLabel = new JLabel();
        bathroomNoLabel = new JLabel();
        locationLabel = new JLabel();
        viewButton = new JButton();
        updateButton = new JButton();
        deleteButton = new JButton();
        jSeparator1 = new JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        imageLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/house.png"))); // NOI18N
        imageLabel.setBorder(BorderFactory.createEtchedBorder());

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

        priceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(204, 0, 0));


        propertyTypeLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        propertyTypeLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/propertyIcon.png"))); // NOI18N


        bedroomNoLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bedroomNoLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/bedroomIcon.png"))); // NOI18N


        sizeLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sizeLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/propertySizeIcon.png"))); // NOI18N


        bathroomNoLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bathroomNoLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/bathroomIcon.png"))); // NOI18N


        locationLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        locationLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/locationIcon.png"))); // NOI18N

        viewButton.setBackground(new java.awt.Color(255, 204, 204));
        viewButton.setText("View");
        viewButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewButton.addActionListener(new ViewBtnActionListener(property));

        updateButton.setBackground(new java.awt.Color(204, 255, 204));
        updateButton.setText("Update");
        updateButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.setMaximumSize(new java.awt.Dimension(56, 19));
        updateButton.addActionListener(new UpdateBtnActionListener(property));

        deleteButton.setBackground(new java.awt.Color(255, 153, 153));
        deleteButton.setText("Delete");
        deleteButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new DeletePropertyBtnActionListener(property.getId()));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(leftImageButton)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rightImageButton)
                                                .addGap(12, 12, 12))
                                        .addComponent(imageLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(propertyTypeLabel)
                                                        .addComponent(bedroomNoLabel)
                                                        .addComponent(priceLabel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(locationLabel)
                                                        .addComponent(bathroomNoLabel)
                                                        .addComponent(sizeLabel))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(viewButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(updateButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(imageLabel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(locationLabel)
                                                        .addComponent(priceLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(propertyTypeLabel)
                                                        .addComponent(sizeLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bedroomNoLabel)
                                                        .addComponent(bathroomNoLabel))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rightImageButton)
                                        .addComponent(leftImageButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE, false)
                                        .addComponent(updateButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

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
            scaledImage = new ImageIcon(getScaledImage(new ImageIcon(property.getPropertyImages().get(i)).getImage(), 140, 140));
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

}
