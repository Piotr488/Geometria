package Klasy;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Setup {


    public void setKwadrat(GridPane setupPane) {
        Label lbl_a = new Label("Dlugosc boku: a");
        TextField tf_a = new TextField();
        Label lbl_b = new Label("Dlugosc boku: a");
        TextField tf_b = new TextField();
        Label lbl_c = new Label("Dlugosc boku: a");
        TextField tf_c = new TextField();

        setupPane.getChildren().clear();
        setupPane.add(lbl_a, 0, 0);
        setupPane.add(tf_a, 1, 0);

        setupPane.add(lbl_b, 2, 0);
        setupPane.add(tf_b, 3, 0);
//
//        setupPane.add(lbl_c, 2, 0);
//        setupPane.add(tf_c, 3, 0);


    }
}
