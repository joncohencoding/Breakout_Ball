package com.example.java.model;

import java.awt.*;
import java.util.ArrayList;

public class Model {
    Paddle paddle;
    Ball ball;
    int numBricks;
    ArrayList<Brick> brickArrayList;
    public void createGamePieces(){
        paddle = new Paddle();
        ball = new Ball();
        numBricks = 20;
        brickArrayList = new ArrayList<Brick>();

        for(int i = 0; i<numBricks; i++){
            brickArrayList.add(new Brick(i));
        }

    }


    public Paddle getPaddle(){
        return paddle;
    }

    public Ball getBall(){return ball;}


    public ArrayList<Brick> getBrickArrayList(){return brickArrayList;}

}
