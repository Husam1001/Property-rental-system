package view;

import control.actionListener.managePropertyActionListener.SaveUpdateButtonActionListener;
import control.mouseListener.HomeMouseListener;
import model.Property.Property;

import javax.swing.*;


/**
 *
 * @author husam
 */
public class UpdatePropertyView extends JPanel {

    // Variables declaration -
    private JSpinner roomNoSpinner;
    private JLabel roomNoLabel;
    private JButton updateButton;
    private JLabel addressLabel;
    private JTextField addressTextField;
    private JLabel bathroomNoLabel;
    private JSpinner bathroomNoSpinner;
    private JComboBox<String> cityComboBox;
    private JLabel cityLabel;
    private JLabel descriptionLabel;
    private JTextArea descriptionTextArea;
    private JButton backButton;
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
    private JLabel titleLabel;
    private JTextField titleTextField;
    private final Property property;


    public UpdatePropertyView(Property property) {
        this.property=property;
        initComponents();
        setData();
    }

    public JSpinner getRoomNoSpinner() {
        return roomNoSpinner;
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

        if (getPriceTextField().getText().isEmpty()){
            return "Price cannot be Empty";
        }
        return null;
    }

    public Property getProperty() {
        return property;
    }

    public  void setData(){
        this.titleTextField.setText(property.getTitle());
        this.prpertyTypeComboBox.setSelectedItem(property.getPropertyType());
        this.propertySizeTextField.setText(property.getSize());
        this.roomNoSpinner.setValue(property.getNumberOfRoom());
        this.bathroomNoSpinner.setValue(property.getNumberOfBathroom());
        this.priceTextField.setText(String.valueOf(property.getPrice()));
        this.descriptionTextArea.setText(property.getDescription());
        this.addressTextField.setText(property.getPropertyLocation().getStreet());
        this.cityComboBox.setSelectedItem(property.getPropertyLocation().getCity());
        this.postCodeTextField.setText(String.valueOf(property.getPropertyLocation().getPostCode()));
    }


    private void initComponents() {

        mainLabel = new JLabel();
        titleLabel = new JLabel();
        titleTextField = new JTextField();
        propertyTypeLabel = new JLabel();
        jSeparator1 = new JSeparator();
        prpertyTypeComboBox = new JComboBox<>();
        roomNoLabel = new JLabel();
        roomNoSpinner = new JSpinner();
        bathroomNoSpinner = new JSpinner();
        bathroomNoLabel = new JLabel();
        jSeparator2 = new JSeparator();
        jScrollPane1 = new JScrollPane();
        descriptionTextArea = new JTextArea();
        descriptionLabel = new JLabel();
        updateButton = new JButton();
        addressLabel = new JLabel();
        addressTextField = new JTextField();
        propertySizeLabel = new JLabel();
        propertySizeTextField = new JTextField();
        backButton = new JButton();
        cityLabel = new JLabel();
        postCodeLabel = new JLabel();
        postCodeTextField = new JTextField();
        jSeparator3 = new JSeparator();
        jSeparator4 = new JSeparator();
        cityComboBox = new JComboBox<>();
        priceLabel = new JLabel();
        priceTextField = new JTextField();



        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setLayout(null);

        mainLabel.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(172, 198, 94));
        mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainLabel.setText("Update Property");
        mainLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        add(mainLabel);
        mainLabel.setBounds(184, 12, 179, 25);

