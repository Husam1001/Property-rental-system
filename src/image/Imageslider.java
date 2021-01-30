package image;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

class Imageslider extends JFrame  implements ActionListener
{

    ImageIcon s[];
    JLabel l;
    JButton b1,b2;
    int i,l1;
    JPanel p;
    public static int imgno=0;
    public Imageslider()
    {
        setLayout(new BorderLayout( ));
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel p=new JPanel(new FlowLayout());
        b1=new JButton("<<");
        b2=new JButton(">>");
        p.add(b1);
        p.add(b2);
        add(p,BorderLayout.SOUTH);
        b1.addActionListener(this);
        b2.addActionListener(this);
        s = new ImageIcon[3];
        ImageIcon imageIcon=new ImageIcon("src/image/1.jpg");
        s[0] = new ImageIcon( getScaledImage(imageIcon.getImage(),300,300));
        s[1] = new ImageIcon("src/image/2.jpg");
        s[2] = new ImageIcon("src/image/3.jpg");
        l = new JLabel("",JLabel.CENTER);
        add(l,BorderLayout.CENTER);
        l.setIcon(s[0]);

    }
    public  void actionPerformed(ActionEvent e)
    {


        if(e.getSource()==b1)
        {
            if (imgno>0){
                imgno-=1;
            }else
                imgno=s.length-1;
            l.setIcon(s[imgno]);
        }



        if(e.getSource()==b2)
        {

            if (imgno<s.length-1){
                imgno+=1;
            }else
                imgno=0;
            l.setIcon(s[imgno]);
            }


    }
    public static void main(String args[])
    {
        Imageslider obj = new Imageslider();
    }
    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }
}
