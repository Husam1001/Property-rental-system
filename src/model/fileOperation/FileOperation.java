package model.fileOperation;

import control.Session;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperation {

    // addNewProperty() ->write the data Of the new property to a text modle.file
    public static boolean addNewProperty(String title, String type, String size, int roomNo, int bathroomNo, double price, String description, String address, String city, int postCode, ArrayList<File> imageList) {
        File propertyFile = new File("src/assets/files/property.txt");
        PrintWriter writer;
        int id = 0;
        try {
            id = generateId(propertyFile);
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return false;
        }
        try {
            writer = new PrintWriter(new FileWriter(propertyFile, true));
            writer.println(Session.getUser().getId() + "<>" + id + "<>" + title + "<>" + type + "<>" + size + "<>" + roomNo + "<>" + bathroomNo + "<>" + price + "<>" + description + "<>" + address + "<>" + city + "<>" + postCode + "<>");
            // copay the image to the source folder + print the modle.file path to a text modle.file
            saveImages(imageList, id);
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
        writer.close();
        return true;
    }

    public static boolean saveImages(ArrayList<File> imageList, int id) throws IOException {
//        //create a directory to store the images of each property
        try {
            Path path = Paths.get("src/assets/images/propertyImage/" + id + "/");
            //java.nio.modle.file.Files;
            Files.createDirectories(path);
            System.out.println("Directory is created!");
        } catch (IOException e) {

            System.err.println("Failed to create directory!" + e.getMessage());
        }

        File imageListFile = new File("src/assets/files/propertyImageList.txt");
        PrintWriter printWriter;
        File destination;
        printWriter = new PrintWriter(new FileWriter(imageListFile, true));
        printWriter.print(id + "<>");
        for (var image :
                imageList) {
            //copy image to the destination modle.file
            destination = new File("src/assets/images/propertyImage/" + id, image.getName());
            FileUtils.copyFile(image, destination);
            //write the modle.file bath to the text modle.file
            printWriter.print(destination + "<>");
        }
        printWriter.println();
        printWriter.close();
        return true;
    }

    public static boolean removeProperty(int id) {
        File property = new File("src/assets/files/property.txt");
        File tempFile = new File("src/assets/files/tempFile.txt");
        PrintWriter writer = null;
        Scanner read = null;
        String temp1, temp2;
        try {
            read = new Scanner(property);
            read.useDelimiter("<>");
            writer = new PrintWriter(tempFile);
            read = new Scanner(property);
            read.useDelimiter("<>");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (read.hasNext()) {
            temp1 = read.next();
            temp2 = read.next();
            if (!temp2.equals(String.valueOf(id))) {
                writer.println(temp1 + "<>" + temp2 + read.nextLine());
            } else read.nextLine();
        }
        property.delete();
        tempFile.renameTo(new File("src/assets/files/property.txt"));
        writer.close();
        read.close();
        removePropertyImage(id);
        return true;
    }

    public static void removePropertyImage(int id) {
        File imageDirectory = new File("src/assets/images/propertyImage/" + id);
        String[] entries = imageDirectory.list();
        for (String s : entries) {
            File currentFile = new File(imageDirectory.getPath(), s);
            currentFile.delete();
        }
        imageDirectory.delete();
    }

    //103<>Sifat1001<>pass125<>Sifat<>098877584<>sifat@gmail.com<>
    public static boolean registerNewAgent(String username,String password,String name,String phone ,String email){
        File agentInfo=new File("src/assets/files/AgentInfo.txt");
        PrintWriter writer;
        int id;
        try {
             writer= new PrintWriter(new FileWriter(agentInfo, true));
             id=generateId(agentInfo);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        writer.println(id+"<>"+username+"<>"+password+"<>"+name+"<>"+phone+"<>"+email+"<>");
        writer.close();
        return true;
    }


    /**
     * @param file to check the used id
     * @return unique id based on the give model.file
     */
    public static int generateId(File file) throws FileNotFoundException {
        Scanner read = new Scanner(file);
        int randId = 0;
        read.useDelimiter("<>");
        ArrayList<Integer> id = new ArrayList<>();
        //read all id from the text modle.file ad store it to the arrayList
        while (read.hasNext()) {
            id.add(Integer.parseInt(read.next()));
            read.nextLine();
        }

        do {
            randId = (int) (Math.random() * (999999 - 999 + 1) + 999);
        } while (id.contains(randId));
        return randId;
    }


}
