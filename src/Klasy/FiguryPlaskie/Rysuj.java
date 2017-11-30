package Klasy.FiguryPlaskie;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rysuj {
    public void kwadrat(Pane drawShapePane, TextField tf_a){
        drawShapePane.getChildren().clear();
        Rectangle r = new Rectangle(Double.parseDouble(tf_a.getText()),Double.parseDouble(tf_a.getText()));

        r.setFill(null);
        r.setStroke(Color.BLACK);
        r.setStrokeWidth(2);
        r.setX(drawShapePane.getWidth()/2-r.getWidth()/2);
        r.setY(drawShapePane.getHeight()/2-r.getHeight()/2);

        drawShapePane.getChildren().add(r);
    }
    public void prostokat(Pane drawShapePane, TextField tf_a, TextField tf_b){
        drawShapePane.getChildren().clear();
        Rectangle r = new Rectangle(Double.parseDouble(tf_a.getText()),Double.parseDouble(tf_b.getText()));

        r.setFill(null);
        r.setStroke(Color.BLACK);
        r.setStrokeWidth(2);
        r.setX(drawShapePane.getWidth()/2-r.getWidth()/2);
        r.setY(drawShapePane.getHeight()/2-r.getHeight()/2);

        drawShapePane.getChildren().add(r);
    }
}
