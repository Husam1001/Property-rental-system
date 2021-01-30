package modle.Property;

import java.util.ArrayList;

public class Property {
  private final int id;
    private String title;
    private String propertyType;
    private String size;
    private double price;
    private  int NumberOfRoom;
    private  int numberOfBathroom;
    private String description;
    private   Address propertyLocation;
    private  ArrayList<String>propertyImages;

    public Property(int id, String title, String propertyType, double price, int numberOfRoom, int numberOfBathroom, String size, String description, Address propertyLocation, ArrayList<String> propertyImages) {
        this.id = id;
        this.title = title;
        this.propertyType = propertyType;
        this.price = price;
        NumberOfRoom = numberOfRoom;
        this.numberOfBathroom = numberOfBathroom;
        this.size = size;
        this.description=description;
        this.propertyLocation = propertyLocation;
        this.propertyImages = propertyImages;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfRoom() {
        return NumberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        NumberOfRoom = numberOfRoom;
    }

    public int getNumberOfBathroom() {
        return numberOfBathroom;
    }

    public void setNumberOfBathroom(int numberOfBathroom) {
        this.numberOfBathroom = numberOfBathroom;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Address getPropertyLocation() {
        return propertyLocation;
    }

    public void setPropertyLocation(Address propertyLocation) {
        this.propertyLocation = propertyLocation;
    }

    public ArrayList<String> getPropertyImages() {
        return propertyImages;
    }
    public boolean compare(Property comparableProperty){
        if (this.getId()!=comparableProperty.getId()) return false;
        else if (!this.title.equals(comparableProperty.title)) return false;
        else if (!this.propertyType.equals(comparableProperty.getPropertyType()))return false;
        else if(!this.size.equals(comparableProperty.size))return false;
        else if (!(this.NumberOfRoom ==comparableProperty.NumberOfRoom))return false;
        else if (!(this.numberOfBathroom==comparableProperty.numberOfBathroom))return false;
        else if (!(this.price==comparableProperty.price))return false;
        else if(!this.description.equals(comparableProperty.description))return false;
        else if (!this.getPropertyLocation().fullAddress.equals(comparableProperty.getPropertyLocation().fullAddress))return false;
        else if (!this.getPropertyLocation().city.equals(comparableProperty.getPropertyLocation().city))return false;
        else if (!(this.getPropertyLocation().postCode==comparableProperty.getPropertyLocation().postCode))return false;
        else return true;
    }

    public void setPropertyImages(ArrayList<String> propertyImages) {
        this.propertyImages = propertyImages;
    }
}
