package view;


import control.actionListener.NewPropertySaveButtonActionListener;
import control.actionListener.RemoveImageButtonActionPerformed;
import control.actionListener.UplodaPropertyImageActionListener;
import control.mouseListener.HomeMouseListener;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class AddPropertyPanel extends JPanel {
    
    private ArrayList<File> images;
    private JLabel imageNoLabel;
    private JSpinner RoomNoSpinner;
    private JLabel RooomNoLabel;
    private JButton SaveButton;
    private JLabel addressLabel;
    private JTextField addressTextField;
    private JLabel bathroomNoLabel;
    private JSpinner bathroomNoSpinner;
    private JComboBox<String> cityComboBox;
    private JLabel cityLabel;
    private JLabel descriptionLabel;
    private JTextArea descriptionTextArea;
    private JLabel homeLabel;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JLabel mainLabel;
    private JLabel postCodeLabel;
    private JTextField postCodeTextField;
    private JLabel priceLabel;
    private JTextField priceTextField;
    private JLabel propertySizeLabel;
    private JTextField propertySizeTextField;
    private JLabel propertyTypeLabel;
    private JComboBox<String> prpertyTypeComboBox;
    private JButton removeImageButton;
    private JButton selectImgButton;
    private JLabel selectImgLabel;
    private JLabel titleLabel;
    private JTextField titleTextField;

    public AddPropertyPanel() {
        initComponents();
    }

    private void initComponents() {
        images = new ArrayList<>();

        mainLabel = new JLabel();
        titleLabel = new JLabel();
        titleTextField = new JTextField();
        propertyTypeLabel = new JLabel();
        jSeparator1 = new JSeparator();
        prpertyTypeComboBox = new JComboBox<>();
        RooomNoLabel = new JLabel();
        RoomNoSpinner = new JSpinner();
        bathroomNoSpinner = new JSpinner();
        bathroomNoLabel = new JLabel();
        jSeparator2 = new JSeparator();
        selectImgLabel = new JLabel();
        selectImgButton = new JButton();
        jScrollPane1 = new JScrollPane();
        descriptionTextArea = new JTextArea();
        descriptionLabel = new JLabel();
        SaveButton = new JButton();
        addressLabel = new JLabel();
        addressTextField = new JTextField();
        propertySizeLabel = new JLabel();
        propertySizeTextField = new JTextField();
        homeLabel = new JLabel();
        cityLabel = new JLabel();
        postCodeLabel = new JLabel();
        postCodeTextField = new JTextField();
        jSeparator3 = new JSeparator();
        jSeparator4 = new JSeparator();
        cityComboBox = new JComboBox<>();
        removeImageButton = new JButton();
        imageNoLabel = new JLabel();
        priceLabel = new JLabel();
        priceTextField = new JTextField();



        setBackground(new Color(255, 255, 255));
        setName("");
        setLayout(null);

        mainLabel.setFont(new Font("Dialog", 3, 18));
        mainLabel.setForeground(new Color(172, 198, 94));
        mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainLabel.setText("Add Property");
        mainLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        add(mainLabel);
        mainLabel.setBounds(184, 12, 179, 25);

        titleLabel.setFont(new Font("Dialog", 3, 14));
        titleLabel.setForeground(new Color(41, 57, 74));
        titleLabel.setLabelFor(titleTextField);
        titleLabel.setText("Title");
        add(titleLabel);
        titleLabel.setBounds(62, 55, 40, 26);

        titleTextField.setToolTipText("");
        titleTextField.setName("");
        add(titleTextField);
        titleTextField.setBounds(184, 56, 250, 26);

        propertyTypeLabel.setFont(new Font("Dialog", 3, 14));
        propertyTypeLabel.setForeground(new Color(41, 57, 74));
        propertyTypeLabel.setText("Property Type");
        add(propertyTypeLabel);
        propertyTypeLabel.setBounds(54, 104, 104, 17);
        add(jSeparator1);
        jSeparator1.setBounds(0, 167, 542, 2);

        prpertyTypeComboBox.setFont(new Font("Dialog", 0, 12));
        prpertyTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Bungalow", "Cottage", "Chattel house", "Townhouse","Apartment/ Flat","Duplex/ Studio" }));
        add(prpertyTypeComboBox);
        prpertyTypeComboBox.setBounds(184, 100, 250, 24);

        RooomNoLabel.setFont(new Font("Dialog", 1, 14));
        RooomNoLabel.setForeground(new Color(41, 57, 74));
        RooomNoLabel.setLabelFor(RoomNoSpinner);
        RooomNoLabel.setText("Room no");
        add(RooomNoLabel);
        RooomNoLabel.setBounds(47, 187, 93, 26);
        add(RoomNoSpinner);
        RoomNoSpinner.setBounds(190, 188, 60, 26);
        add(bathroomNoSpinner);
        bathroomNoSpinner.setBounds(190, 233, 60, 28);

        bathroomNoLabel.setFont(new Font("Dialog", 1, 14));
        bathroomNoLabel.setForeground(new Color(41, 57, 74));
        bathroomNoLabel.setLabelFor(bathroomNoSpinner);
        bathroomNoLabel.setText("Bathroom no");
        add(bathroomNoLabel);
        bathroomNoLabel.setBounds(47, 232, 109, 28);
        add(jSeparator2);
        jSeparator2.setBounds(0, 290, 542, 2);

        selectImgLabel.setFont(new Font("Dialog", 1, 14));
        selectImgLabel.setForeground(new Color(41, 57, 74));
        selectImgLabel.setLabelFor(selectImgButton);
        selectImgLabel.setText("Upload Picture..");
        add(selectImgLabel);
        selectImgLabel.setBounds(51, 562, 125, 25);

        selectImgButton.setBackground(new Color(200, 223, 250));
        selectImgButton.setFont(new Font("Dialog", 1, 14));
        selectImgButton.setForeground(new Color(41, 57, 74));
        selectImgButton.setText("Upload");
        selectImgButton.setBorder(new  javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectImgButton.addActionListener(new UplodaPropertyImageActionListener(this));
        add(selectImgButton);
        selectImgButton.setBounds(178, 563, 60, 23);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        add(jScrollPane1);
        jScrollPane1.setBounds(176, 304, 316, 78);

        descriptionLabel.setFont(new Font("Dialog", 1, 14));
        descriptionLabel.setForeground(new Color(41, 57, 74));
        descriptionLabel.setLabelFor(descriptionTextArea);
        descriptionLabel.setText("Description");
        add(descriptionLabel);
        descriptionLabel.setBounds(35, 339, 90, 17);

        SaveButton.setBackground(new Color(172, 198, 94));
        SaveButton.setFont(new Font("Dialog", 3, 14));
        SaveButton.setForeground(new Color(41, 57, 74));
        SaveButton.setText("Save");
        SaveButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SaveButton.addActionListener(new NewPropertySaveButtonActionListener(this));
        add(SaveButton);
        SaveButton.setBounds(209, 620, 107, 37);

        addressLabel.setFont(new Font("Dialog", 1, 14));
        addressLabel.setLabelFor(addressTextField);
        addressLabel.setText("Address");
        add(addressLabel);
        addressLabel.setBounds(35, 422, 90, 17);
        add(addressTextField);
        addressTextField.setBounds(176, 414, 316, 33);

        propertySizeLabel.setFont(new Font("Dialog", 1, 14));
        propertySizeLabel.setForeground(new Color(41, 57, 74));
        propertySizeLabel.setLabelFor(propertySizeTextField);
        propertySizeLabel.setText("Size");
        add(propertySizeLabel);
        propertySizeLabel.setBounds(54, 140, 33, 17);

        add(propertySizeTextField);
        propertySizeTextField.setBounds(184, 136, 250, 25);

        homeLabel.setForeground(new Color(51, 0, 51));
        homeLabel.setText("Home");
        add(homeLabel);
        homeLabel.setBounds(478, 12, 52, 25);
        homeLabel.addMouseListener(new HomeMouseListener());
        cityLabel.setLabelFor(cityComboBox);
        cityLabel.setText("City");
        add(cityLabel);
        cityLabel.setBounds(35, 476, 53, 15);

        postCodeLabel.setLabelFor(postCodeTextField);
        postCodeLabel.setText("Post Code");
        add(postCodeLabel);
        postCodeLabel.setBounds(332, 474, 76, 19);

        postCodeTextField.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        add(postCodeTextField);
        postCodeTextField.setBounds(420, 472, 72, 24);
        add(jSeparator3);
        jSeparator3.setBounds(0, 404, 542, 2);
        add(jSeparator4);
        jSeparator4.setBounds(0, 525, 542, 2);

        cityComboBox.setFont(new Font("Dialog", 0, 12));
        cityComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Kuala Lumpur","Subang Jaya","CyberJaya","Ipoh", "Kuching", "Johor Bahru","Shah Alam","Petaling Jaya" }));
        add(cityComboBox);
        cityComboBox.setBounds(176, 471, 144, 24);

        removeImageButton.setBackground(new Color(250, 101, 133));
        removeImageButton.setFont(new Font("Dialog", 0, 14));
        removeImageButton.setForeground(new Color(255, 255, 255));
        removeImageButton.setText("remove");
        removeImageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeImageButton.addActionListener(new RemoveImageButtonActionPerformed(this));
        removeImageButton.setVisible(false);
        add(removeImageButton);
        removeImageButton.setBounds(427, 563, 58, 23);

        imageNoLabel.setText("0");
        add(imageNoLabel);
        imageNoLabel.setBounds(401, 561, 8, 27);
        imageNoLabel.setVisible(false);
        priceLabel.setFont(new Font("Dialog", 1, 14));
        priceLabel.setLabelFor(priceTextField);
        priceLabel.setText("Price");
        add(priceLabel);
        priceLabel.setBounds(288, 192, 40, 17);

        add(priceTextField);
        priceTextField.setBounds(354, 187, 86, 27);
    }





    public ArrayList<File> getImages() {
        return images;
    }

    public JSpinner getRoomNoSpinner() {
        return RoomNoSpinner;
    }

    public JTextField getAddressTextField() {
        return addressTextField;
    }

    public JSpinner getBathroomNoSpinner() {
        return bathroomNoSpinner;
    }

    public JComboBox<String> getCityComboBox() {
        return cityComboBox;
    }

    public JTextArea getDescriptionTextArea() {
        return descriptionTextArea;
    }


    public JTextField getPostCodeTextField() {
        return postCodeTextField;
    }

    public JTextField getPropertySizeTextField() {
        return propertySizeTextField;
    }

    public JComboBox<String> getPrpertyTypeComboBox() {
        return prpertyTypeComboBox;
    }

    public JTextField getTitleTextField() {
        return titleTextField;
    }

    public JLabel getImageNoLabel() {
        return imageNoLabel;
    }

    public JButton getRemoveImageButton() {
        return removeImageButton;
    }

    public JTextField getPriceTextField() {
        return priceTextField;
    }

    public String inputValidation(){
        if(getTitleTextField().getText().isEmpty()){
            return "Title Cannot be Empty";
        }
        if(getPrpertyTypeComboBox().getSelectedItem().toString().isEmpty()){
            return "Property Type Cannot be Empty";
        }
        if(getPropertySizeTextField().getText().isEmpty()){
            return "Property Size Cannot be Empty";
        }
        if(Integer.parseInt(getRoomNoSpinner().getValue().toString())<=0){
            return "RoomNo Cannot be zero";
        }
        if(Integer.parseInt(getBathroomNoSpinner().getValue().toString())<=0){
            return "BathroomNo Cannot be zero";
        }
        if(getDescriptionTextArea().getText().isEmpty()){
            return "Description Cannot be Empty";
        }
        if(getAddressTextField().getText().isEmpty()){
            return "Address Cannot be Empty";
        }
        if(getCityComboBox().getSelectedItem().toString().isEmpty()){
            return "City Cannot be Empty";
        }

        if(getPostCodeTextField().getText().isEmpty()){
            return "PostCode be Empty";
        }
        if (getImages().isEmpty()){
            return "Image cannot be Empty at least 1 image ";
        }
        if (getPriceTextField().getText().isEmpty()){
            return "Price cannot be Empty";
        }
        return null;
    }



}

