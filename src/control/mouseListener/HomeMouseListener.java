package control.mouseListener;

import control.Mainprog;
import view.AgentHomePage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HomeMouseListener implements MouseListener, ActionListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        Mainprog.mainFrame.setSize(800,442);
        AgentHomePage agentHomePage=new AgentHomePage();
        Mainprog.mainFrame.getContentPane().removeAll();
        Mainprog.mainFrame.repaint();
        Mainprog.mainFrame.add(agentHomePage);
        agentHomePage.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Mainprog.mainFrame.setSize(800,442);
        AgentHomePage agentHomePage=new AgentHomePage();
        Mainprog.mainFrame.getContentPane().removeAll();
        Mainprog.mainFrame.repaint();
        Mainprog.mainFrame.add(agentHomePage);
        agentHomePage.setVisible(true);
    }
}
