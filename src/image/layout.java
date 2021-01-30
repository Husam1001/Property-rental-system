package image;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class layout extends JFrame{

    public layout(){
        setSize(500,500);

        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(3,3));
        JButton btn;
        for (int i=1;i<31;i++){
            btn=new JButton(""+i);
            panel.add(btn);
        }
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
    // new layout();
        try {

            Path path = Paths.get("src/image/1/");

            //java.nio.file.Files;
            Files.createDirectories(path);

            System.out.println("Directory is created!");

        } catch (IOException e) {

            System.err.println("Failed to create directory!" + e.getMessage());

        }


    }


}
