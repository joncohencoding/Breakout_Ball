package com.example.java.view;
import com.example.java.model.Model;
import com.example.java.model.Paddle;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private static Model model;
    public MyPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.BLACK);
    }

    public Dimension getPreferredSize(){
        return new Dimension(500,700);
    }

    public void updateModel(Model modelArg){
        model = modelArg;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        draw(g2);
    }

    //Draw each game component
    public static void draw(Graphics2D g2){
        System.out.println(model.getPaddle().getX());
        draw(g2, model.getPaddle());
    }

    //Draw Paddle
    public static void draw(Graphics2D g2, Paddle paddle){
        Rectangle paddleImage = new Rectangle(paddle.getX(),paddle.getY(), paddle.getWidth(),paddle.getHeight());
        g2.setColor(Color.RED);
        g2.fill(paddleImage);
        g2.draw(paddleImage);
    }


}
