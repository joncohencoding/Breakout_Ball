package com.example.java.model;

public class Model {
    Paddle paddle;
    Ball ball;
    Brick brick;
    int numBricks;
    Brick[] brickArray;
    public void createGamePieces(){
        paddle = new Paddle();
        ball = new Ball();
        numBricks = 20;
        brickArray = new Brick[numBricks];

        //This shouldn't be here

        for(int i = 0; i <numBricks; i++){

            brick = new Brick(i);
            brickArray[i] = brick;
        }

    }

    public Paddle getPaddle(){
        return paddle;
    }

    public Ball getBall(){return ball;}

    public Brick[] getBrickArray(){return brickArray;}

    public int getNumBricks(){return numBricks;}
}
