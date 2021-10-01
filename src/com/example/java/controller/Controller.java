package com.example.java.controller;

import com.example.java.model.Model;
import com.example.java.view.View;

public class Controller {
    private Model model;
    public View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        initView();
    }



    public void initController(){

        //Add key press listeners here -> create functions for actions in controller
    }

    public void initView(){
        model.createGamePieces();
        view.initGamePieces(model.getPaddle());
        view.createFrame();

    }

}
