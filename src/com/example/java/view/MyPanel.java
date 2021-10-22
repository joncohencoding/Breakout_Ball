package com.example.java.view;
import com.example.java.model.Ball;
import com.example.java.model.Brick;
import com.example.java.model.Model;
import com.example.java.model.Paddle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    private static Model model;
    public MyPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.BLACK);
        MyMouse myMouse = new MyMouse();
        addMouseListener(myMouse);
    }

    private class MyMouse extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            if(model.getPaddle().getX() == 30){
                model.getPaddle().setX(300);
                model.getBall().setX(10);
                model.getBrickArrayList().remove(0);
            }
            else{
                model.getPaddle().setX(30);
                model.getBall().setX(30);
                model.getBrickArrayList().remove(0);
            }

            repaint(); // repaint the whole JPanel
        }
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
        draw(g2, model.getPaddle());
        draw(g2, model.getBall());
        draw(g2, model.getBrickArrayList());
    }

    //Draw Paddle
    public static void draw(Graphics2D g2, Paddle paddle){
        Rectangle paddleImage = new Rectangle(paddle.getX(),paddle.getY(), paddle.getWidth(),paddle.getHeight());
        g2.setColor(paddle.getColor());
        g2.fill(paddleImage);
        g2.draw(paddleImage);
    }

    //Draw Ball
    public static void draw(Graphics2D g2, Ball ball){
        Double x = Double.valueOf(ball.getX());
        Double y = Double.valueOf(ball.getY());
        Double height = Double.valueOf(ball.getHeight());
        Double width = Double.valueOf(ball.getWidth());

        Ellipse2D ballImage = new Ellipse2D.Double(x, y, height, width);
        g2.setColor(ball.getColor());
        g2.fill(ballImage);
        g2.draw(ballImage);
    }

    //Draw Bricks
    public static void draw(Graphics2D g2, ArrayList<Brick> brickArrayList) {
        for (Brick brick : brickArrayList) {
            draw(g2, brick);
        }
    }



    //Draw Brick
    public static void draw(Graphics2D g2, Brick brick){
        //g.clearRect(1,1, 500, 550);
        Rectangle paddleImage = new Rectangle(brick.getX(),brick.getY(), brick.getWidth(),brick.getHeight());
        g2.setColor(brick.getColor());
        g2.fill(paddleImage);
        g2.draw(paddleImage);
    }



}
