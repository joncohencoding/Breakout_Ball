package com.example.java.model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Paddle extends GamePiece {
    Image image;
    public Paddle() {
        image = null;
        try {
            image = ImageIO.read(new File("paddle2.png"));
            //System.out.println("bufferedImage created");
        } catch (IOException ex) {
            Logger.getLogger(Paddle.class.getName()).log(Level.SEVERE, null, ex);
            //System.out.println("bufferedImage not created");

        }

        System.out.println(image);

        this.setX(400);
        this.setY(800);
    }

    public Image getImage(){
        return this.image;
    }

}
