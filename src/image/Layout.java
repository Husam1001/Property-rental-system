package image;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.GapContent;
import java.awt.*;

public class Layout{

    public static void main(String[] args) {

        JFrame frame =new JFrame("Main Frame");

        JPanel panel=new JPanel();


        frame.setSize(500,500);
        JPanel panel1=null;
        JPanel panel2=new JPanel();
        JButton btn=new JButton("Click");
        panel2.setLayout(new BorderLayout());
        panel2.add(btn,BorderLayout.EAST);
        panel2.setBackground(Color.GREEN);
        panel2.setVisible(true);


       // panel.setSize(500,500);
        for (int i=1;i<=50;i++){

            panel1=new JPanel();
            panel1.setPreferredSize(new Dimension(200,210));

            panel1.add(new JLabel(""+i));
            if (i%2==0){

                panel1.setBackground(Color.CYAN);

            }else  panel1.setBackground(Color.YELLOW);

            panel1.setBorder(new EmptyBorder(50, 0, 0, 0));

            panel.add(panel1);
        }

        panel.setPreferredSize(new Dimension(460,(50/2)*220));

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JScrollPane scrollPane = new JScrollPane(panel);

        panel.setBackground(Color.black);

        scrollPane.setBackground(Color.red);

        frame.add(panel2,BorderLayout.PAGE_START);

        frame.add(scrollPane,BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

}
