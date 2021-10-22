package com.example.java.model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Paddle extends GamePiece {
    public Paddle() {
        this.setX(225);
        this.setY(450);
        this.setHeight(10);
        this.setWidth(50);
        this.setColor(Color.GREEN);
    }


}
