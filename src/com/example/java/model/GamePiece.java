package com.example.java.model;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePiece extends Model {

    private int x;
    private int y;
    private int width;
    private int height;
    private Image image;

    public int getX(){
        return x;
    }

    public void setX(int newX){
        x = newX;
    }

    public int getY(){
        return y;
    }

    public void setY(int newY){
        y = newY;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int newWidth){
        width = newWidth;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int newHeight){
        height = newHeight;
    }

    public Image getImage(){
        return image;
    }

    public void setImage(Image newImage){
        image = newImage;
    }


}
