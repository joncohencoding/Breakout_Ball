package com.example.java.model;

public class Model {
    Paddle paddle;
    Ball ball;
    public void createGamePieces(){
        paddle = new Paddle();
        ball = new Ball();
    }

    public Paddle getPaddle(){
        return paddle;
    }

    public Ball getBall(){return ball;}
}
