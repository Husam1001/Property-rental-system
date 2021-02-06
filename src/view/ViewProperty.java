package view;


import control.actionListener.ManagePropertyActionListener;
import control.actionListener.managePropertyActionListener.ViewPropertyImageSliderActionListener;
import model.Property.Property;


import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class ViewProperty extends JPanel {

    private JLabel addressLabel;
    private JButton backButton;
    private JLabel bathroomNoLabel;
    private JLabel cityLabel;
    private JLabel descriptionLabel;
    private JPanel descriptionPanel;
    private JTextPane descriptionTextPane;
    private JLabel imageLabel;
    private JScrollPane jScrollPane1;
    private JLabel lCityLabel;
    private JButton leftButton;
    private JLabel locationLabel;
    private JPanel locationPanel;
    private JLabel postcodeLabel;
    private JLabel priceLabel;
    private JPanel propertyInfoPanle;
    private JButton rightButton;
    private JLabel roomNoLabel;
    private JLabel sizeLabel;
    private JLabel titleLabel;
    private JLabel typeLabel;
    private ArrayList<ImageIcon> propertyImage;
    private int imageNo=0;  
   private final Property property;
    public ViewProperty(Property property) {
        this.property=property;
        initComponents();
        loadImageList();
    }

    private void initComponents() {

        imageLabel = new JLabel();
        backButton = new JButton();
        rightButton = new JButton();
        leftButton = new JButton();
        locationPanel = new JPanel();
        locationLabel = new JLabel();
        lCityLabel = new JLabel();
        addressLabel = new JLabel();
        postcodeLabel = new JLabel();
        descriptionPanel = new JPanel();
        jScrollPane1 = new JScrollPane();
        descriptionTextPane = new JTextPane();
        propertyInfoPanle = new JPanel();
        typeLabel = new JLabel();
        roomNoLabel = new JLabel();
        bathroomNoLabel = new JLabel();
        sizeLabel = new JLabel();
        priceLabel = new JLabel();
        cityLabel = new JLabel();
        titleLabel = new JLabel();
        descriptionLabel = new JLabel();
        propertyImage=new ArrayList<>();
        setBackground(new Color(255, 255, 255));
        setLayout(null);



        ImageIcon tempImage=new ImageIcon(property.getPropertyImages().get(0));
        ImageIcon tempImage2=new ImageIcon(getScaledImage(tempImage.getImage(),472,303 ));
        imageLabel.setIcon(tempImage2);
        imageLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        add(imageLabel);
        imageLabel.setBounds(68, 41, 472, 224);

        backButton.setBackground(new Color(204, 255, 204));
        backButton.setText("Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new ManagePropertyActionListener());
        add(backButton);
        backButton.setBounds(582, 12, 56, 21);

        rightButton.setText(">>");
        rightButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rightButton.addActionListener(new ViewPropertyImageSliderActionListener(this));
        add(rightButton);
        rightButton.setBounds(400, 283, 61, 27);

        leftButton.setText("<<");
        leftButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leftButton.addActionListener(new ViewPropertyImageSliderActionListener(this));
        add(leftButton);
        leftButton.setBounds(103, 283, 66, 27);

        locationPanel.setLayout(null);

        locationLabel.setText("Location");
        locationPanel.add(locationLabel);
        locationLabel.setBounds(22, 12, 61, 15);

        lCityLabel.setFont(new Font("Dialog", 0, 12));
        lCityLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/locationIcon.png"))); 
        lCityLabel.setText(property.getPropertyLocation().getCity());
        locationPanel.add(lCityLabel);
        lCityLabel.setBounds(22, 45, 250, 18);

        addressLabel.setFont(new Font("Dialog", 0, 12)); 
        addressLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/locationIcon.png"))); 
        addressLabel.setText(property.getPropertyLocation().getStreet());
        locationPanel.add(addressLabel);
        addressLabel.setBounds(22, 81, 600, 18);

        postcodeLabel.setFont(new Font("Dialog", 0, 12)); 
        postcodeLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/postcodeIcon.png"))); 
        postcodeLabel.setText(String.valueOf(property.getPropertyLocation().getPostCode()));
        locationPanel.add(postcodeLabel);
        postcodeLabel.setBounds(22, 117, 100, 16);

        add(locationPanel);
        locationPanel.setBounds(4, 464, 634, 145);

        descriptionPanel.setBackground(new Color(255, 255, 255));
        descriptionPanel.setLayout(null);
        descriptionTextPane.setText(property.getDescription());
        descriptionTextPane.setEditable(false);
        jScrollPane1.setViewportView(descriptionTextPane);

        descriptionPanel.add(jScrollPane1);
        jScrollPane1.setBounds(12, 0, 616, 260);

        add(descriptionPanel);
        descriptionPanel.setBounds(4, 647, 640, 272);

        propertyInfoPanle.setBackground(new Color(255, 255, 255));
        propertyInfoPanle.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        propertyInfoPanle.setName(""); 
        propertyInfoPanle.setLayout(null);

        typeLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/propertyIcon.png"))); 
        typeLabel.setText(property.getPropertyType());
        propertyInfoPanle.add(typeLabel);
        typeLabel.setBounds(62, 17, 164, 18);

        roomNoLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/bedroomIcon.png"))); 
        roomNoLabel.setText(property.getNumberOfRoom()+" Bedrooms");
        propertyInfoPanle.add(roomNoLabel);
        roomNoLabel.setBounds(254, 17, 167, 18);

        bathroomNoLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/bathroomIcon.png"))); 
        bathroomNoLabel.setText(property.getNumberOfBathroom()+" Bathrooms");
        propertyInfoPanle.add(bathroomNoLabel);
        bathroomNoLabel.setBounds(254, 68, 178, 18);

        sizeLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/propertySizeIcon.png"))); 
        sizeLabel.setText(property.getSize()+" sq.ft");
        propertyInfoPanle.add(sizeLabel);
        sizeLabel.setBounds(438, 68, 165, 18);

        priceLabel.setForeground(new Color(190, 9, 9));
        priceLabel.setFont(new Font("Dialog", 3, 12));
        priceLabel.setText("RM "+property.getPrice());
        propertyInfoPanle.add(priceLabel);
        priceLabel.setBounds(62, 70, 124, 15);

        cityLabel.setIcon(new ImageIcon(getClass().getResource("/assets/icon/locationIcon.png"))); 
        cityLabel.setText(property.getPropertyLocation().getCity());
        propertyInfoPanle.add(cityLabel);
        cityLabel.setBounds(438, 17, 149, 18);

        add(propertyInfoPanle);
        propertyInfoPanle.setBounds(22, 353, 616, 99);
        propertyInfoPanle.getAccessibleContext().setAccessibleName("");

        titleLabel.setText(property.getTitle());
        add(titleLabel);
        titleLabel.setBounds(27, 322, 576, 25);

        descriptionLabel.setFont(new Font("Dialog", 1, 14)); 
        descriptionLabel.setText("Description");
        add(descriptionLabel);
        descriptionLabel.setBounds(12, 615, 143, 26);
    }


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
        for (int i = 0; i <property.getPropertyImages().size() ; i++) {
            tempImage=new ImageIcon(property.getPropertyImages().get(i));
            propertyImage.add(new ImageIcon(getScaledImage(tempImage.getImage(),472,303)));
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


}