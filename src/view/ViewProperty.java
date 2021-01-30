package view;


import control.actionListener.ManagePropertyActionListener;
import control.actionListener.managePropertyActionListener.ImageSliderActionListener;
import control.actionListener.managePropertyActionListener.ViewPropertyImageSliderActionListener;
import modle.Property.Property;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author husam
 */
public class ViewProperty extends javax.swing.JPanel {
   private Property property;
    public ViewProperty(Property property) {
        this.property=property;
        initComponents();
        loadImageList();
    }

    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        locationPanel = new javax.swing.JPanel();
        locationLabel = new javax.swing.JLabel();
        lCityLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        postcodeLabel = new javax.swing.JLabel();
        descriptionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextPane = new javax.swing.JTextPane();
        propertyInfoPanle = new javax.swing.JPanel();
        typeLabel = new javax.swing.JLabel();
        roomNoLabel = new javax.swing.JLabel();
        bathroomNoLabel = new javax.swing.JLabel();
        sizeLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        propertyImage=new ArrayList<>();
        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

       // imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/house.png"))); // NOI18N
        //imageLabel.setIcon(new ImageIcon(property.getPropertyImages().get(0)));

        ImageIcon tempImage=new ImageIcon(property.getPropertyImages().get(0));
        ImageIcon tempImage2=new ImageIcon(getScaledImage(tempImage.getImage(),472,224 ));
        imageLabel.setIcon(tempImage2);
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(imageLabel);
        imageLabel.setBounds(68, 41, 472, 224);

        backButton.setBackground(new java.awt.Color(204, 255, 204));
        backButton.setText("Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new ManagePropertyActionListener());
        add(backButton);
        backButton.setBounds(582, 12, 56, 21);

        rightButton.setText(">>");
        rightButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rightButton.addActionListener(new ViewPropertyImageSliderActionListener(this));
        add(rightButton);
        rightButton.setBounds(400, 283, 61, 27);

        leftButton.setText("<<");
        leftButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leftButton.addActionListener(new ViewPropertyImageSliderActionListener(this));
        add(leftButton);
        leftButton.setBounds(103, 283, 66, 27);

        locationPanel.setLayout(null);

        locationLabel.setText("Location");
        locationPanel.add(locationLabel);
        locationLabel.setBounds(22, 12, 61, 15);

        lCityLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lCityLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/locationIcon.png"))); // NOI18N
        lCityLabel.setText(property.getPropertyLocation().getCity());
        locationPanel.add(lCityLabel);
        lCityLabel.setBounds(22, 45, 250, 18);

        addressLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        addressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/locationIcon.png"))); // NOI18N
        addressLabel.setText(property.getPropertyLocation().getStreet());
        locationPanel.add(addressLabel);
        addressLabel.setBounds(22, 81, 600, 18);

        postcodeLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        postcodeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/postcodeIcon.png"))); // NOI18N
        postcodeLabel.setText(String.valueOf(property.getPropertyLocation().getPostCode()));
        locationPanel.add(postcodeLabel);
        postcodeLabel.setBounds(22, 117, 100, 16);

        add(locationPanel);
        locationPanel.setBounds(4, 464, 634, 145);

        descriptionPanel.setBackground(new java.awt.Color(255, 255, 255));
        descriptionPanel.setLayout(null);
        descriptionTextPane.setText(property.getDescription());
        descriptionTextPane.setEditable(false);
        jScrollPane1.setViewportView(descriptionTextPane);

        descriptionPanel.add(jScrollPane1);
        jScrollPane1.setBounds(12, 0, 616, 260);

        add(descriptionPanel);
        descriptionPanel.setBounds(4, 647, 640, 272);

        propertyInfoPanle.setBackground(new java.awt.Color(255, 255, 255));
        propertyInfoPanle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        propertyInfoPanle.setName(""); // NOI18N
        propertyInfoPanle.setLayout(null);

        typeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/propertyIcon.png"))); // NOI18N
        typeLabel.setText(property.getPropertyType());
        propertyInfoPanle.add(typeLabel);
        typeLabel.setBounds(62, 17, 164, 18);

        roomNoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bedroomIcon.png"))); // NOI18N
        roomNoLabel.setText(property.getNumberOfRoom()+" Bedrooms");
        propertyInfoPanle.add(roomNoLabel);
        roomNoLabel.setBounds(254, 17, 167, 18);

        bathroomNoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bathroomIcon.png"))); // NOI18N
        bathroomNoLabel.setText(property.getNumberOfBathroom()+" Bathrooms");
        propertyInfoPanle.add(bathroomNoLabel);
        bathroomNoLabel.setBounds(254, 68, 178, 18);

        sizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/propertySizeIcon.png"))); // NOI18N
        sizeLabel.setText(property.getSize()+" sq.ft");
        propertyInfoPanle.add(sizeLabel);
        sizeLabel.setBounds(438, 68, 165, 18);

        priceLabel.setForeground(new java.awt.Color(190, 9, 9));
        priceLabel.setFont(new java.awt.Font("Dialog", 3, 12));
        priceLabel.setText("RM "+property.getPrice());
        propertyInfoPanle.add(priceLabel);
        priceLabel.setBounds(62, 70, 124, 15);

        cityLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/locationIcon.png"))); // NOI18N
        cityLabel.setText(property.getPropertyLocation().getCity());
        propertyInfoPanle.add(cityLabel);
        cityLabel.setBounds(438, 17, 149, 18);

        add(propertyInfoPanle);
        propertyInfoPanle.setBounds(22, 353, 616, 99);
        propertyInfoPanle.getAccessibleContext().setAccessibleName("");

        titleLabel.setText(property.getTitle());
        add(titleLabel);
        titleLabel.setBounds(27, 322, 576, 25);

        descriptionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        descriptionLabel.setText("Description");
        add(descriptionLabel);
        descriptionLabel.setBounds(12, 615, 143, 26);
    }// </editor-fold>


    public JLabel getImageLabel() {
        return imageLabel;
    }

    public ArrayList<ImageIcon> getPropertyImage() {
        return propertyImage;
    }

    public int getImageNo() {
        return imageNo;
    }

    public void setImageNo(int imageNo) {
        this.imageNo = imageNo;
    }
    public void nextImage(){
        imageNo++;
    }
    public void previousImage(){
        imageNo--;
    }

    private void loadImageList(){
      ImageIcon tempImage;
//        ImageIcon tempImage2=new ImageIcon(getScaledImage(tempImage.getImage(),472,224 ));
        for (int i = 0; i <property.getPropertyImages().size() ; i++) {
            tempImage=new ImageIcon(property.getPropertyImages().get(i));
            propertyImage.add(new ImageIcon(getScaledImage(tempImage.getImage(),472,224)));
        }
    }
    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bathroomNoLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JTextPane descriptionTextPane;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCityLabel;
    private javax.swing.JButton leftButton;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JPanel locationPanel;
    private javax.swing.JLabel postcodeLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JPanel propertyInfoPanle;
    private javax.swing.JButton rightButton;
    private javax.swing.JLabel roomNoLabel;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel typeLabel;
    private ArrayList<ImageIcon> propertyImage;
    private int imageNo=0;
    // End of variables declaration
}