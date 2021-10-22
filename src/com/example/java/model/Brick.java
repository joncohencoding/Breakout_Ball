package com.example.java.model;

import java.awt.*;

public class Brick extends GamePiece{
    public Brick(int position){

        //frame height 550
        //frame width 500
        this.setX(135 + (position%4) * 52);
        this.setY(50 + (position/5) * 22);
        this.setHeight(20);
        this.setWidth(50);
        this.setColor(Color.RED);
        this.setDestroyed(false);
    }
}
