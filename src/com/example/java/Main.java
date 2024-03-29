package com.example.java;

import com.example.java.controller.Controller;
import com.example.java.model.Model;
import com.example.java.view.View;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Model model = new Model();
        View view = new View();
        Controller controller  = new Controller(model, view);
    }
}
