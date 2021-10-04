package com.example.java.model;

public class Model {
    Paddle paddle;
    Ball ball;
    Brick brick;
    int numBricks;
    public void createGamePieces(){
        paddle = new Paddle();
        ball = new Ball();
        brick = new Brick();
    }

    public Paddle getPaddle(){
        return paddle;
    }

    public Ball getBall(){return ball;}

    public Brick getBrick(){return brick;}

    public int getNumBricks(){return numBricks;}
}
