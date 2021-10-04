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
        this.setX(400);
        this.setY(800);
        this.setHeight(10);
        this.setWidth(50);
    }


}
