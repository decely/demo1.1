package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label Count1;
    @FXML
    private Label Count2;
    @FXML
    private Label Count3;

    @FXML
    private TextField Field1;
    @FXML
    private TextField Field2;
    @FXML
    private TextField Field3;

    @FXML
    protected void onButton1Click() {
        double sum = Integer.valueOf(Field1.getText());
        int finsum;
        Procent count1 = new Procent();
        finsum = count1.fincount(sum,15);
        Count1.setText("Рассчёт: " + String.valueOf(finsum));
    }
    @FXML
    protected void onButton2Click() {
        double sum = Integer.valueOf(Field1.getText());
        int finsum;
        Procent count2 = new Procent();
        finsum = count2.fincount(sum,10);
        Count2.setText("Рассчёт: " + String.valueOf(finsum));
    }
    @FXML
    protected void onButton3Click() {
        double sum = Integer.valueOf(Field1.getText());
        int finsum;
        Procent count3 = new Procent();
        finsum = count3.fincount(sum,3);
        Count3.setText("Рассчёт: " + String.valueOf(finsum));
    }
}