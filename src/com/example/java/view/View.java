package com.example.java.view;

import com.example.java.model.Paddle;
import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    private JPanel panel;
    private Graphics g;
    private JLabel label;
    private Paddle paddle;
    private JPanel paddlePanel;
    //private JLabel testLabel;

    public void createFrame(){
        frame = new JFrame();
        paddlePanel = new JPanel();
        panel = new JPanel();

        frame.setSize(500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Breakout Ball");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);

        Paint p = new Paint();
        frame.add(p);
        frame.setVisible(true);


    }


    public void initGamePieces(Paddle paddle) {
        initPaddle(paddle);
    }

    public void initPaddle(Paddle paddleArg){
        paddle = paddleArg;
        System.out.println("x: " + paddleArg.getX());
        System.out.println("y: " + paddleArg.getY());

    }


}
