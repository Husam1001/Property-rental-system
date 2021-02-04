package model.User;

import model.Property.Property;

import java.util.ArrayList;

public class Agent extends User{
    private ArrayList<Property>propertyList;
    public Agent(int id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    public ArrayList<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(ArrayList<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public boolean addProperty(Property property){
       return propertyList.add(property);
    }
    public boolean removeProperty(Property property){
        return propertyList.remove(property);
    }

}
