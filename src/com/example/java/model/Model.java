package com.example.java.model;

public class Model {
    Paddle paddle;
    public void createGamePieces(){
        paddle = new Paddle();
    }

    public Paddle getPaddle(){
        return paddle;
    }
}
