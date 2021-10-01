package com.example.java.view;

import javax.swing.*;
import java.awt.*;

public class Paint extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        super.paintComponent(g);
        g.drawString("Hello", 10,20);
        g2.setColor(Color.RED);
        Rectangle paddle = new Rectangle(400,400, 50,10);
        g2.fillRect(400,400,50,10);
        g2.draw(paddle);
        this.setVisible(true);
    }
}
