package com.example.java.controller;

import com.example.java.model.Model;
import com.example.java.view.View;

import javax.swing.*;

public class Controller {
    private Model model;
    public View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        initView();

        int i = 2;
        while(i>0){
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    doCycle();
                }});
            i--;
        }
    }



    public void initController(){
    }

    public void initView(){
        model.createGamePieces();
        //view.initGamePieces(model.getPaddle());
        view.createFrame(model);

    }

    public void doCycle(){
        view.updateView(model);
    }

}
