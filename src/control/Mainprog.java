package control;

import view.LoginPage;

import javax.swing.*;

public class Mainprog {
    public static JFrame main;

    public static void main(String[] args) {
        main = new JFrame("Cyberjaya Online Rental Management System");
        main.setSize(340, 340);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setResizable(false);
        LoginPage obj = new LoginPage();
        main.add(obj);
        obj.setVisible(true);
        main.setVisible(true);
    }
}
