package com.example.java.view;

import com.example.java.model.Paddle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
//import javafx.application.Application;

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
        //g = new Graphics();

        //frame.setBounds(200,100, 700, 600);
        frame.setSize(500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Breakout Ball");
        //frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);

        Paint p = new Paint();
        frame.add(p);
        frame.setVisible(true);
        //p.paintStuff(Graphics g);
        //frame.getContentPane().add(p);

        //panel.setBorder(BorderFactory.createEmptyBorder(300,300,300,300));
        //panel.add(p);
        //panel.setBackground(Color.BLACK);
        //panel.setLayout(new GridLayout(0,1));
        //frame.add(panel);

        //g.drawImage(paddle.getImage());
        //System.out.println(paddle.getImage());
        /*
        panel.setBorder(BorderFactory.createEmptyBorder(300,300,300,300));
        //panel.setLayout(new GridLayout(0,1));
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.add(paddle);
        paddle.setBounds(new Rectangle(new Point(800, 800), paddle.getPreferredSize()));
        //panel.add(paddle);
        panel.revalidate();
        panel.repaint();

         */


        //panel.setVisible(true);
        //frame.add(panel,BorderLayout.CENTER);
        //frame.pack();

    }


    public void initGamePieces(Paddle paddle) {
        initPaddle(paddle);
    }

    public void initPaddle(Paddle paddleArg){
        //paddle = new JLabel(new ImageIcon(paddleArg.getBufferedImage()));
        //paddle.setLocation(paddleArg.getX(), paddleArg.getY());
        //paddle.setBounds(new Rectangle(new Point(paddleArg.getX(), paddleArg.getY()), paddle.getPreferredSize()));

        paddle = paddleArg;
        System.out.println("x: " + paddleArg.getX());
        System.out.println("y: " + paddleArg.getY());

    }


}
