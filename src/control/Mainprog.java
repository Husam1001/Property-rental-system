package control;

import view.LoginPage;
import view.LookAndFeel;

import javax.swing.*;

public class Mainprog {
    public static JFrame mainFrame;

    public static void main(String[] args) {
        mainFrame = new JFrame("Cyberjaya Online Rental Management System");
        mainFrame.setSize(340, 340);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setIconImage(new ImageIcon("src/assets/icon/house.png").getImage());
        LoginPage loginPage = new LoginPage();
        mainFrame.add(loginPage);
        loginPage.setVisible(true);
        mainFrame.setVisible(true);
    }
}
