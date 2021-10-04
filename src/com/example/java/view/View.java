package com.example.java.view;

import com.example.java.model.Model;
import com.example.java.model.Paddle;
import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
    private JFrame frame;
    private Graphics g;
    private JLabel label;
    private Paddle paddle;
    private JPanel paddlePanel;
    private static Model model;
    private MyPanel panel;
    //private JLabel testLabel;

    public View(){
        model  = new Model();
    }

    //Creates Frame object
    //Creates MyPanel object
    //Paints MyPanel object
    public void createFrame(Model modelArg){
        model = modelArg;
        frame = new JFrame();

        frame.setSize(500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Breakout Ball");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setResizable(false);
        panel = new MyPanel();

        panel.updateModel(model);

        frame.add(panel);

        frame.setVisible(true);
    }


    public void updateView(Model modelArg){
        model = modelArg;
        revalidate();
        panel.updateModel(model);
        panel.repaint();
    }




    public static void draw(Graphics2D g2){
        draw(g2, model.getPaddle());
    }

    public static void draw(Graphics2D g2, Paddle paddle){
        Rectangle paddleImage = new Rectangle(paddle.getX(),paddle.getY(), paddle.getWidth(),paddle.getHeight());
        g2.draw(paddleImage);
    }

    /*
    public void initGamePieces(Paddle paddle) {
        initPaddle(paddle);
    }

    public void initPaddle(Paddle paddleArg){
        paddle = paddleArg;
        System.out.println("x: " + paddleArg.getX());
        System.out.println("y: " + paddleArg.getY());

    }

     */


}
