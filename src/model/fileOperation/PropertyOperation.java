package model.fileOperation;

import control.Session;
import model.Property.Address;
import model.Property.Property;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PropertyOperation {
    public static void main(String[] args) {

    }

    public static ArrayList<Property> getProperty() {
        ArrayList<Property> propertyList=new ArrayList<>();
        File propertyFile = new File("src/assets/files/property.txt");
        int propertyId;
        String title;
        String type;
        String size;
        int roomNo;
        double price;
        int bathRoomNo;
        String description;
        String address;
        String city;
        int postCode;
        Scanner read;

        try {
            read = new Scanner(propertyFile);
            read.useDelimiter("<>");
            while (read.hasNext()) {
                if (read.next().equals(String.valueOf(Session.getUser().getId()))){
                    propertyId = read.nextInt();
                    title = read.next();
                    type = read.next();
                    size = read.next();
                    roomNo = read.nextInt();
                    bathRoomNo = read.nextInt();
                    price = read.nextDouble();
                    description = read.next();
                    address = read.next();
                    city = read.next();
                    postCode = read.nextInt();
                   propertyList.add(new Property(propertyId, title, type, price, roomNo, bathRoomNo, size, description, new Address(city, address, postCode), getImageList(propertyId)));
                }
                read.nextLine();
            }
            return propertyList;

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static ArrayList<String> getImageList(int id) {
        File propertyImageListFile = new File("src/assets/files/propertyImageList.txt");
        ArrayList<String> imagePath = new ArrayList<>();
        Scanner read;
        try {
            read = new Scanner(propertyImageListFile);
            read.useDelimiter("<>");
            while (read.hasNext()) {
                if (read.next().equals(String.valueOf(id))) {
                    Scanner line = new Scanner(read.nextLine());
                    line.useDelimiter("<>");
                    while (line.hasNext()) {
                        imagePath.add(line.next());
                    }
                    return imagePath;
                }
                read.nextLine();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public static boolean updateProperty(Property property){

        File propertyFile=new File("src/assets/files/property.txt");

        File tempFile=new File("src/assets/files/tempFile.txt");
        String temp1,temp2;
        Scanner read=null;

        PrintWriter writer=null;

        try {
            writer=new PrintWriter(tempFile);
             read=new Scanner(propertyFile);
             read.useDelimiter("<>");
        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }
       while (read.hasNext()){
           temp1=read.next();
           temp2=read.next();
           if (!temp2.equals(String.valueOf(property.getId()))){
               writer.println(temp1+"<>"+temp2+read.nextLine());
              // writer.println(Session.getUser().getId() + "<>" + id + "<>" + title + "<>" + type + "<>" + size + "<>" + roomNo + "<>" + bathroomNo + "<>" + price + "<>" + description + "<>" + address + "<>" + city + "<>" + postCode + "<>");
           }else {
               writer.println(temp1 + "<>" + property.getId() + "<>" +
                       property.getTitle() + "<>" +
                       property.getPropertyType() + "<>" +
                       property.getSize() + "<>" +
                       property.getNumberOfRoom() + "<>" +
                       property.getNumberOfBathroom() + "<>" +
                       property.getPrice() + "<>" +
                       property.getDescription() + "<>" +
                       property.getPropertyLocation().getStreet() + "<>" +
                       property.getPropertyLocation().getCity() + "<>" +
                       property.getPropertyLocation().getPostCode() + "<>"
               );
               read.nextLine();
           }
       }

        writer.close();
        read.close();
       propertyFile.delete();
       tempFile.renameTo(propertyFile);
        return true;
    }

}
