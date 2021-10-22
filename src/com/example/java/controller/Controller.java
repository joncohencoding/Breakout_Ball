package com.example.java.controller;

import com.example.java.model.Model;
import com.example.java.view.View;

import javax.swing.*;
import java.awt.*;

public class Controller {
    private Model model;
    public View view;

    public Controller(Model model, View view) throws InterruptedException {
        this.model = model;
        this.view = view;
        initView();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    doCycle();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }});


    }


    public void initView(){
        model.createGamePieces();
        view.createFrame(model);

    }

    public void doCycle() throws InterruptedException {
        view.updateView(model);
    }

}
