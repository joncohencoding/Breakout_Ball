package com.example.java.view;

import com.example.java.model.Model;
import javax.swing.*;

public class View extends JFrame {
    private JFrame frame;
    private static Model model;
    private MyPanel panel;

    public View() {
        model = new Model();
    }

    //Creates Frame object
    //Creates MyPanel object
    //Paints MyPanel object
    public void createFrame(Model modelArg) {
        SwingUtilities.invokeLater((new Runnable() {
            @Override
            public void run() {
                model = modelArg;
                frame = new JFrame();

                frame.setSize(500, 550);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Breakout Ball");
                frame.setResizable(false);
                panel = new MyPanel();

                panel.updateModel(model);

                frame.add(panel);

                frame.setVisible(true);
            }
        }));
    }


    public void updateView(Model modelArg) throws InterruptedException {
        model = modelArg;
        panel.updateModel(model);
        revalidate();
        panel.repaint();

    }
}


