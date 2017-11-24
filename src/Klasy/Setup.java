package Klasy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Setup {


    public void setKwadrat(GridPane setupPane){
        TextField tf = new TextField();
        setupPane.getChildren().clear();
        setupPane.add(tf,3,2);
    }
}