        titleLabel.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(41, 57, 74));
        titleLabel.setLabelFor(titleTextField);
        titleLabel.setText("Title");
        add(titleLabel);
        titleLabel.setBounds(62, 55, 40, 26);

        titleTextField.setToolTipText("");
        titleTextField.setName(""); // NOI18N
        add(titleTextField);
        titleTextField.setBounds(184, 56, 250, 26);

        propertyTypeLabel.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        propertyTypeLabel.setForeground(new java.awt.Color(41, 57, 74));
        propertyTypeLabel.setText("Prperty Type");
        add(propertyTypeLabel);
        propertyTypeLabel.setBounds(54, 104, 104, 17);
        add(jSeparator1);
        jSeparator1.setBounds(0, 167, 542, 2);

        prpertyTypeComboBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        prpertyTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Bungalow", "Cottage", "Chattel house", "Townhouse","Apartment/ Flat","Duplex/ Studio" }));
        add(prpertyTypeComboBox);
        prpertyTypeComboBox.setBounds(184, 100, 250, 24);

        roomNoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        roomNoLabel.setForeground(new java.awt.Color(41, 57, 74));
        roomNoLabel.setLabelFor(roomNoSpinner);
        roomNoLabel.setText("Room no");
        add(roomNoLabel);
        roomNoLabel.setBounds(47, 187, 93, 26);
        add(roomNoSpinner);
        roomNoSpinner.setBounds(190, 188, 60, 26);
        add(bathroomNoSpinner);
        bathroomNoSpinner.setBounds(190, 233, 60, 28);

        bathroomNoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bathroomNoLabel.setForeground(new java.awt.Color(41, 57, 74));
        bathroomNoLabel.setLabelFor(bathroomNoSpinner);
        bathroomNoLabel.setText("Bathroom no");
        add(bathroomNoLabel);
        bathroomNoLabel.setBounds(47, 232, 109, 28);
        add(jSeparator2);
        jSeparator2.setBounds(0, 290, 542, 2);


        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        add(jScrollPane1);
        jScrollPane1.setBounds(176, 304, 316, 78);

        descriptionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(41, 57, 74));
        descriptionLabel.setLabelFor(descriptionTextArea);
        descriptionLabel.setText("Description");
        add(descriptionLabel);
        descriptionLabel.setBounds(35, 339, 90, 17);

        updateButton.setBackground(new java.awt.Color(172, 198, 94));
        updateButton.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(41, 57, 74));
        updateButton.setText("Update");
        updateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addActionListener(new SaveUpdateButtonActionListener(this));
        add(updateButton);
        updateButton.setBounds(209, 560, 107, 37);

        addressLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addressLabel.setLabelFor(addressTextField);
        addressLabel.setText("Address");
        add(addressLabel);
        addressLabel.setBounds(35, 422, 90, 17);
        add(addressTextField);
        addressTextField.setBounds(176, 414, 316, 33);

        propertySizeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        propertySizeLabel.setForeground(new java.awt.Color(41, 57, 74));
        propertySizeLabel.setLabelFor(propertySizeTextField);
        propertySizeLabel.setText("Size");
        add(propertySizeLabel);
        propertySizeLabel.setBounds(54, 140, 33, 17);

        add(propertySizeTextField);
        propertySizeTextField.setBounds(184, 136, 250, 25);

        backButton.setForeground(new java.awt.Color(51, 0, 51));
        backButton.setText("Home");
        add(backButton);
        backButton.setBounds(460, 12, 80, 25);
        backButton.addActionListener(new HomeMouseListener());
        cityLabel.setLabelFor(cityComboBox);
        cityLabel.setText("City");
        add(cityLabel);
        cityLabel.setBounds(35, 476, 53, 15);

        postCodeLabel.setLabelFor(postCodeTextField);
        postCodeLabel.setText("Post Code");
        add(postCodeLabel);
        postCodeLabel.setBounds(332, 474, 76, 19);

        postCodeTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        add(postCodeTextField);
        postCodeTextField.setBounds(420, 472, 72, 24);
        add(jSeparator3);
        jSeparator3.setBounds(0, 404, 542, 2);
        add(jSeparator4);
        jSeparator4.setBounds(0, 525, 542, 2);

        cityComboBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cityComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Kuala Lumpur","Subang Jaya","CyberJaya","Ipoh", "Kuching", "Johor Bahru","Shah Alam","Petaling Jaya" }));
        add(cityComboBox);
        cityComboBox.setBounds(176, 471, 144, 24);

        priceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceLabel.setLabelFor(priceTextField);
        priceLabel.setText("Price");
        add(priceLabel);
        priceLabel.setBounds(288, 192, 40, 17);

        add(priceTextField);
        priceTextField.setBounds(354, 187, 86, 27);
    }// </editor-fold>

}

